package com.example.javierfernandez3.cambioactivity;

import android.content.Intent;
import android.view.View;

/**
 * Created by javier.fernandez3 on 15/11/2017.
 */

public class MainActivityEvents implements View.OnClickListener{

    private MainActivity mainActivity;
    public MainActivityEvents(MainActivity mainActivity){

        this.mainActivity = mainActivity;
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnPerfil){
            Intent intent = new Intent(mainActivity,segundaActivity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();
        } else if (v.getId() == R.id.btnSiguiente){
            if (DataHolder.instance.capitulo == 1){
                mainActivity.txtfCapitulos.setText(R.string.txtfCapitulo2);
                mainActivity.txtfTexto.setText(R.string.txtfTexto2);
                DataHolder.instance.capitulo++;
                mainActivity.btnAnterior.setEnabled(true);
            } else if(DataHolder.instance.capitulo == 2){
                mainActivity.txtfCapitulos.setText(R.string.txtfCapitulo3);
                mainActivity.txtfTexto.setText(R.string.txtfTexto3);
                mainActivity.btnSiguiente.setEnabled(false);
                DataHolder.instance.capitulo++;

            }
        } else if (v.getId() == R.id.btnAnterior){
            if (DataHolder.instance.capitulo == 2){
                mainActivity.txtfCapitulos.setText(R.string.txtfCapitulo1);
                mainActivity.txtfTexto.setText(R.string.txtfTexto1);
                DataHolder.instance.capitulo--;
                mainActivity.btnAnterior.setEnabled(false);
            } else if(DataHolder.instance.capitulo == 3){
                mainActivity.txtfCapitulos.setText(R.string.txtfCapitulo2);
                mainActivity.txtfTexto.setText(R.string.txtfTexto2);
                DataHolder.instance.capitulo--;
                mainActivity.btnSiguiente.setEnabled(true);
            }
        }

    }
}
