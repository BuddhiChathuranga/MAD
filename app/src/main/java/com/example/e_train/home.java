package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class home extends AppCompatActivity {


    ImageView profile,ticket_booking,parcel_booking,train_schedule,feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ticket_booking = findViewById(R.id.tickectbooking);
        parcel_booking = findViewById(R.id.parcelbooking);
        train_schedule = findViewById(R.id.trainschedule);
        feedback = findViewById(R.id.feedback);
        profile = findViewById(R.id.profile);
    }
    public void onResume() {
        super.onResume();
        ticket_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, TrainBookingActivity.class);
                startActivity(intent);
            }
        });
        parcel_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, ParcelActivity.class);
                startActivity(intent);
            }
        });
        train_schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, TrainScheduleActivity.class);
                startActivity(intent);
            }
        });
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}