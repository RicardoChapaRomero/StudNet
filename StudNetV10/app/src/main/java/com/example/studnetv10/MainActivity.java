package com.example.studnetv10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText)findViewById(R.id.username);
        pass =(EditText)findViewById(R.id.password);
    }

    public void Ingresar(View view){
        String username = user.getText().toString();
        String password = user.getText().toString();

        if(username.length() == 0){
            Toast.makeText(this,"Username invalid",Toast.LENGTH_LONG).show();
        }
        if(password.length() == 0){
            Toast.makeText(this,"Password invalid",Toast.LENGTH_LONG).show();
        }
        if(username.length()!= 0 && username.length() != 0){
            Toast.makeText(this,"Loging...",Toast.LENGTH_LONG).show();
            Intent siguiente = new Intent(this, HomePage.class);
            startActivity(siguiente);
        }

    }


}
