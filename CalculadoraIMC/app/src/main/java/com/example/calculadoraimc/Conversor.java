package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Conversor extends AppCompatActivity {

    // Declarar variaveis:
    public EditText polegadas;
    public TextView valorPes, valorJar, valorMilh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor2);
    }
    public void btnConvertP (View v){
        double valorPoleg, pes, jardas, milhas;


        // Associação de strings / JaVa :
        polegadas = findViewById(R.id.ctxConversor);
        valorPes = findViewById(R.id.txtPes);
        valorJar = findViewById(R.id.txtJarda);
        valorMilh = findViewById(R.id.txtMilha);

        // Conversões:

        valorPoleg = Double.parseDouble(polegadas.getText().toString());
        pes = valorPoleg * 0.083;
        jardas = valorPoleg * 0.028;
        milhas = valorPoleg * 0.000016;

        valorPes.setText(this.getResources().getString(R.string.pol_para_pes) +": "+pes);
        valorJar.setText("Polegadas para Jarda : "+jardas);
        valorMilh.setText("Polegadas para Milhas : "+milhas);

        //mostrar Toast:
        Toast.makeText(Conversor.this,"Conversão bem sucedida !", Toast.LENGTH_LONG).show();

    }

    // botão sair:
    public void voltar(View v){
        Intent it = new Intent (Conversor.this, MENU.class);
        startActivity(it);
        finish();
    }
}