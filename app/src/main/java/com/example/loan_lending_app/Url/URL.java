package com.example.loan_lending_app.Url;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class URL {
    public static String token = "Bearer ";
     public static final String base_url = "http://10.0.2.2:7777";
    //public static final String base_url = "http://192.168.1.74:3001";
    public static Retrofit getInstance() {

        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
        return  retrofit;
    }

}
