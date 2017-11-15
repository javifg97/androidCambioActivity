package com.example.javierfernandez3.cambioactivity;

import android.view.View;

/**
 * Created by javier.fernandez3 on 15/11/2017.
 */

public class segundaActivityEvents implements View.OnClickListener{

    private segundaActivity segundaActivity;

    public segundaActivityEvents(segundaActivity segundaActivity){
        this.segundaActivity = segundaActivity;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnEditar && !DataHolder.instance.isEnable){
            DataHolder.instance.isEnable = !DataHolder.instance.isEnable;

            segundaActivity.txtfNombre.setEnabled(DataHolder.instance.isEnable);
            segundaActivity.txtfEmail.setEnabled(DataHolder.instance.isEnable);
            segundaActivity.txtfTelefono.setEnabled(DataHolder.instance.isEnable);
            segundaActivity.txtfDireccion.setEnabled(DataHolder.instance.isEnable);

        }

    }
}
