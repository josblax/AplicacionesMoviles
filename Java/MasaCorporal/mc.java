package com.example.mc; // Nombre del Paquete que tu definiste

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
// Globales
    Button boton;
    EditText peso, estatura;
    TextView resultado;
    double pdouble, edouble, resdouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Asociando los id's del XML con tus objetos en Java
        boton = findViewById(R.id.boton);
        peso = findViewById(R.id.capturaPeso);
        estatura = findViewById(R.id.capturaEstatura);
        resultado = findViewById(R.id.res);

        // Escuchador del boton
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdouble = Double.parseDouble(peso.getText().toString().trim());
                edouble = Double.parseDouble(estatura.getText().toString().trim());
                resdouble = (pdouble/(edouble*edouble));
                resultado.setText(String.format("%.2f",resdouble));
            }
        });


    }
}
