package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_senorlatino_menu extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senorlatino_menu);

        TextView id_lugar_sl = (TextView) findViewById(R.id.id_lugar_sl);
        TextView id_precio_sl = (TextView) findViewById(R.id.id_precio_sl);
        TextView id_descripcion_sl = (TextView) findViewById(R.id.id_descripcion_sl);

        String lugar = "Centrales - Enfrente de Panem";
        String precio = "$ : $80 - $140";
        String descripcion = "Comidas con tres B's: Bonitas, Baratas y Buenas";

        id_lugar_sl.setText(lugar);
        id_precio_sl.setText(precio);
        id_descripcion_sl.setText(descripcion);
    }
    public void atras(View view){
        Intent atras = new Intent(this, menuComidas.class);
        startActivity(atras);
    }
}
