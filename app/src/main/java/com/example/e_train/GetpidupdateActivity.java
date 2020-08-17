package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetpidupdateActivity extends AppCompatActivity {

    Button p_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getpidupdate);

        p_next = findViewById(R.id.pnext);
    }

    public void onResume() {
        super.onResume();
        p_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetpidupdateActivity.this, UpdateparcelActivity.class);
                startActivity(intent);
            }
        });

    }
}