package com.example.gojekmi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainSplash extends AppCompatActivity {
    private int loading = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(MainSplash.this, MainMenu.class);
                startActivity(main);
                finish();
            }
        }, loading);
    }
}
