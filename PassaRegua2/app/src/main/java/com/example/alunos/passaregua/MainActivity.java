package com.example.alunos.passaregua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    //Define os objetos
    EditText editTotalConta;
    EditText editTotalBebida;
    EditText editTotalBebum;
    EditText editTotalNaoBebum;

    EditText editValorBebum;
    EditText editValorNaoBebum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);


        editTotalConta = (EditText) findViewById(R.id.totalConta);
        editTotalBebum = (EditText) findViewById(R.id.totalBebum);
        editTotalNaoBebum = (EditText) findViewById(R.id.totalNaoBebum);
        editTotalBebida = (EditText) findViewById(R.id.totalBebida);

        editValorBebum = (EditText) findViewById(R.id.valorBebum);

        editValorNaoBebum = (EditText) findViewById(R.id.valorNaoBebum);





    }


    public void calcularConta(View v){



        //recupera o valor presente em cada campo da tela atribuindo a variavel
        String ValorDigitadoConta = editTotalConta.getText().toString();
        //converter String em double
        double totalConta = Double.parseDouble(ValorDigitadoConta);

        //pega o valor digitado e converte para Double
        double totalBebida= Double.parseDouble(editTotalBebida.getText().toString());


        double totalBebum= Double.parseDouble(editTotalBebum.getText().toString());

        double totalNaoBebum= Double.parseDouble(editTotalNaoBebum.getText().toString());

        double valorNaoBebum = (totalConta - totalBebida)/ (totalNaoBebum + totalBebum);

        double valorBebum = (totalBebida/ totalBebum) +valorNaoBebum;





        //atribui o resultado no campo tela
        editValorBebum.setText(String.valueOf(valorBebum));
        editValorNaoBebum.setText(String.valueOf(valorNaoBebum));





    }



}
