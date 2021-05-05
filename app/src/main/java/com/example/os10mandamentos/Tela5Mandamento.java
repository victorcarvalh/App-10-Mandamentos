package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela5Mandamento extends AppCompatActivity implements View.OnClickListener {
    Button btnFechar5;
    Button btnSeguir5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ela5_mandamento);

        btnFechar5 = (Button)findViewById(R.id.btnFechar5);
        btnFechar5.setOnClickListener(this);

        btnSeguir5=(Button)findViewById(R.id.btnSeguir5);
        btnSeguir5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnFechar5){
            finish();
        }
        if (v==btnSeguir5) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }
}