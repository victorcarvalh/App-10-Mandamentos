package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tela8Mandamento extends AppCompatActivity implements View.OnClickListener {
        Button btnFechar8;
        Button btnSeguir8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela8_mandamento);


        btnFechar8 = (Button)findViewById(R.id.btnFechar8);
        btnFechar8.setOnClickListener(this);

        btnSeguir8=(Button)findViewById(R.id.btnSeguir8);
        btnSeguir8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnFechar8){
            finish();
        }
        if (v==btnSeguir8) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }
}