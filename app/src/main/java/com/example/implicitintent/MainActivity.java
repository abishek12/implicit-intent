package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDial,btnMap,btnWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMap =findViewById(R.id.btnMap);
        btnDial = findViewById(R.id.btnDial);
        btnWeb = findViewById(R.id.btnWeb);

        mapClick();
        dialClick();
        webClick();
    }

    public void mapClick(){
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q=dhungedhara"));
                startActivity(i);
            }
        });
    }

    public void dialClick(){
        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:9860162323"));
                startActivity(i);
            }
        });
    }

    public void webClick(){
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com"));
                startActivity(i);
            }
        });
    }
}
