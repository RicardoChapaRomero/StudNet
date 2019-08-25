package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

public class HomePage extends AppCompatActivity {

    WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        wv1 = (WebView) findViewById(R.id.webView);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("https://tec.mx/es/noticias/nacional");

    }
    public void siguiente(View view){
        Intent siguiente = new Intent(this, menu.class);
        startActivity(siguiente);
    }
}
