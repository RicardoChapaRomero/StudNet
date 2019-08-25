package com.example.studnetv10;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Maes extends AppCompatActivity {
WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maes);

        wv1 = (WebView) findViewById(R.id.webvieW);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://dma.mty.itesm.mx/beta/registro/concentrado/concentrado.php");
    }

    public void menu(View view){
        Intent menu = new Intent(this, menu.class);
        startActivity(menu);
    }

}
