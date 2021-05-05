package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_10Mandamentos extends AppCompatActivity implements View.OnClickListener {
        Button btnFechar10;
        Button btnSeguir10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_10_mandamentos);

        btnFechar10=(Button)findViewById(R.id.btnFechar10);
        btnFechar10.setOnClickListener(this);

        btnSeguir10=(Button)findViewById(R.id.btnSeguir10);
        btnSeguir10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnFechar10){
            finish();
        }
        if (v==btnSeguir10){
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }
}