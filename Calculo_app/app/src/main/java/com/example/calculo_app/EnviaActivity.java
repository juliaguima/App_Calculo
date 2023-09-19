package com.example.calculo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EnviaActivity extends AppCompatActivity {

    EditText nome_envia,sobrenome_envia;
    Button btn_envia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_envia);

        nome_envia = findViewById(R.id.nome_envia);
        sobrenome_envia = findViewById(R.id.sobrenome_envia);
        btn_envia = findViewById(R.id.btn_envia);

        btn_envia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //para trocar de uma tela para outra, precisamos de uma intent
                Intent intent = new Intent(EnviaActivity.this,recebeActivity.class);

                //passar uma chave para recebê-la na outra tela

                intent.putExtra("nome_recebido", nome_envia.getText().toString());
                intent.putExtra("sobrenome_recebido",sobrenome_envia.getText().toString());
                startActivity(intent);
                finish();
            }
        });






    }
}