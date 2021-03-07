package com.gustavoh.tarefacomparaodepreo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void comparar(View view){
        EditText steam = findViewById(R.id.editTextTextPersonName2);
        EditText epic = findViewById(R.id.editTextTextPersonName);
        TextView resultado = findViewById((R.id.textView));
        int precosteam = Integer.parseInt(steam.getText().toString().replaceAll(",", ""));
        int precoepic = Integer.parseInt(epic.getText().toString().replaceAll(",", ""));
        if(precosteam >precoepic){
            resultado.setText("O melhor lugar pra comprar o jogo é a epic");
        }
        else if(precosteam < precoepic){
            resultado.setText("O melhor lugar pra comprar o jogo é a steam");
        }
    }
}