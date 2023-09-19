package com.example.calculo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class recebeActivity extends AppCompatActivity {

    TextView txt_completo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe);

     txt_completo = findViewById(R.id.txt_completo);
     // recebe a intent da outra  através da chave passada
            String nome = getIntent().getStringExtra("nome_recebido");
            String sobrenome = getIntent().getStringExtra("sobrenome_recebido");
            txt_completo.setText(nome + " "+ sobrenome);








    }
}