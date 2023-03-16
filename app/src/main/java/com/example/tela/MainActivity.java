package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener( v->{
            EditText peso = (EditText) findViewById(R.id.peso);
            String infoPeso = peso.getText().toString();

            EditText altura = (EditText) findViewById(R.id.altura);
            String infoAltura = altura.getText().toString();

            double imc = Double.parseDouble(infoPeso) / (Double.parseDouble(infoAltura) * Double.parseDouble(infoAltura));
            String infoIMC = String.valueOf(imc);

            Intent intent = new Intent(this, Tela2.class);
            intent.putExtra("info", infoIMC);
            startActivity(intent);
            finish();
        });


    }
}