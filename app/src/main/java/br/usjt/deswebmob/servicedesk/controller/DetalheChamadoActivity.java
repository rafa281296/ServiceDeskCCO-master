package br.usjt.deswebmob.servicedesk.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import br.usjt.deswebmob.servicedesk.R;

public class DetalheChamadoActivity extends AppCompatActivity {
    TextView txtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        txtNome = (TextView) findViewById(R.id.chamado_nome);
        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListarChamadosActivity.CHAMADO);
        txtNome.setText(nome);

    }
}
