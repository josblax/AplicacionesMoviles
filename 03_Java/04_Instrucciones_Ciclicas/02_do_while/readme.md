### La Instrucción `do...while` en Java

La instrucción `do...while` es una estructura de control de flujo que, al igual que el ciclo `while`, repite un bloque de código. Sin embargo, su principal diferencia es que **garantiza que el bloque de código se ejecute al menos una vez** antes de que la condición sea evaluada.

-----

### Definición, Sintaxis y Parámetros

El ciclo `do...while` evalúa la condición **al final** de cada iteración. Esto asegura que el código dentro del bloque `do` siempre se ejecute al menos la primera vez.

**Sintaxis Genérica:**

```java
do {
    // Código a ejecutar al menos una vez
    // y repetidamente mientras la condición sea verdadera
} while (condicion);
```

  * **Bloque `do`**: Contiene el código que se ejecutará en cada ciclo.
  * **`while (condicion)`**: La expresión booleana que se evalúa al final de cada iteración. Si es `true`, el ciclo se repite; si es `false`, el ciclo termina.

Un punto crucial es que la condición del `while` al final del ciclo debe llevar un punto y coma `;`.

-----

### Utilidad y Usos Reales Comunes

El ciclo `do...while` es especialmente útil en escenarios donde necesitas ejecutar una acción y luego, basándote en el resultado, decidir si continuar. Sus usos más comunes incluyen:

  * **Menús Interactivos**: Es perfecto para mostrar un menú de opciones a un usuario, pedir su elección y luego continuar mostrando el menú hasta que elija la opción de "salir".
  * **Validación de Entrada de Usuario**: Se utiliza para solicitar datos y asegurarse de que cumplan con ciertos criterios. La solicitud se hace una vez, y el ciclo continúa pidiendo los datos hasta que sean válidos.
  * **Generación de Datos**: Útil para generar datos o números aleatorios hasta que se cumpla una condición específica, por ejemplo, un valor dentro de un rango determinado.

-----

### Ejercicios de Dificultad Intermedia

A continuación, se presentan cinco ejercicios que utilizan la instrucción `do...while` para manipular datos y estructuras como `ArrayList`.

**Ejercicio 1: Menú de Opciones Interactivo**

Crea un menú que le pida al usuario que elija una opción (1, 2 o 3) y que se repita hasta que el usuario ingrese la opción de salir (por ejemplo, 0).

```java
import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("--- Menu de Opciones ---");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("Seleccionaste la Opcion 1.");
            } else if (opcion == 2) {
                System.out.println("Seleccionaste la Opcion 2.");
            } else if (opcion == 3) {
                System.out.println("Seleccionaste la Opcion 3.");
            } else if (opcion != 0) {
                System.out.println("Opcion no valida. Intenta de nuevo.");
            }

        } while (opcion != 0);

        System.out.println("Saliendo del programa. ¡Hasta luego!");
        scanner.close();
    }
}
```

**Ejercicio 2: Validación de un PIN Numérico**

Solicita al usuario que ingrese un PIN de 4 dígitos. El programa debe seguir pidiendo el PIN hasta que se ingrese el valor correcto (por ejemplo, `1234`).

```java
import java.util.Scanner;

public class PinValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinCorrecto = 1234;
        int pinIngresado;

        do {
            System.out.print("Ingresa tu PIN de 4 digitos: ");
            pinIngresado = scanner.nextInt();
            if (pinIngresado != pinCorrecto) {
                System.out.println("PIN incorrecto. Intenta de nuevo.");
            }
        } while (pinIngresado != pinCorrecto);

        System.out.println("PIN aceptado. Acceso concedido.");
        scanner.close();
    }
}
```

**Ejercicio 3: Búsqueda y Eliminación en un `ArrayList`**

Crea un `ArrayList` de nombres y usa un ciclo `do...while` para pedir al usuario un nombre a eliminar. El ciclo debe continuar hasta que el nombre se haya encontrado y eliminado o el usuario decida salir.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Carlos");

        Scanner scanner = new Scanner(System.in);
        String nombreABorrar;
        boolean borradoExitoso;

        do {
            System.out.println("Lista actual: " + nombres);
            System.out.print("Ingresa un nombre para borrar (o 'salir' para terminar): ");
            nombreABorrar = scanner.nextLine();
            borradoExitoso = nombres.remove(nombreABorrar);

            if (borradoExitoso) {
                System.out.println(nombreABorrar + " ha sido eliminado.");
            } else if (!nombreABorrar.equalsIgnoreCase("salir")) {
                System.out.println("El nombre no se encontro. Intenta de nuevo.");
            }

        } while (!borradoExitoso && !nombreABorrar.equalsIgnoreCase("salir"));

        System.out.println("Lista final: " + nombres);
        scanner.close();
    }
}
```

**Ejercicio 4: Generación de un Número Aleatorio Múltiplo de 7**

Genera números aleatorios entre 1 y 100 y usa un ciclo `do...while` para seguir generando números hasta que se encuentre uno que sea múltiplo de 7.

```java
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numero;

        do {
            numero = random.nextInt(100) + 1; // Genera un numero entre 1 y 100
            System.out.println("Numero generado: " + numero);
        } while (numero % 7 != 0);

        System.out.println("¡Se encontro un numero multiplo de 7: " + numero + "!");
    }
}
```

**Ejercicio 5: Ingreso de Elementos en un `ArrayList`**

Usa un ciclo `do...while` para que el usuario ingrese números en un `ArrayList`. El ciclo debe continuar pidiendo números hasta que el usuario ingrese un valor específico (por ejemplo, `-1`) para terminar.

```java
import java.util.ArrayList;
import java.util.Scanner;

public class AddElements {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;

        System.out.println("Ingresa numeros (ingresa -1 para terminar):");
        
        do {
            numeroIngresado = scanner.nextInt();
            if (numeroIngresado != -1) {
                numeros.add(numeroIngresado);
            }
        } while (numeroIngresado != -1);

        System.out.println("Numeros ingresados: " + numeros);
        scanner.close();
    }
}
```
