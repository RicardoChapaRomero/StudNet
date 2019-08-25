package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class menuComidas extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_comidas);

    }
    public void foodbox(View view){
        Intent foodbox = new Intent(this, activity_foodbox_menu.class);
        startActivity(foodbox);
    }

    public void señor(View view){
        Intent señor = new Intent(this, activity_senorlatino_menu.class);
        startActivity(señor);
    }

    public void atras(View view){
        Intent atras = new Intent(this, menu.class);
        startActivity(atras);
    }
}