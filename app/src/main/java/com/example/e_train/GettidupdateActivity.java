package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GettidupdateActivity extends AppCompatActivity {

    Button t_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gettidupdate);

        t_next = findViewById(R.id.fnext);
    }
    public void onResume() {
        super.onResume();
        t_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GettidupdateActivity.this, UpdateticketActivity.class);
                startActivity(intent);
            }
        });
    }
}