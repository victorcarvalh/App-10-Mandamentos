package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnVerMais1;
    Button btnVerMais2;
    Button btnVerMais3;
    Button btnVerMais4;
    Button btnVerMais5;
    Button btnVerMais6;
    Button btnVerMais7;
    Button btnVerMais8;
    Button btnVerMais9;
    Button btnVerMais10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnVerMais1 = (Button)findViewById(R.id.btnVerMais1);
       btnVerMais1.setOnClickListener(this);

        btnVerMais2 = (Button)findViewById(R.id.btnVerMais2);
        btnVerMais2.setOnClickListener(this);

        btnVerMais3 = (Button)findViewById(R.id.btnVerMais3);
        btnVerMais3.setOnClickListener(this);

        btnVerMais4 = (Button)findViewById(R.id.btnVerMais4);
        btnVerMais4.setOnClickListener(this);

        btnVerMais5 = (Button)findViewById(R.id.btnVerMais5);
        btnVerMais5.setOnClickListener(this);

        btnVerMais6 = (Button)findViewById(R.id.btnVerMais6);
        btnVerMais6.setOnClickListener(this);

        btnVerMais7 = (Button)findViewById(R.id.btnVerMais7);
        btnVerMais7.setOnClickListener(this);

        btnVerMais8 = (Button)findViewById(R.id.btnVerMais8);
        btnVerMais8.setOnClickListener(this);

        btnVerMais9 = (Button)findViewById(R.id.btnVerMais9);
        btnVerMais9.setOnClickListener(this);

        btnVerMais10 = (Button)findViewById(R.id.btnVerMais10);
        btnVerMais10.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if (v == btnVerMais1){
            Intent it = new Intent(this, MainActivity2.class);
            startActivity(it);
        }
        if (v == btnVerMais2) {
            Intent it = new Intent(this, Tela2Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais3) {
            Intent it = new Intent(this, Tela3Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais4) {
            Intent it = new Intent(this, Tela4Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais5) {
            Intent it = new Intent(this, Tela5Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais6) {
            Intent it = new Intent(this, Tela6Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais7) {
            Intent it = new Intent(this, Tela7Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais8) {
            Intent it = new Intent(this, tela8Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais9) {
            Intent it = new Intent(this, Tela9Mandamento.class);
            startActivity(it);
        }
        if (v == btnVerMais10) {
            Intent it = new Intent(this, Tela_10Mandamentos.class);
            startActivity(it);
        }


    }
}