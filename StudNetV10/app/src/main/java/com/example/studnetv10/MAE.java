package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;


import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MAE extends AppCompatActivity {
      //  WebView wv1;

        private Spinner s1,s2;
        private TextView t1,t2;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_mae);

            /*wv1 = (WebView) findViewById(R.id.webvieW);
            wv1.setWebViewClient(new WebViewClient());
            wv1.loadUrl("https://dma.mty.itesm.mx/beta/registro/concentrado/concentrado.php");*/


            s1 = (Spinner) findViewById(R.id.sMateria);
            s2 = (Spinner) findViewById(R.id.sDia);
            t1 = (TextView) findViewById(R.id.textView);
            t2 = (TextView) findViewById(R.id.textView3);
            String [] OpcionesM = {"Matematicas 1","Fisica 1","Quimica","Fundamentos de la programación","Aleman","Cambio climático"};
            ArrayAdapter <String> adapterM = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,OpcionesM);
            s1.setAdapter(adapterM);

            String [] OpcionesD = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
            ArrayAdapter <String> adapterD = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,OpcionesD);
            s2.setAdapter(adapterD);
        }

        public void Aceptar (View view){
            String Seleccion = s1.getSelectedItem().toString();
            String Seleccion2 = s2.getSelectedItem().toString();

            if(Seleccion.equals("Matematicas 1") && Seleccion2.equals("Lunes")){
                t1.setText("10:30 Carlos Salazar 12:00 Raúl Muñoz");
                t2.setText("14:00 José Ramirez   17:30 Luis Garza ");
            }

            if(Seleccion.equals("Matematicas 1") && Seleccion2.equals("Martes")){
                t1.setText("11:30 Marcelo Lopez  12:00 Daniela Ortega");
                t2.setText("14:30 Diego Garza    16:30 Daniel Leal ");
            }

            if(Seleccion.equals("Fisica 1") && Seleccion2.equals("Lunes")){
                t1.setText("10:00 Mariana Rocha  12:30 Omar Montiel");
                t2.setText("14:00 Sofia Sanchez  18:30 Ricardo Castro ");
            }

            if(Seleccion.equals("Fisica 1") && Seleccion2.equals("Martes")){
                t1.setText("09:30 Alan Salcedo   11:00 Jorge Rosiles");
                t2.setText("14:00 Ana Meraz      17:30 Renata Rodriguez ");
            }
        }

        public void menu(View view){
            Intent menu = new Intent(this, menu.class);
            startActivity(menu);
        }

    }
