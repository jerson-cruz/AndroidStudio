package com.example.ingreso;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    TextView registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configura el evento onClick para el texto de registro

        TextView registro = findViewById(R.id.registro);


        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inicia la actividad de registro al hacer clic en el si no te haz registrado*****
                Intent intentReg = new Intent(MainActivity.this, Registro.class);  // Asegúrate que Registro es una clase válida
                MainActivity.this.startActivity(intentReg);


            }
        });


    }
}
