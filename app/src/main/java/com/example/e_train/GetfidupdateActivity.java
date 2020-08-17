package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetfidupdateActivity extends AppCompatActivity {

    Button f_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getfidupdate);

        f_next = findViewById(R.id.fnext);
    }

    public void onResume() {
        super.onResume();
        f_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetfidupdateActivity.this, UpdatefeedbackActivity.class);
                startActivity(intent);
            }
        });
    }
}