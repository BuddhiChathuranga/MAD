package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Button probtn_1,probtn_2,probtn_3,probtn_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);


        probtn_1 = findViewById(R.id.probtn1);
        probtn_2 = findViewById(R.id.probtn2);
        probtn_3 = findViewById(R.id.probtn3);
        probtn_4 = findViewById(R.id.probtn4);
    }

    public void onResume() {
        super.onResume();
        probtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MyticketsActivity.class);
                startActivity(intent);
            }
        });
        probtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MyparcelActivity.class);
                startActivity(intent);
            }
        });
        probtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MyscheduleActivity.class);
                startActivity(intent);
            }
        });
        probtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this, MyfeedbackActivity.class);
                startActivity(intent);
            }
        });

    }
}