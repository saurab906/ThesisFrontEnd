package com.example.loan_lending_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KYC_document extends AppCompatActivity {
    EditText edtname,edtRname,edtGname,edtDOB,edtGender,edtemail,edtphone,edtAddress;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_k_y_c_document);
        edtname=findViewById(R.id.edtname);
        edtAddress=findViewById(R.id.edtAddress);
        edtRname=findViewById(R.id.edtRname);
        edtDOB=findViewById(R.id.edtDOB);
        edtGender=findViewById(R.id.edtGender);
        edtGname=findViewById(R.id.edtGname);
        edtemail=findViewById(R.id.edtemail);
        edtphone=findViewById(R.id.edtphone);
        btnSubmit=findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KYC_document.this, Dashboard.class);
                startActivity(intent);
            }
        });


    }
}