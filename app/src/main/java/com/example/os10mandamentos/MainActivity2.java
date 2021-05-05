package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button btnFechar1;
    Button btnSeguir1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
            btnFechar1 = (Button)findViewById(R.id.btnFechar1);
            btnFechar1.setOnClickListener(this);

        btnSeguir1=(Button)findViewById(R.id.btnSeguir1);
        btnSeguir1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnFechar1){
            finish();
        }
        if (v==btnSeguir1) {
            Intent it = new Intent(this, TelaAgradecimentos.class);
            startActivity(it);
        }
    }
}