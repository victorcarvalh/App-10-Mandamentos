package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Tela3Mandamento extends AppCompatActivity implements View.OnClickListener {
    Button btnFechar3;
    Button btnSeguir3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela3_mandamento);
        btnFechar3 = (Button)findViewById(R.id.btnFechar3);
        btnFechar3.setOnClickListener(this);

        btnSeguir3=(Button)findViewById(R.id.btnSeguir3);
        btnSeguir3.setOnClickListener(this);
}

    @Override
    public void onClick(View v) {
        if (v == btnFechar3){
            finish();
        }

        if (v==btnSeguir3) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }}

