package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2Mandamento extends AppCompatActivity implements View.OnClickListener {
    Button btnFechar2;
    Button btnSeguir2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela2_mandamento);

        btnFechar2 = (Button)findViewById(R.id.btnFechar2);
        btnFechar2.setOnClickListener(this);

        btnSeguir2=(Button)findViewById(R.id.btnSeguir2);
        btnSeguir2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnFechar2){
            finish();
        }
        if (v==btnSeguir2) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }
}