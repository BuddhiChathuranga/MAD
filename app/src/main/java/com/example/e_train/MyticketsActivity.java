package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyticketsActivity extends AppCompatActivity {

    Button Mtbtn_1,Mtbtn_2,Mtbtn_3,Mtbtn_4,update_t,delete_t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mytickets);

        Mtbtn_1 = findViewById(R.id.probtn1);
        Mtbtn_2 = findViewById(R.id.probtn2);
        Mtbtn_3 = findViewById(R.id.probtn3);
        Mtbtn_4 = findViewById(R.id.probtn4);
        update_t = findViewById(R.id.upbtn1);
        delete_t = findViewById(R.id.dltbtn1);

    }

    public void onResume() {
        super.onResume();

        Mtbtn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyticketsActivity.this, MyticketsActivity.class);
                startActivity(intent);
            }
        });
        Mtbtn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyticketsActivity.this, MyparcelActivity.class);
                startActivity(intent);
            }
        });
        Mtbtn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyticketsActivity.this, MyscheduleActivity.class);
                startActivity(intent);
            }
        });
        Mtbtn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyticketsActivity.this, MyfeedbackActivity.class);
                startActivity(intent);
            }
        });
        update_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyticketsActivity.this, GettidupdateActivity.class);
                startActivity(intent);
            }
        });
        delete_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyticketsActivity.this, GettiddeleteActivity.class);
                startActivity(intent);
            }
        });


    }
}