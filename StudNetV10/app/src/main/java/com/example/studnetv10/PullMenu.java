package com.example.studnetv10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PullMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pullmenu);

        configureDriverButton();
        configurePoolButton();
        configureBackButton();
    }

    private void configureDriverButton() {
        ImageButton driverButton = (ImageButton) findViewById(R.id.driverButton);
        driverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PullMenu.this, DriverMapActivity.class));
            }
        });
    }

    private void configurePoolButton() {
        ImageButton poolButton = (ImageButton) findViewById(R.id.poolButton);
        poolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PullMenu.this, CustomersMapActivity.class));
            }
        });
    }

    private void configureBackButton() {
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
