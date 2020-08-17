package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyparcelActivity extends AppCompatActivity {

    Button pbtn_1,pbtn_2,pbtn_3,pbtn_4,p_dlt,p_upbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myparcel);

        pbtn_1 = findViewById(R.id.probtn1);
        pbtn_2 = findViewById(R.id.probtn2);
        pbtn_3 = findViewById(R.id.probtn3);
        pbtn_4 = findViewById(R.id.probtn4);
        p_dlt = findViewById(R.id.dltbtn2);
        p_upbtn = findViewById(R.id.pupbtn);

    }

    public void onResume() {
        super.onResume();
        pbtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyparcelActivity.this, MyticketsActivity.class);
                startActivity(intent);
            }
        });
        pbtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyparcelActivity.this, MyparcelActivity.class);
                startActivity(intent);
            }
        });
        pbtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyparcelActivity.this, MyscheduleActivity.class);
                startActivity(intent);
            }
        });
        pbtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyparcelActivity.this, MyfeedbackActivity.class);
                startActivity(intent);
            }
        });
        p_dlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyparcelActivity.this, GetpiddeleteActivity.class);
                startActivity(intent);
            }
        });
        p_upbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyparcelActivity.this, GetpidupdateActivity.class);
                startActivity(intent);
            }
        });

    }
}