package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela6Mandamento extends AppCompatActivity implements View.OnClickListener {
        Button btnFechar6;
        Button btnSeguir6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela6_mandamento);

        btnFechar6=(Button)findViewById(R.id.btnFechar6);
        btnFechar6.setOnClickListener(this);

        btnSeguir6=(Button)findViewById(R.id.btnSeguir6);
        btnSeguir6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnFechar6){
            finish();
        }
        if (v==btnSeguir6) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);

        }
 }}