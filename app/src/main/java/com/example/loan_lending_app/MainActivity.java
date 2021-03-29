package com.example.loan_lending_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loan_lending_app.Url.URL;
import com.example.loan_lending_app.api.SignInAPI;
import com.example.loan_lending_app.model.User;
import com.example.loan_lending_app.model.decoder;
import com.example.loan_lending_app.response.SignInResponse;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
EditText edtemail, edtpassword;
Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtemail=findViewById(R.id.edtemail);
        edtpassword=findViewById(R.id.edtpassword);
        btnLogin=findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login ();
            }
        });

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                login ();
//            }
//        });

    }
    private void StrictMode() {
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

        private void login () {
            URL.token = "Bearer ";
            SignInAPI signInAPI = URL.getInstance().create(SignInAPI.class);
            Call<SignInResponse> call = signInAPI.checkUser(edtemail.getText().toString().trim(),
                    edtpassword.getText().toString().trim());

            call.enqueue(new Callback<SignInResponse>() {
                @Override
                public void onResponse(Call<SignInResponse> call, Response<SignInResponse> response) {

                    if ((!response.isSuccessful())) {
                        Toast.makeText(MainActivity.this, "incorrect", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    URL.token += response.body().getToken();
                    User user =response.body().getUser();
                    try {
//                        String role = map.get("role");
                        if (user.getRole().equals("user")) {

                            startActivity(new Intent(MainActivity.this, Dashboard.class));
                        } else {

                            startActivity(new Intent(MainActivity.this, Registration.class));
                        }
                        //Toast.makeText(this, decoded, Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<SignInResponse> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "error" + t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
