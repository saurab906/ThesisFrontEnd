package com.example.loan_lending_app.api;

import com.example.loan_lending_app.model.SignIn;
import com.example.loan_lending_app.response.SignInResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SignInAPI {
    @POST("/user/register") //tocall
    Call<SignInResponse> registerUser(@Body SignIn signIn);
    @FormUrlEncoded
    @POST("/api/sign-in")
    Call<SignInResponse>checkUser(@Field("email") String name, @Field("password")String password);
}
