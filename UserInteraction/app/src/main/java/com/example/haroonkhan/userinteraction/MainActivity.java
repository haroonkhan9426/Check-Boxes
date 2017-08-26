package com.example.haroonkhan.userinteraction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
    Button showToastBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);

        showToastBtn = (Button) findViewById(R.id.showToast_btn);

        showToastBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.showToast_btn){
            StringBuilder result = new StringBuilder();
            result.append("Items Selected:");
            if(checkBox1.isChecked()){
                result.append("\nEclipse");
            }
            if(checkBox2.isChecked()){
                result.append("\nVisual Studio");
            }
            if(checkBox3.isChecked()){
                result.append("\nVisual Studio");
            }
            if(checkBox4.isChecked()){
                result.append("\nCode Blocks");
            }
            if(checkBox5.isChecked()){
                result.append("\nNetBeans");
            }

            Toast.makeText(this,result.toString(),Toast.LENGTH_LONG).show();
        }
    }
}
