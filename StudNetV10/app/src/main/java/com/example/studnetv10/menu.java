package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void atras(View view){
        Intent atras = new Intent(this, HomePage.class);
        startActivity(atras);
    }

    public void mae(View view){
        Intent mae = new Intent(this, MAE.class);
        startActivity(mae);
    }

    public void TransporTec(View view){
        Intent TransporTec = new Intent(this, transportec.class);
        startActivity(TransporTec);
    }

    public void maps(View view){
        Intent maps = new Intent(this, maps.class);
        startActivity(maps);
    }

    public void menuComidas(View view){
        Intent menuComidas = new Intent(this, menuComidas.class);
        startActivity(menuComidas);
    }

    public void dire(View view){
        Intent dire = new Intent(this, director.class);
        startActivity(dire);
    }



}
