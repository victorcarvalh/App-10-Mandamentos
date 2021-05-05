package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela9Mandamento extends AppCompatActivity implements View.OnClickListener {
        Button btnFechar9;
        Button btnSeguir9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela9_mandamento);

        btnFechar9=(Button)findViewById(R.id.btnFechar9);
        btnFechar9.setOnClickListener(this);

        btnSeguir9=(Button)findViewById(R.id.btnSeguir9);
        btnSeguir9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnFechar9){
            finish();
        }
        if (v==btnSeguir9) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }
}