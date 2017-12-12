package com.jesusmtz.android.contadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mBotoncontar;
    private Button mBotonreiniciar;
    private EditText mcampoConteo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcampoConteo = (EditText) findViewById(R.id.etiqueta_conteo);
        mBotoncontar = (Button) findViewById(R.id.boton_contar);
        mBotonreiniciar = (Button) findViewById(R.id.boton_reiniciar);

        mBotoncontar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = mcampoConteo.getText().toString();
                int cont = Integer.parseInt(s);
                int r = cont + 1;
                s = String.valueOf(r);
                mcampoConteo.setText(s);
            }
        });
        mBotonreiniciar.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View v) {
                                                   mcampoConteo.setText("0");
            }
        }
        );
    }
}