package com.example.javierfernandez3.cambioactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class segundaActivity extends AppCompatActivity {

    private segundaActivityEvents events;

    public Button btnVolver;
    public Button btnEditar;

    public EditText txtfNombre;
    public EditText txtfEmail;
    public EditText txtfTelefono;
    public EditText txtfDireccion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        events = new segundaActivityEvents(this);


        btnVolver = (Button) this.findViewById(R.id.btnVolver);
        btnEditar = (Button) this.findViewById(R.id.btnEditar);

        txtfNombre = (EditText) this.findViewById(R.id.txtfNombre);
        txtfEmail = (EditText) this.findViewById(R.id.txtfEmail);
        txtfTelefono = (EditText) this.findViewById(R.id.txtfTelefono);
        txtfDireccion = (EditText) this.findViewById(R.id.txtfDireccion);


        btnEditar.setOnClickListener(events);
        btnVolver.setOnClickListener(events);

        txtfNombre.setEnabled(DataHolder.instance.isEnable);
        txtfEmail.setEnabled(DataHolder.instance.isEnable);
        txtfTelefono.setEnabled(DataHolder.instance.isEnable);
        txtfDireccion.setEnabled(DataHolder.instance.isEnable);
    }
}
