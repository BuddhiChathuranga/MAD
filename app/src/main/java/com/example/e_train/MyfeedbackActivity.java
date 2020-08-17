package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyfeedbackActivity extends AppCompatActivity {

    Button feebtn_1,feebtn_2,feebtn_3,feebtn_4,f_upbtn,f_dltbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myfeedback);

        feebtn_1 = findViewById(R.id.probtn1);
        feebtn_2 = findViewById(R.id.probtn2);
        feebtn_3 = findViewById(R.id.probtn3);
        feebtn_4 = findViewById(R.id.probtn4);
        f_upbtn = findViewById(R.id.upbtn4);
        f_dltbtn = findViewById(R.id.dltbtn3);
    }

    public void onResume() {
        super.onResume();
        feebtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyfeedbackActivity.this, MyticketsActivity.class);
                startActivity(intent);
            }
        });
        feebtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyfeedbackActivity.this, MyparcelActivity.class);
                startActivity(intent);
            }
        });
        feebtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyfeedbackActivity.this, MyscheduleActivity.class);
                startActivity(intent);
            }
        });
        feebtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyfeedbackActivity.this, MyfeedbackActivity.class);
                startActivity(intent);
            }
        });
        f_upbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyfeedbackActivity.this, GetfidupdateActivity.class);
                startActivity(intent);
            }
        });
        f_dltbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyfeedbackActivity.this, GetfiddeleteActivity.class);
                startActivity(intent);
            }
        });

    }
}