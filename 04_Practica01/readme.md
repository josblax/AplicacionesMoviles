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

La estructura de archivos  corresponde a un proyecto básico de Android Studio en lenguaje **Java**. Vamos a explorar cada uno de los componentes y su función con ejemplos concretos.

### **Estructura del Proyecto de Android**

La estructura que se muestra es típica de un proyecto de Android y se divide en dos directorios principales: `src/` y `res/`.

  * **`src/` (Source)**: Contiene el código fuente de la aplicación. Aquí es donde se encuentran los archivos Java o Kotlin que definen la lógica y el comportamiento de la app.
  * **`res/` (Resources)**: Almacena todos los recursos no-código de la aplicación, como layouts, imágenes, cadenas de texto, iconos, etc.

-----

### **Clase `MainActivity.java`**

Dentro de `src/main/java/com/example/myapp/`, la clase `MainActivity.java` es el **punto de entrada principal** de la aplicación. Representa la pantalla inicial o la actividad principal de tu app. En esta clase, se define la lógica para la interfaz de usuario, se manejan los eventos y se interactúa con los diferentes componentes.

#### **`TextView`**

Un **`TextView`** es un elemento de interfaz de usuario (UI) que se usa para mostrar texto en la pantalla. Es un componente **estático** que solo muestra información y no es editable por el usuario.

  * **Ejemplo de uso**: Imagina una aplicación de calculadora. El **`TextView`** se usaría para mostrar el resultado de la operación. En el archivo `activity_main.xml` se vería así:
    ```xml
    <TextView
        android:id="@+id/resultTextView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="0"
        android:textSize="24sp" />
    ```

#### **`EditText`**

El **`EditText`** es un componente de UI que permite al usuario **ingresar y editar texto**. Es ideal para campos de entrada de datos como nombres de usuario, contraseñas o números.

  * **Ejemplo de uso**: En la misma calculadora, los `EditText` serían los campos donde el usuario ingresa los números a operar.
    ```xml
    <EditText
        android:id="@+id/number1EditText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Ingresa el primer número"
        android:inputType="number" />
    ```

#### **`Button`**

El **`Button`** es un componente interactivo que representa un **botón en la interfaz**. Al hacer clic en él, se desencadena una acción o un evento.

  * **Ejemplo de uso**: El botón de "Sumar" en nuestra calculadora.
    ```xml
    <Button
        android:id="@+id/addButton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sumar" />
    ```

-----

### **Manejo de Eventos y Comunicación**

#### **`interface setOnClickListener()` y `onClick()`**

Para que un `Button` haga algo al ser presionado, se debe implementar una interfaz llamada `setOnClickListener()`. Esta interfaz contiene un único método, **`onClick()`**, que es donde se define la acción a ejecutar.

  * **Ejemplo práctico**: Conectando el botón de "Sumar" con su lógica.
    ```java
    // En MainActivity.java
    public class MainActivity extends AppCompatActivity {
        // ...
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Vinculamos el botón del XML con el código Java
            Button addButton = findViewById(R.id.addButton);
            
            // Asignamos la acción al botón
            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Aquí va la lógica de lo que pasa al hacer clic
                    // Por ejemplo, sumar dos números y mostrar el resultado
                }
            });
        }
    }
    ```

#### **`findViewById()`: Vinculando XML con Java**

Para manipular los componentes definidos en el archivo XML (`activity_main.xml`) desde el código Java (`MainActivity.java`), usamos el método **`findViewById()`**. Este método "busca" un componente en la interfaz por su `id` (identificador único) y devuelve una referencia a él.

  * **Ejemplo**: La línea `Button addButton = findViewById(R.id.addButton);` es un claro ejemplo de cómo se establece esta conexión. `R.id.addButton` hace referencia al `id` que definimos en el XML.

-----

### **Manipulación de Datos**

#### **`setText()` y `getText()`**

Estos son métodos esenciales para interactuar con los datos de los componentes de la UI.

  * **`setText()`**: Se usa para **establecer o cambiar el texto** de un `TextView` o un `Button`.

  * **`getText()`**: Se usa para **obtener el texto** ingresado por el usuario en un `EditText`. El resultado de este método debe ser convertido a una cadena de texto (usando `.toString()`) para poder ser manipulado.

  * **Ejemplo combinado**:

    ```java
    // Suponiendo que ya tenemos nuestras variables
    EditText num1EditText = findViewById(R.id.number1EditText);
    EditText num2EditText = findViewById(R.id.number2EditText);
    TextView resultTextView = findViewById(R.id.resultTextView);

    addButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // 1. Obtener los números de los EditText
            String num1String = num1EditText.getText().toString();
            String num2String = num2EditText.getText().toString();

            // 2. Convertir los strings a números (ejemplo: enteros)
            int num1 = Integer.parseInt(num1String);
            int num2 = Integer.parseInt(num2String);

            // 3. Realizar la operación de suma
            int result = num1 + num2;

            // 4. Mostrar el resultado en el TextView
            resultTextView.setText(String.valueOf(result));
        }
    });
    ```

### **`res/layout/activity_main.xml`**

Este archivo es el **diseño de la interfaz de usuario**. Aquí se define visualmente cómo se verá la pantalla. Se usan "layouts" para organizar los componentes.

  * **`ConstraintLayout`**: Es un tipo de "layout" o contenedor que te permite **posicionar y dimensionar** los widgets (como `EditText`, `Button`, `TextView`) basándose en relaciones y restricciones entre ellos. Es flexible y eficiente para crear interfaces complejas y adaptables a diferentes tamaños de pantalla.

# Componentes comunmente usados en XML para todos los widgets, layouts, vector assets etc :

https://github.com/josblax/AplicacionesMoviles/tree/main/02_XML#readme

# Widgets a usar:

[Liga a widgets](https://github.com/josblax/AplicacionesMoviles/tree/main/02_XML/01_Widgets)

