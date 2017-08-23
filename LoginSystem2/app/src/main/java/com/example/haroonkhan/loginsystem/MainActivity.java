package com.example.haroonkhan.loginsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText emailField, passwordField;
    Button loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailField = (EditText) findViewById(R.id.email_field);
        passwordField = (EditText) findViewById(R.id.password_field);
        loginBtn = (Button) findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.login_btn){

            Intent intent = new Intent(this,accountDetails.class);
            intent.putExtra("Email", emailField.getText().toString());
            startActivity(intent);
        }
    }
}
