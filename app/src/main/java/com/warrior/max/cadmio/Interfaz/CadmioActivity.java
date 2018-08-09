package com.warrior.max.cadmio.Interfaz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.warrior.max.cadmio.Listeners.ListenerBGuardar;
import com.warrior.max.cadmio.Listeners.ListenerBObtener;
import com.warrior.max.cadmio.R;

public class CadmioActivity extends AppCompatActivity {

    private EditText eTNombre, eTApellido, eTDni;
    private Button bGuardar, bObtener;
    private ListenerBGuardar listenerBGuardar;
    private ListenerBObtener listenerBObtener;

    public EditText geteTNombre() {
        return eTNombre;
    }

    public void seteTNombre(EditText eTNombre) {
        this.eTNombre = eTNombre;
    }

    public EditText geteTApellido() {
        return eTApellido;
    }

    public void seteTApellido(EditText eTApellido) {
        this.eTApellido = eTApellido;
    }

    public EditText geteTDni() {
        return eTDni;
    }

    public void seteTDni(EditText eTDni) {
        this.eTDni = eTDni;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadmio);

        eTNombre =findViewById(R.id.eTNombre);
        eTApellido =findViewById(R.id.eTApellido);
        eTDni = findViewById(R.id.eTDni);
        bGuardar = findViewById(R.id.bGuardar);
        bObtener = findViewById(R.id.bObtener);

        listenerBGuardar = new ListenerBGuardar(this);
        listenerBObtener = new ListenerBObtener(this);

        bGuardar.setOnClickListener(listenerBGuardar);
        bObtener.setOnClickListener(listenerBObtener);
    }
}
