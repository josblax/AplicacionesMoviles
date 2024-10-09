# Que es una interfase?

Define un conjunto de métodos que una clase debe implementar, pero no provee la funcionalidad necesaria para funcionar, piense como una estructura vacía que necesitamos implementar.

En el ejemplo abajo se muestra que la implementación del botón necesita un escuchador asociado al widget, este escuchador tiene un método llamado "onClick()" que esta vacío, como un contenedor sin funcionalidad, en este caso, tenemos las instrucciones necesarias para recibir datos, calcular una formula y devolver el resultado a nuestra interfase gráfica.

´´´Java
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
´´´
