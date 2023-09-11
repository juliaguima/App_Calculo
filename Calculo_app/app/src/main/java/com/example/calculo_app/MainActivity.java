package com.example.calculo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMudaView,btnMudaView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnMudaView = findViewById(R.id.btnMudaView);
        btnMudaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela2 = new Intent(getApplicationContext(),CalcularActivity.class);
                startActivity(tela2);
            }
        });

        btnMudaView2 = findViewById(R.id.btnMudaView2);
        btnMudaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela3 = new Intent(getApplicationContext(),imcActivity.class);
                startActivity(tela3);

            }
        });


    }
}