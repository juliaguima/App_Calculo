package com.example.calculo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class imcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imc);

        Button btn_calcula_imc;
        TextView tl_nome,tl_idade,tl_altura,tl_peso;

        tl_nome = findViewById(R.id.nome);
        tl_idade = findViewById(R.id.idade);
        tl_altura = findViewById(R.id.altura);
        tl_peso = findViewById(R.id.peso);
        btn_calcula_imc = findViewById(R.id.btn_calcula_imc);


        btn_calcula_imc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = tl_nome.getText().toString();
                Integer idade = Integer.parseInt(tl_idade.getText().toString());
                Double peso = Double.parseDouble(tl_peso.getText().toString());
                Double altura = Double.parseDouble(tl_altura.getText().toString());

                Double imc = peso/(altura * altura);

                if(imc < 18.5){
                    String situacao = "Abaixo do peso normal";
                    TextView txt_Situacao = findViewById(R.id.txt_Situacao);
                    txt_Situacao.setText("Sua situação é: " + situacao);
                }else if(imc < 24.9){
                    String situacao = "Peso Normal";
                    TextView txt_Situacao = findViewById(R.id.txt_Situacao);
                    txt_Situacao.setText("Sua situação é: " + situacao);
                 }else if(imc < 29.9){
                    String situacao = "Excesso de peso";
                    TextView txt_Situacao = findViewById(R.id.txt_Situacao);
                    txt_Situacao.setText("Sua situação é: " + situacao);
                }else if(imc < 34.9){
                    String situacao = "Obesidade classe I";
                    TextView txt_Situacao = findViewById(R.id.txt_Situacao);
                    txt_Situacao.setText("Sua situação é: " + situacao);
                }else if (imc < 39.9){
                    String situacao = "Obesidade classe II";
                    TextView txt_Situacao = findViewById(R.id.txt_Situacao);
                    txt_Situacao.setText("Sua situação é: " + situacao);
                }else{
                    String situacao = "Obesidade classe III";
                    TextView txt_Situacao = findViewById(R.id.txt_Situacao);
                    txt_Situacao.setText("Sua situação é: " + situacao);
                }


                TextView txt_IMC = findViewById(R.id.txt_IMC);
                txt_IMC.setText("Nome: " +nome+ "\nIdade:  " + idade + "\nPeso: "+peso+"\nAltura: "+altura+"\nIMC - " + Double.toString(imc) );

            }
        });



    }
}