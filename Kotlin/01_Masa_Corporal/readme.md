Para estudiantes universitarios que ya conocen Java, la mejor manera de entender Kotlin es verlo como un lenguaje **moderno y pragmático** que se construye sobre la base de Java para solucionar sus "puntos débiles". Kotlin no es una ruptura radical, sino una evolución.

-----

### 1\. Variables y Mutabilidad

La diferencia más fundamental es el manejo de variables. Java las declara por tipo, mientras que Kotlin las divide por su **mutabilidad**, lo que reduce errores.

  * **Java**: Las variables se declaran con su tipo y pueden ser reasignadas a menos que se use `final`.

    ```java
    // Puede cambiar
    String nombre = "Juan";
    nombre = "Pedro";

    // No puede cambiar
    final String CIUDAD = "Madrid";
    ```

  * **Kotlin**: Usa las palabras clave `val` y `var`.

      * **`val`** (de *value*, valor): Declara una variable **inmutable**. Una vez asignado, su valor no puede cambiar. Es el equivalente al `final` de Java. Se prefiere su uso para evitar efectos secundarios y hacer el código más seguro.
      * **`var`** (de *variable*): Declara una variable **mutable** (que puede variar). Su valor puede ser reasignado.

    <!-- end list -->

    ```kotlin
    // Inmutable (se prefiere)
    val nombre = "Juan"
    // nombre = "Pedro" // ERROR, val no se puede reasignar

    // Mutable
    var edad = 20
    edad = 21 // Válido
    ```

#### `lateinit` y `lazy`

  * **`lateinit`**: Se usa con variables **mutables** (`var`) que no pueden ser inicializadas en el momento de su declaración, pero de las que sabes con certeza que se inicializarán **antes de su primer uso**. Es común en Android Studio para inicializar vistas en el método `onCreate`.

    ```kotlin
    // Se usa lateinit porque 'boton' se inicializa en onCreate
    private lateinit var boton: Button 

    // En onCreate:
    // boton = findViewById(R.id.miBoton)
    ```

  * **`lazy`**: Se usa con variables **inmutables** (`val`). La inicialización se retrasa hasta que la variable es accedida por primera vez. Es útil para inicializar objetos pesados de forma diferida.

    ```kotlin
    val baseDeDatos: Database by lazy {
        // Codigo que se ejecuta solo la primera vez que se accede a 'baseDeDatos'
        crearConexionADatabase() 
    }
    ```

-----

### 2\. Manejo de Nulos (Null-Safety)

Java es conocido por la `NullPointerException` (NPE). Kotlin aborda este problema directamente en su sistema de tipos, haciendo que los nulos sean explícitos.

  * **Java**: Cualquier objeto puede ser `null`, lo que requiere comprobaciones constantes.

    ```java
    // Puede causar un NullPointerException si nombre es null
    String nombre = obtenerNombre();
    if (nombre != null) {
        System.out.println(nombre.length());
    }
    ```

  * **Kotlin**: Los tipos son por defecto **no nulos**. Si un objeto puede ser `null`, debes indicarlo con un signo de interrogación `?` después del tipo.

    ```kotlin
    var texto: String = "Hola"
    // texto = null // ERROR

    var nombre: String? = "Juan" // El '?' permite que sea null
    nombre = null // Válido

    // Para acceder a metodos de un tipo nullable, se usa el operador ?.
    println(nombre?.length) // Devuelve null si nombre es null, sin fallar
    ```

-----

### 3\. Condicionales `if...else` como Expresiones

En Java, `if...else` es una **declaración** (statement); en Kotlin, es una **expresión** (expression). Esto significa que puede devolver un valor.

  * **Java**: Se usa para controlar el flujo, pero no puede asignar directamente un valor.

    ```java
    int resultado;
    if (condicion) {
        resultado = 10;
    } else {
        resultado = 20;
    }
    ```

  * **Kotlin**: El `if...else` puede asignar un valor directamente a una variable, lo que reduce la cantidad de código.

    ```kotlin
    val resultado = if (condicion) {
        10
    } else {
        20
    }
    ```

-----

### 4\. Operadores Binarios

Aunque la sintaxis es similar, el uso de operadores a nivel de bit y lógicos tiene algunas diferencias.

  * **Java**: Usa operadores especiales como `&&`, `||`, `&`, `|`, `^` para operaciones lógicas y a nivel de bits.

    ```java
    boolean a = true;
    boolean b = false;

    if (a && b) { ... } // Y lógico
    int x = 5 & 3;      // Y a nivel de bit
    ```

  * **Kotlin**:

      * Para los operadores lógicos `&&` y `||`, la sintaxis es la misma.
      * Para los operadores a nivel de bits, Kotlin usa **funciones infix** (`and`, `or`, `xor`, `shl`, `shr`, etc.) para mejorar la legibilidad.

    <!-- end list -->

    ```kotlin
    val a = true
    val b = false

    if (a && b) { ... } // Y lógico, igual que en Java

    val x = 5 and 3  // Y a nivel de bit, mas legible
    val y = 5 or 3   // O a nivel de bit
    ```

Esta tabla resume las principales diferencias entre los dos lenguajes.

| Característica | Java | Kotlin |
| :--- | :--- | :--- |
| **Mutabilidad** | `final` para inmutables | `val` (inmutable) y `var` (mutable) |
| **Nulos** | Acepta `null` por defecto (riesgo de NPE) | No nulo por defecto, `?` para permitir `null` |
| **`if...else`** | Declaración (statement) | Expresión (expression) |
| **Operadores** | Operadores especiales (ej. `&`, `|`) | Funciones infix (ej. `and`, `or`) |
| **Convenciones** | Más verboso y detallado | Más conciso y expresivo |
