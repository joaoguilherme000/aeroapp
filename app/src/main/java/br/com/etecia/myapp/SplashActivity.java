package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    //declarar uma variavel global do tipo objeto no layout

    ImageView imgLogo; // tipo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        // variavel
        imgLogo = findViewById(R.id.imgLogo);

        // criando o evento de click na imagem
        imgLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        });
    }
}