package com.example.eva2_3_stack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Adicional extends AppCompatActivity {

    //Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicional);
        //intent = new Intent(this, MainActivity.class);

    }

    public void onClick2(View v){
    //startActivity(intent);
        finish();
    }
}