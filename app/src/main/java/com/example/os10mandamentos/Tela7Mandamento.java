package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela7Mandamento extends AppCompatActivity implements View.OnClickListener {
           Button btnFechar7;
           Button btnSeguir7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela7_mandamento);
        btnFechar7=(Button)findViewById(R.id.btnFechar7);
        btnFechar7.setOnClickListener(this);

        btnSeguir7=(Button)findViewById(R.id.btnSeguir7);
        btnSeguir7.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnFechar7){
            finish();
        }
        if (v==btnSeguir7) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);

        }
    }}