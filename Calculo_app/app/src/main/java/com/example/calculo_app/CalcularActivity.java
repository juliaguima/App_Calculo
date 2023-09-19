package com.example.calculo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class CalcularActivity extends AppCompatActivity {

    Button btn_calcula;
    EditText tv_num1,tv_num2,tv_num3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        tv_num1 = findViewById(R.id.tv_num1);
        tv_num2 = findViewById(R.id.tv_num2);
        tv_num3 = findViewById(R.id.tv_num3);
        btn_calcula = findViewById(R.id.btn_calcula);



        btn_calcula.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(tv_num1.getText().toString());
                int num2 = Integer.parseInt(tv_num2.getText().toString());
                int num3 = Integer.parseInt(tv_num3.getText().toString());
                int result = num1 + num2 + num3;

                Toast.makeText(CalcularActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });;




    }
}