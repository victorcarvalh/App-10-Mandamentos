package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela4Mandamento extends AppCompatActivity implements View.OnClickListener {

    Button btnFechar4;
    Button btnSeguir4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela4_mandamento);

        btnFechar4 = (Button)findViewById(R.id.btnFechar4);
        btnFechar4.setOnClickListener(this);

        btnSeguir4=(Button)findViewById(R.id.btnSeguir4);
        btnSeguir4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnFechar4){
            finish();
        }
        if (v==btnSeguir4) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }
}