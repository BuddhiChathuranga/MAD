package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetsidupdateActivity extends AppCompatActivity {

    Button s_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getsidupdate);

        s_next = findViewById(R.id.fnext);
    }

    public void onResume() {
        super.onResume();
        s_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetsidupdateActivity.this, UpdatescheduleActivity.class);
                startActivity(intent);
            }
        });
    }
}