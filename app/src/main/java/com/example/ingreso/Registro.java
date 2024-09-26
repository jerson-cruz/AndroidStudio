package com.example.ingreso;

import static com.example.ingreso.R.id.input_contraseña;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    EditText inputnombre, inputApellido, inputDocumento, inputContraseña, inputConfirmarContraseña;
    Button buttonRegistrarse;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // Inicializa los campos
        inputnombre = findViewById(R.id.input_nombre);
        inputApellido = findViewById(R.id.input_apellido);
        inputDocumento = findViewById(R.id.input_documento);
        inputContraseña = findViewById(input_contraseña);
        inputConfirmarContraseña = findViewById(R.id.input_confirmar_contraseña);
        buttonRegistrarse = findViewById(R.id.button_Registrarse);



        buttonRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los datos ingresados
                String nombre = inputnombre.getText().toString();
                String apellido = inputApellido.getText().toString();
                String documento = inputDocumento.getText().toString();
                String contrasena = inputContraseña.getText().toString();
                String confirmarContrasena = inputConfirmarContraseña.getText().toString();

                // Validar que las contraseñas coincidan
                if (!contrasena.equals(confirmarContrasena)) {
                    Toast.makeText(Registro.this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Aquí puedes agregar el código para registrar al usuario en la base de datos
                // dbHelper.agregarUsuario(nombre, apellido, documento, contrasena);

                // Después de registrar al usuario, redirigir a MainActivity
                Intent intent = new Intent(Registro.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}}