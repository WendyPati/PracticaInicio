package com.example.practica_login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        Button boton = (Button) findViewById(R.id.Iniciar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario =((EditText) findViewById(R.id.Usuario)) .getText() .toString();
                String contrasena = ((EditText) findViewById(R.id.Contrasena)) .getText() .toString();
                if (usuario.equals("juan") && contrasena.equals("123456")){

                    Intent nuevoform = new Intent(usuario.this,secundario.class);
                    startActivity(nuevoform);


                }
                else {
                    Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT ) .show();
                }
            }
        });

    }
}