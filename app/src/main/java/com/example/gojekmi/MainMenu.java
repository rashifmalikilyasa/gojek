package com.example.gojekmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity implements View.OnClickListener {

    public ImageButton btnGoFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnGoFood = (ImageButton)findViewById(R.id.gofood);
        btnGoFood.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.gofood:
                Intent goFood = new Intent(MainMenu.this, MainFood.class);
                startActivity(goFood);
                break;
            default:
                break;
        }
    }
}

