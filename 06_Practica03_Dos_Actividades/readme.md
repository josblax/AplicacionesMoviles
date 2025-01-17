# Dos Actividades

Objetivo: Conocer como crear más de una actividad en android studio. La creación de una actividad se hace en el menú 

Realice la aplicación en Android Studio, que como entrada solicite un código, y esta información sea enviada a una segunda actividad

## Como se añade una actividad?

Los menús para añadir esta segunda actividad son contextuales, tienes que estar posicionado en el menú de Java "com.example.myapplication" y usar el botón derecho del mouse para añadir una nueva actividad como se muestra en la imagen.

![image](https://github.com/user-attachments/assets/f74f20da-5597-44fa-86c9-3930b5549bdb)

Aparecerá un submenú para nombrar y establecer el lenguaje de la segunda actividad, como se muestra en la imagen abajo:

![image](https://github.com/user-attachments/assets/6c2e4bf4-2139-48a6-b372-769c6e4247c2)


## Racional:

La actividad inicial llamada MainActivy.java y activity_main.xml son añadidas inicialmente al crear un nuevo proyecto, si queremos añadir actividades subsecuentes, para el propósito que se necesite, es cuando necesitamos añadir según se mostro en las imagenes anteriores.

Esta segunda actividad creará sus propios fuentes de XML y java, como se muestra en la imagen abajo:

![image](https://github.com/user-attachments/assets/17770ec4-105a-4562-b771-b9c384eeed03)


# Elementos a Aprender

```
app/
├── src/
    ├── main/
        └── java/
            └── com/example/myapp/
                └── MainActivity.java
                    └── Intent // Clase Intent. 
                          └── intent.putExtra()
                └── segundaActividad.java
                        └── Bundle // Clase Bundle. 
                            └── getIntente().getExtras()
                            └── bundle.getStrung()                            
```

# Clase Intent

La clase Intent es una parte fundamental del sistema de mensajería de Android. Permite a los componentes de la aplicación (como actividades, servicios y receptores de difusión) comunicarse entre sí. 

## Tipos de Intents

1. **Intents Explícitos:** Especifican el componente exacto que debe manejar el intent, utilizando el nombre completo de la clase. Se usan comúnmente para iniciar una actividad o servicio dentro de tu propia aplicación.

2. **Intents Implícitos:** No especifican un componente exacto, sino que declaran una acción general a realizar, permitiendo que otros componentes de otras aplicaciones manejen el intent. Por ejemplo, puedes usar un intent implícito para accesar los permisos de la aplicación.

Ejemplo:

```
                paso = et.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                intent.putExtra("llave", paso);
                startActivity(intent);
```

# Clase Bundle

La clase Bundle es una estructura de datos que permite almacenar pares clave-valor. Es muy útil para pasar datos entre actividades, fragmentos y otros componentes de la aplicación. 

Ejemplo :

```
            Bundle bundle = getIntent().getExtras();
            if (bundle != null)
             {
                String valor = bundle.getString("llave");
             }
```
# Interface Gráfica del Usuario


Su aplicación debe contar con los siguientes elementos gráficos:

1. TextViews. Para representar las etiquetas de Entrada y Salida, en este caso será ocupada en la segunda actividad para representar la clave y en la actividad principal se usará la palabra "clave".
2. EditText. Para representar las horas y los minutos de entrada y salida.
3. Button. Para ejecutar la acción enviar la clave a la segunda actividad.

* Actividad Principal
  
<p align="center">
<img src="https://github.com/user-attachments/assets/288c6bdb-6d9f-4a10-a47d-11161b6cd92f" alt="Layout app" width="200" height="400">
</p>

* Actividad Secundaria 

<p align="center">
<img src="https://github.com/user-attachments/assets/a32526a2-c109-4345-8632-33a698134a8b" alt="Layout app" width="200" height="400">
</p>

