package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyscheduleActivity extends AppCompatActivity {

    Button sbtn_1,sbtn_2,sbtn_3,sbtn_4,s_upbtn,s_dltbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myschedule);

        sbtn_1 = findViewById(R.id.probtn1);
        sbtn_2 = findViewById(R.id.probtn2);
        sbtn_3 = findViewById(R.id.probtn3);
        sbtn_4 = findViewById(R.id.probtn4);
        s_upbtn = findViewById(R.id.upbtn3);
        s_dltbtn = findViewById(R.id.dltbtn4);
    }

    public void onResume() {
        super.onResume();
        sbtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyscheduleActivity.this, MyticketsActivity.class);
                startActivity(intent);
            }
        });
        sbtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyscheduleActivity.this, MyparcelActivity.class);
                startActivity(intent);
            }
        });
        sbtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyscheduleActivity.this, MyscheduleActivity.class);
                startActivity(intent);
            }
        });
        sbtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyscheduleActivity.this, MyfeedbackActivity.class);
                startActivity(intent);
            }
        });
        s_upbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyscheduleActivity.this, GetsidupdateActivity.class);
                startActivity(intent);
            }
        });
        s_dltbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyscheduleActivity.this, GetsiddeleteActivity.class);
                startActivity(intent);
            }
        });

    }
}