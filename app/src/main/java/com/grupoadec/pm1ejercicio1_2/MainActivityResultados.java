package com.grupoadec.pm1ejercicio1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivityResultados extends AppCompatActivity {

    // declaracion de variables
    TextView textViewResultadoNombres,textViewResultadoApellidos,textViewResultadoEdad,textViewResultadoCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_resultados);

        // inicializamos variables
        textViewResultadoNombres = (TextView) findViewById(R.id.textViewResultadoNombres);
        textViewResultadoApellidos = (TextView) findViewById(R.id.textViewResultadoApellidos);
        textViewResultadoEdad = (TextView) findViewById(R.id.textViewResultadoEdad);
        textViewResultadoCorreo = (TextView) findViewById(R.id.textViewResultadoCorreo);

        try {
            String parPeNombres = getIntent().getStringExtra("peNombre");
            String parPeApellidos = getIntent().getStringExtra("peApellidos");
            String parPeEdad = getIntent().getStringExtra("peEdad");
            String parPeCorreo = getIntent().getStringExtra("peCorreo");

            textViewResultadoNombres.setText(parPeNombres);
            textViewResultadoApellidos.setText(parPeApellidos);
            textViewResultadoEdad.setText(parPeEdad);
            textViewResultadoCorreo.setText(parPeCorreo);

        }catch (Exception ex){
            ex.toString();
        }
    }
}