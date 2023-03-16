package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView destino = (TextView) findViewById(R.id.destino);

        imageView = (ImageView) findViewById(R.id.imageView6);

        Intent intent = getIntent();
        String infoIMC = intent.getStringExtra("info");
        destino.setText(infoIMC);

        double imc = Double.parseDouble(infoIMC);

        if(imc < 18.5) {
            imageView.setImageResource(R.drawable.tabela1);
        } else if(imc < 25) {
            imageView.setImageResource(R.drawable.tabela2);
        } else if(imc < 30) {
            imageView.setImageResource(R.drawable.tabela3);
        } else if(imc < 35) {
            imageView.setImageResource(R.drawable.tabela4);
        } else if(imc < 40) {
            imageView.setImageResource(R.drawable.tabela5);
        } else {
            imageView.setImageResource(R.drawable.tabela6);
        }
    }
}
