package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transportec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportec);
    }
    public void atras(View view){
        Intent atras = new Intent(this, menu.class);
        startActivity(atras);
    }

    public void circuito(View view){
        Intent circuito = new Intent(this, Circuito.class);
        startActivity(circuito);
    }
    public void expreso(View view){
        Intent expreso = new Intent(this, Expreso.class);
        startActivity(expreso);
    }
}
