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
        android:id="@+id/resultado"
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
        android:id="@+id/peso"
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
        android:id="@+id/boton"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Calcular" />
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

---
### Que ventajas tiene usar la interfaz en Java versus usar el método onClik en XML?

Usar la interfaz **`setOnClickListener`** en Java o Kotlin para manejar eventos de clic ofrece ventajas significativas sobre el método **`android:onClick`** en el XML. La principal ventaja es una **mejor separación de la lógica del código y el diseño de la interfaz de usuario (UI)**.

---

### **Separación de responsabilidades**

Cuando utilizas `setOnClickListener`, la **lógica de negocio** (qué sucede cuando se hace clic en el botón) se mantiene en tus archivos de código (Java/Kotlin), mientras que el archivo XML se centra exclusivamente en el **diseño y la estructura visual** de la interfaz.  Esto hace que el código sea más limpio, fácil de leer y mantener. Los diseñadores pueden trabajar en el XML y los desarrolladores en el código sin interferir en las responsabilidades del otro.

---

### **Flexibilidad y reusabilidad**

La interfaz `setOnClickListener` es mucho más flexible. Puedes asignar el mismo `listener` a **múltiples vistas** de forma programática. Por ejemplo, si tienes varios botones que realizan una acción similar, puedes compartir el mismo objeto `OnClickListener`. Esto no es fácil de lograr con `android:onClick` en el XML. Además, el enfoque de código te permite **asignar y cambiar dinámicamente** los listeners en tiempo de ejecución, lo cual es útil para interfaces de usuario dinámicas.

---

### **Seguridad y depuración**

El método `android:onClick` en el XML no es revisado por el compilador. Si cometes un error tipográfico en el nombre del método en el XML, el problema no se detectará hasta que ejecutes la aplicación, lo que podría provocar un **fallo en tiempo de ejecución**. Con `setOnClickListener`, cualquier error de referencia al código se detecta en **tiempo de compilación**, lo que te permite corregirlo antes de ejecutar la aplicación. La depuración también es más sencilla ya que puedes establecer puntos de interrupción directamente en el método `onClick()` dentro de tu código.

En resumen, aunque `android:onClick` puede parecer más sencillo para un uso rápido, la interfaz `setOnClickListener` es la **práctica estándar y recomendada** para un desarrollo robusto, escalable y mantenible.

---

#### **`findViewById()`: Vinculando XML con Java**

Para manipular los componentes definidos en el archivo XML (`activity_main.xml`) desde el código Java (`MainActivity.java`), usamos el método **`findViewById()`**. Este método "busca" un componente en la interfaz por su `id` (identificador único) y devuelve una referencia a él.

  * **Ejemplo**: La línea `Button boton = findViewById(R.id.boton);` es un claro ejemplo de cómo se establece esta conexión. `R.id.addButton` hace referencia al `id` que definimos en el XML.

La asociación entre el elemento visual que ves en tu layout (XML) y la variable que manejas en tu MainActivity.java se realiza mediante el método findViewById().

Para que esto funcione, deben ocurrir tres pasos clave en tu código Java. Aquí te muestro la estructura exacta:

1. Declarar la variable (El "contenedor")
Primero, debes crear una variable en la clase MainActivity que represente al botón. Es una referencia vacía al principio.

Ejemplo:

```Java
public class MainActivity extends AppCompatActivity {
    // Declaramos la variable del botón (fuera de los métodos)
    Button miBoton; 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // AQUÍ OCURRE LA ASOCIACIÓN (EL VÍNCULO)
        miBoton = findViewById(R.id.id_de_tu_boton_en_xml);
        
        // Ahora miBoton ya apunta al objeto real que creó el sistema
        miBoton.setOnClickListener(v -> {
            // Lógica al presionar
        });
    }
}
```

2. El puente entre XML y Java: R.id

La clave de la asociación está en el atributo android:id de tu archivo XML:

En XML: <Button android:id="@+id/btn_calcular" ... />

En Java: El sistema automáticamente crea una clase llamada R que contiene todos los IDs. Al escribir R.id.btn_calcular, le estás diciendo a Android Studio: "Busca en el archivo XML que cargué en setContentView el elemento que tiene este ID exacto".

3. ¿Cómo verificarlo en el Layout Inspector?

  Si quieres ver esta asociación mientras la app corre:

    * Abre el Main Menu>>Tools>>Layout Inspector.

    *  Haz clic sobre el botón en la vista previa del emulador.

    * En el panel de Attributes (a la derecha), verás el ID (ej. btn_calcular).

Si te fijas en la jerarquía, el sistema ya tiene ese objeto en memoria con ese ID. findViewById es simplemente el comando que le dice a Java: "Toma ese objeto que ya está en memoria y dame acceso a él a través de esta variable llamada miBoton".

Nota técnica: Si olvidas llamar a findViewById, la variable miBoton valdrá null y, al intentar hacer miBoton.setOnClickListener(...), la aplicación se cerrará inesperadamente (NullPointerException), que es el error más común en principiantes al olvidar este paso.

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

Para trabajar con **TextView** (etiquetas de texto) y **EditText** (campos de entrada) en Android Studio, debes entender que ambos heredan de la clase **View**. Mientras que el **TextView** es mayormente para mostrar información, el **EditText** es interactivo.

Aquí tienes los métodos más utilizados divididos por su funcionalidad:

1. Métodos principales de EditText
Estos son los que te permiten capturar la información que el usuario escribe, esencial para tus aplicaciones de cálculo.

* **getText()**: Es el método fundamental. Devuelve un objeto de tipo Editable. Para obtener el texto como una cadena de caracteres normal, siempre debes añadir .toString() al final.

Uso: String texto = miEditText.getText().toString();

* **setText(CharSequence text)**: Permite escribir texto en el campo desde el código Java.

Uso: miEditText.setText("Hola mundo");

**setInputType(int type)**: Define qué tipo de teclado debe mostrarse (numérico, texto, correo, etc.).

Uso: miEditText.setInputType(InputType.TYPE_CLASS_NUMBER);

* **setHint(CharSequence hint)**: Define el texto gris que aparece cuando el campo está vacío (ej. "Ingrese su peso").

* **requestFocus()**: Obliga al cursor a posicionarse dentro de este campo automáticamente.

### **`res/layout/activity_main.xml`**

Este archivo es el **diseño de la interfaz de usuario**. Aquí se define visualmente cómo se verá la pantalla. Se usan "layouts" para organizar los componentes.

  * **`ConstraintLayout`**: Es un tipo de "layout" o contenedor que te permite **posicionar y dimensionar** los widgets (como `EditText`, `Button`, `TextView`) basándose en relaciones y restricciones entre ellos. Es flexible y eficiente para crear interfaces complejas y adaptables a diferentes tamaños de pantalla.

# Componentes comunmente usados en XML para todos los widgets, layouts, vector assets etc :

https://github.com/josblax/AplicacionesMoviles/tree/main/02_XML#readme

# Widgets a usar:

[Liga a widgets](https://github.com/josblax/AplicacionesMoviles/tree/main/02_XML/01_Widgets)

