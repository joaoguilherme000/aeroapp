package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

public class MenuPrincipalActivity extends AppCompatActivity {
    MaterialCardView cardAeromodelos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);
        cardAeromodelos = findViewById(R.id.cardAeromodelos);

        cardAeromodelos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuPrincipalActivity.this, LoginActivity.class));
            }
        });
    }
}