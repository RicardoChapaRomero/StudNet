package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_foodbox_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodbox_menu);

        TextView id_lugar = (TextView) findViewById(R.id.text_location);
        TextView id_precio = (TextView) findViewById(R.id.text_price);
        TextView id_descripcion = (TextView) findViewById(R.id.text_description);


        String precio = "$$ : $120 - $180";
        String lugar = "Carreta - Enfrente de aulas 3";
        String descripcion = "Un lugar rico, donde las especialidades son las hamburguesas. Definitivamente un lugar que no tienes que probar!";

        id_precio.setText(precio);
        id_lugar.setText(lugar);
        id_descripcion.setText(descripcion);
    }
    public void atras(View view){
        Intent atras = new Intent(this, menuComidas.class);
        startActivity(atras);
    }
}
