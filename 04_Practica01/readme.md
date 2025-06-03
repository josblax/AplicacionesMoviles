# Masa Corporal

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/mc.png" alt="Layout app" width="200" height="400">
</p>

# Elementos a Aprender

```bash
app/
├── src/
│   ├── main/
│       └── java/
│           └── com/example/myapp/
│               └── MainActivity.java
│                   └── TextView // Clase TextView
│                   └── EditText // Clase EditText
│                   └── Button // Clase Button
│                   └── interfase setOnClickListener()
│                        └── método onClick()
│                   └── findViewById // Vincular XML con Java
│                   └── setText // Desplegar resultados en Pantalla
                    └── getText // Obtener informacion de Pantalla
│
├── res/
    ├── layout/
        └── activity_main.xml
            └── ConstraintLayout
                └── EditText
                └── Button
                └── TextView
```


# Practica 1 <activity main>
Crear una aplicación que calcule la Masa Corporal, compuesto por los siguientes campos en el activity_main:

## INGRESA TU PESO
Un campo TextView que contenga Ingresa peso con los siguientes atributos:
i. Identificador llamado peso, android:id="@-+id/peso"
ii.La altura y el ancho del componente debe estar con la propiedad "wrap_content", 
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
ii. Margen Top de 20dp, 
  android:layout_marginTop="20dp"
iv. Margen Start de 20 dp, 
  android:layout_margin Start="20dp"
v.Texto que escriba : "Ingresa tu peso", 
  android:text="Ingresa tu peso"
vi. Atributo todas mayúsculas, 
  android:textAllCaps="true"
vi: Atributo olor negro, 
  android:textColor="@color/black"
viii Tamaño del texto de 20sp, 
  android:textSize="20sp"
ix. Estilo del texto "bold", 
  android:textStyle="bold"
x. Usar las restricciones necesarias para probar que el campo quede anclado correctamente al layout,
  app:layout_constraintStart_toStartOf="parent"
  app:layout_constraintTop_toTopOf="parent"



# Componentes comunmente usados en XML para todos los widgets, layouts, vector assets etc :

https://github.com/josblax/AplicacionesMoviles/tree/main/02_XML#readme

# Widgets a usar:

[Liga a widgets](https://github.com/josblax/AplicacionesMoviles/tree/main/02_XML/01_Widgets)

