package com.example.calculo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMudaView1,btnMudaView2,btnMudaView3,btnMudaView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnMudaView1 = findViewById(R.id.btnMudaView2);
        btnMudaView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela1 = new Intent(getApplicationContext(),CalcularActivity.class);
                startActivity(tela1);
            }
        });

        btnMudaView2 = findViewById(R.id.btnMudaView2);
        btnMudaView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(getApplicationContext(),imcActivity.class);
                startActivity(tela2);

            }
        });

        btnMudaView3 = findViewById(R.id.btnMudaView3);
        btnMudaView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela3 = new Intent(getApplicationContext(),bhaskaraActivity.class);
                startActivity(tela3);

            }
        });

        btnMudaView4 = findViewById(R.id.btnMudaView4);
        btnMudaView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela4 = new Intent(getApplicationContext(),EnviaActivity.class);
                startActivity(tela4);

            }
        });


    }
}