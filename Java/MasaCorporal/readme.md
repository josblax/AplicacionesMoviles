# Layout
<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/mc.png" alt="Layout app" width="200" height="400">
</p>


# Codigo XML

```XML
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/peso"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="20dp"
        android:text="Ingresa tu Peso"
        android:textAllCaps="true"
        android:textColor="@color/black"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/capturaPeso"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginStart="80dp"
        android:layout_marginTop="10dp"
        android:gravity="center"
        android:hint="0.00"
        android:inputType="numberDecimal"
        android:textColor="@color/black"
        app:layout_constraintStart_toEndOf="@id/peso"
        app:layout_constraintTop_toTopOf="parent" />

    <TextView
        android:id="@+id/estatura"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="30dp"
        android:text="Ingresa tu Estatura"
        android:textAllCaps="true"
        android:textColor="@color/black"
        android:textSize="20sp"
        android:textStyle="bold"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/peso" />

    <EditText
        android:id="@+id/capturaEstatura"
        android:layout_width="100dp"
        android:layout_height="50dp"
        android:layout_marginStart="30dp"
        android:layout_marginTop="10dp"
        android:gravity="center"
        android:hint="0.00"
        android:inputType="numberDecimal"
        android:textColor="@color/black"
        app:layout_constraintStart_toEndOf="@id/estatura"
        app:layout_constraintTop_toBottomOf="@id/capturaPeso" />

    <Button
        android:id="@+id/boton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="200dp"
        android:backgroundTint="@color/black"
        android:text="Calcula"
        android:textAllCaps="true"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@id/estatura" />

    <TextView
        android:id="@+id/res"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:hint="RESULTADO"
        android:textSize="25sp"
        android:layout_marginBottom="100dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent" />


</androidx.constraintlayout.widget.ConstraintLayout>
```

# Codigo en Java
```Java
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

```
