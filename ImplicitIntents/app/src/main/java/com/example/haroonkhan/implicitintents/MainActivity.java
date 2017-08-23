package com.example.haroonkhan.implicitintents;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText urlField, getLocationField, shareTextField;
    Button visitSiteBtn, getLocationBtn, shareTextBtn, takepicBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlField = (EditText) findViewById(R.id.url_field);
        getLocationField = (EditText) findViewById(R.id.sharelocation_field);
        shareTextField = (EditText) findViewById(R.id.shareText_field);

        visitSiteBtn = (Button) findViewById(R.id.url_btn);
        getLocationBtn = (Button) findViewById(R.id.shareLocation_btn);
        shareTextBtn = (Button) findViewById(R.id.shareText_btn);
        takepicBtn = (Button) findViewById(R.id.take_picture_btn);

        visitSiteBtn.setOnClickListener(this);
        getLocationBtn.setOnClickListener(this);
        shareTextBtn.setOnClickListener(this);
        takepicBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.url_btn){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlField.getText().toString()));
            startActivity(intent);

        }else if(id == R.id.shareLocation_btn){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0? q = "+ Uri.encode(getLocationField.getText().toString())));
            startActivity(intent);

        }else if(id == R.id.shareText_btn){

            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, shareTextField.getText().toString());
            sendIntent.setType("text/plan");
            startActivity(sendIntent);

        }else if(id == R.id.take_picture_btn){

            Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(takePictureIntent);

        }
    }
}
