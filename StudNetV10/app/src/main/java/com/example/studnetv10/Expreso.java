package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Expreso extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expreso);
    }
    public void atras(View view){
        Intent atras = new Intent(this, transportec.class);
        startActivity(atras);
    }
}
