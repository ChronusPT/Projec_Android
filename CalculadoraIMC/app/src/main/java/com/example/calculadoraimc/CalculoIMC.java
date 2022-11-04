package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculoIMC extends AppCompatActivity {

    public EditText peso, altura;
    public TextView valorIMC, mensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_imc);
    }
    public void btnCalculaIMC(View v){
        double valorPeso, valorAltura, imc;
        String msg;

        // associação de strings com JaVa :
        peso = findViewById(R.id.ctxPeso);
        altura = findViewById(R.id.ctxAltura);
        valorIMC = findViewById(R.id.txtIMC);
        mensagem = findViewById(R.id.txtMensagem);

        //calcular imc :
        valorPeso = Double.parseDouble(peso.getText().toString());
        valorAltura = Double.parseDouble(altura.getText().toString());
        imc = valorPeso/(valorAltura*valorAltura);

        valorIMC.setText("IMC : "+imc);

        //mostrar Toast:
        Toast.makeText(CalculoIMC.this,"IMC : "+imc, Toast.LENGTH_LONG).show();

        //avaliar condição fisica:
        if(imc<18.5) msg = "Abaixo do peso ideal.";
        else if (imc<25) msg = "Está no peso ideal.";
        else if (imc<30) msg = "está acima do peso ideal.";
        else if (imc<35) msg = "Obesidade grau I.";
        else if (imc<40) msg = "Obesidade grau II.";
        else  msg = "Obesidade grau III (Morbida).";

        //mostrar a mensagem:
        mensagem.setText(msg);
    }

    // botão sair:
    public void voltar(View v){
        Intent it = new Intent (CalculoIMC.this, MENU.class);
        startActivity(it);
        finish();
    }

}