package com.example.e_train;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Profile extends AppCompatActivity {

    Button update,show,delete;
    TextView id;
    EditText email,nic,password;
    RegJava us;
    DatabaseReference userDbRefDbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        final String verify = getIntent().getExtras().getString("Verify");

        us = new RegJava();
        show = findViewById(R.id.show);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        nic = findViewById(R.id.nic);
        id = findViewById(R.id.idd);
        update = findViewById(R.id.update);
        delete = findViewById(R.id.delete);

        userDbRefDbRef = FirebaseDatabase.getInstance().getReference().child("Users");

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database = FirebaseDatabase.getInstance();

                database.getReference("Users").orderByChild("email").equalTo(verify).addListenerForSingleValueEvent(
                        new ValueEventListener() {
                            @Override
                            public void onDataChange(DataSnapshot dataSnapshot) {
                                for (DataSnapshot data : dataSnapshot.getChildren()) {
                                    RegJava d = data.getValue(RegJava.class);
                                    String ID;
                                    ID = data.getKey().toString();

                                    id.setText(ID);
                                    email.setText(d.getEmail().toString());
                                    password.setText(d.getPassword().toString());
                                    nic.setText(d.getNIC().toString());
                                }
                            }
                            @Override
                            public void onCancelled(DatabaseError databaseError) {
                            }
                        });
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userDbRefDbRef = FirebaseDatabase.getInstance().getReference();
                userDbRefDbRef.child("Users").child(id.getText().toString()).child("email").setValue(email.getText().toString().trim());
                userDbRefDbRef.child("Users").child(id.getText().toString()).child("password").setValue(password.getText().toString().trim());
                userDbRefDbRef.child("Users").child(id.getText().toString()).child("nic").setValue(nic.getText().toString().trim());
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(TextUtils.isEmpty(email.getText().toString())){
                        Toast.makeText(getApplicationContext(),"Please Firstly Enter Email Click Show",Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(nic.getText().toString())){
                        Toast.makeText(getApplicationContext(),"Please Firstly Enter Email Click Show",Toast.LENGTH_SHORT).show();
                    }
                    else if(TextUtils.isEmpty(password.getText().toString())){
                        Toast.makeText(getApplicationContext(),"Please Firstly Enter Email Click Show",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        userDbRefDbRef = FirebaseDatabase.getInstance().getReference().child("Feedback").child(id.getText().toString());
                        userDbRefDbRef.removeValue();
                        Intent intent = new Intent(Profile.this, MainActivity.class);
                        Toast.makeText(getApplicationContext(),"Successfully Delete",Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){

                    Toast.makeText(getApplicationContext(),"Error : "+e,Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}