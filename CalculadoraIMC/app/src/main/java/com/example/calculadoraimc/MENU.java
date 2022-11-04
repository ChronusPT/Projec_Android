package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MENU extends AppCompatActivity {
    Button btnsair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnsair = findViewById(R.id.btnSair);

        btnsair.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                finish ();
            }
        });
    }

   public void vaiParaCalculoIMC(View v){
        Intent it = new Intent(MENU.this, CalculoIMC.class);
        startActivity(it);
        finish();
   }

   public void vaiParaConversor(View v){
       Intent it = new Intent(MENU.this, Conversor.class);
       startActivity(it);
       finish();
   }

}