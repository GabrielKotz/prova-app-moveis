package com.example.teste;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btnVerificar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Empresa emp = getData();
                Acao acao = calc(emp);
                toResultActivity(acao);
            }
        });
    }

    private Empresa getData (){
        EditText ativo = (EditText) findViewById(R.id.ativo);
        EditText lucro = (EditText) findViewById(R.id.lucro);
        EditText patrimonio = (EditText) findViewById(R.id.patrimonio);
        EditText acoes = (EditText) findViewById(R.id.acoes);
        EditText preco = (EditText) findViewById(R.id.preco);
        Empresa emp = new Empresa(null, 0, 0, 0, 0);

        try {
            emp.setAcoes(Long.parseLong(acoes.getText().toString()));
            emp.setAtivo(ativo.getText().toString());
            emp.setLucro(Double.parseDouble(lucro.getText().toString()));
            emp.setPatrimonio(Double.parseDouble(patrimonio.getText().toString()));
            emp.setPreco(Double.parseDouble(preco.getText().toString()));
        }catch (NumberFormatException e){
            Toast toast = Toast.makeText(getApplicationContext(), "Preencha todos os campos corretamente", Toast.LENGTH_LONG);
            toast.setMargin(0,0);
            toast.show();
        }

        return emp;
    }

    private void toResultActivity(Acao acao){
        System.out.println("teste");
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        Bundle b = new Bundle();
        b.putDouble("lpa", acao.getLpa());
        b.putDouble("pl", acao.getPl());
        b.putDouble("roe", acao.getRoe());
        b.putDouble("vpa", acao.getVpa());
        b.putDouble("pvp", acao.getPvp());

        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
    private Acao calc(Empresa emp){
        double lpa = emp.getLucro() / emp.getAcoes();
        double pl = emp.getPreco() / lpa;
        double roe = (emp.getLucro() / emp.getPatrimonio()) * 100;
        double vpa = emp.getPatrimonio() / emp.getAcoes();
        double pvp = emp.getPreco() / vpa;

        Acao acao = new Acao(lpa,pl,roe,vpa,pvp);
        return acao;
    }
}
