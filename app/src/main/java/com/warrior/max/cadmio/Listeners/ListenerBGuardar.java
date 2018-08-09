package com.warrior.max.cadmio.Listeners;

import android.view.View;
import android.content.Intent;

import com.warrior.max.cadmio.Interfaz.CadmioActivity;

public class ListenerBGuardar implements View.OnClickListener {
    CadmioActivity context;

    public ListenerBGuardar(CadmioActivity context) { //creo el CONSTRUCTOR
        this.context = context;
    }
}
