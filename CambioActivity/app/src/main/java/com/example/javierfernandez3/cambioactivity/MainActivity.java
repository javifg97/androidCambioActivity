package com.example.javierfernandez3.cambioactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private MainActivityEvents events;

    private Button btnPerfil;
    private Button btnAnterior;
    private Button btnSiguiente;

    private EditText txtfCapitulos;
    private EditText txtfTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = new MainActivityEvents(this);

        btnPerfil = (Button) this.findViewById(R.id.bntPerfil);
        btnAnterior = (Button) this.findViewById(R.id.btnAnterior);
        btnSiguiente = (Button) this.findViewById(R.id.btnSiguiente);

        txtfCapitulos = (EditText) this.findViewById(R.id.txtfCapitulos);
        txtfTexto = (EditText) this.findViewById(R.id.txtfTexto);


        btnPerfil.setOnClickListener(events);
        btnAnterior.setOnClickListener(events);
        btnSiguiente.setOnClickListener(events);
    }
}
