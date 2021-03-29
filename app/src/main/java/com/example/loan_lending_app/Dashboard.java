package com.example.loan_lending_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Dashboard extends AppCompatActivity {
    ImageView Profile, Setting,bankTransfer,Enquiry,Statement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Profile=findViewById(R.id.Profile);
        Setting=findViewById(R.id.Setting);
        bankTransfer=findViewById(R.id.bankTransfer);
        Enquiry=findViewById(R.id.Enquiry);
        Statement=findViewById(R.id.Statement);


        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent = new Intent(Dashboard.this, KYC_document.class);
                 startActivity(intent);
            }
        });


        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bankTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Enquiry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        Statement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}