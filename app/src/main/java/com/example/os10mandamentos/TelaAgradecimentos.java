package com.example.os10mandamentos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaAgradecimentos extends AppCompatActivity implements View.OnClickListener {
    private ImageView btnInsta;
            ImageView btnFace;
            ImageView btnYtb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_agradecimentos);

        btnInsta = (ImageView) findViewById(R.id.imgInsta);
        btnInsta.setOnClickListener(this);

        btnFace = (ImageView) findViewById(R.id.imgFace);
        btnFace.setOnClickListener(this);

        btnYtb = (ImageView) findViewById(R.id.imgYtb);
        btnYtb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnInsta){
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/aplicativodabiblia/")));
        }
        if(v==btnFace) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/AplicativoDaBiblia")));
        }
        if(v==btnYtb) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCvhXF7cEsbjTIaPOZNJb4Rg")));
        }
    }
}