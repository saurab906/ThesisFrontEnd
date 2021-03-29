package com.example.loan_lending_app.model;

import com.example.loan_lending_app.Url.URL;
import com.example.loan_lending_app.api.SignInAPI;
import com.example.loan_lending_app.response.SignInResponse;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;

public class SignIn {

    public SignInResponse login(String email,String password) {
       SignInAPI signInAPI = URL.getInstance().create(SignInAPI.class);
        Call<SignInResponse> call = signInAPI.checkUser(email,password);

        try {
            Response<SignInResponse> response = call.execute();
            if (response.code() == 200) {
                return response.body();
            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
