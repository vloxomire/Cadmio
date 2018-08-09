package com.warrior.max.cadmio.Listeners;

import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import com.warrior.max.cadmio.Interfaz.CadmioActivity;

public class ListenerBGuardar implements View.OnClickListener {
    CadmioActivity context;

    public ListenerBGuardar(CadmioActivity context) { //creo el CONSTRUCTOR
        this.context = context;
    }

    @Override
    public void onClick(View view) {    //creo el Metodo onClick del boton Guardar(EVENTO)
        Boolean crear = true;   //la variable crear es true

        if(context.geteTNombre().getText().toString().equals("")){  //pregunto si es igual a vacio
            Toast.makeText(context,"FALTA APELLIDO",Toast.LENGTH_LONG).show();  //genero un mensaje Toast
            crear = false;  //la variable crear se vuelve falsa y retorna al principio del metodo
        }
        if (context.geteTApellido().getText().toString().equals("")){
            Toast.makeText(context,"FALTA NOMBRE",Toast.LENGTH_SHORT).show();
            crear = false;
        }
        if (context.geteTDni().getText().toString().equals("")){
            Toast.makeText(context,"FALTA DNI",Toast.LENGTH_LONG).show();
            crear = false;
        }
    }
}
