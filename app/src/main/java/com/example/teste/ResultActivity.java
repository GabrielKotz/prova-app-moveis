package com.example.teste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setData();
    }

    private void setData(){
        Bundle b = getIntent().getExtras();
        double lpa = b.getDouble("lpa");
        double pl = b.getDouble("pl");
        double roe = b.getDouble("roe");
        double vpa = b.getDouble("vpa");
        double pvp = b.getDouble("pvp");

        TextView txtLpa = (TextView) findViewById(R.id.lpa);
        TextView txtPl = (TextView) findViewById(R.id.pl);
        TextView txtRoe = (TextView) findViewById(R.id.roe);
        TextView txtVpa = (TextView) findViewById(R.id.vpa);
        TextView txtPvp = (TextView) findViewById(R.id.pvp);

        txtLpa.setText("R$ " +lpa);
        txtPl.setText("R$ " +pl);
        txtPvp.setText("R$ " +pvp);
        txtRoe.setText("R$ " +roe);
        txtVpa.setText("R$ " +vpa);

    }
}
