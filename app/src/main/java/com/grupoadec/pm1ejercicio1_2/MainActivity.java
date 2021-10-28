package com.grupoadec.pm1ejercicio1_2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaracion de variables
    EditText editTextNombres, editTextApellidos,editTextEdad,editTextCorreo;
    Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // inicializamos las variables
        editTextNombres = (EditText) findViewById(R.id.editTextNombres);
        editTextApellidos = (EditText) findViewById(R.id.editTextApellidos);
        editTextEdad = (EditText) findViewById(R.id.editTextEdad);
        editTextCorreo = (EditText) findViewById(R.id.editTextCorreo);
        buttonEnviar = (Button) findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivityResultados.class);

                if(editTextNombres.getText().length()>0 && editTextApellidos.getText().length()>0 && editTextEdad.getText().length()>0 && editTextCorreo.getText().length()>0){
                    try {
                        intent.putExtra("peNombre", editTextNombres.getText().toString());
                        intent.putExtra("peApellidos", editTextApellidos.getText().toString());
                        intent.putExtra("peEdad", editTextEdad.getText().toString());
                        intent.putExtra("peCorreo", editTextCorreo.getText().toString());

                        startActivity(intent);
                    }catch (Exception ex){
                        ex.toString();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"Ningún campo puede estar vacío", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}