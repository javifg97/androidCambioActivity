package com.example.javierfernandez3.cambioactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class segundaActivity extends AppCompatActivity {

    private segundaActivityEvents events;

    private Button btnVolver;
    private Button btnEditar;

    private EditText txtfNombre;
    private EditText txtfEmail;
    private EditText txtfTelefono;
    private EditText txtfDireccion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        events = new segundaActivityEvents(this);
    }
}
