package com.example.haroonkhan.loginsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class accountDetails extends AppCompatActivity {

    TextView emailField, nameField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_details);

        emailField = (TextView) findViewById(R.id.email_field);
        nameField = (TextView) findViewById(R.id.name_field);

        Intent intent = getIntent();
        String email = intent.getStringExtra("Email");
        emailField.setText(email);
        nameField.setText("Haroon khan");

    }
}
