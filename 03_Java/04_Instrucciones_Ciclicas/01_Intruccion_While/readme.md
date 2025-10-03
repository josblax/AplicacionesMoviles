### La Instrucción `while` en Java

La instrucción `while` es una estructura de control de flujo que se utiliza para ejecutar repetidamente un bloque de código **mientras una condición específica sea verdadera**. A diferencia del ciclo `for`, que es ideal para un número conocido de iteraciones, el ciclo `while` es perfecto cuando no sabes de antemano cuántas veces se debe repetir el bucle.

-----

### Definición, Sintaxis y Parámetros

El ciclo `while` tiene una sintaxis muy simple: consta de la palabra clave `while`, seguida de una condición entre paréntesis. El ciclo de código dentro de las llaves `{}` se ejecutará de manera continua mientras la condición se mantenga como `true`.

**Sintaxis Genérica:**

```java
while (condicion) {
    // Código a ejecutar mientras la condición sea verdadera
}
```

  * **Condición**: Es una expresión booleana que se evalúa al inicio de cada iteración. Si la condición es `true`, el ciclo continúa. Si es `false`, el ciclo termina y el programa sigue con la siguiente instrucción.

Es crucial que dentro del cuerpo del ciclo, alguna instrucción **cambie el estado de la condición** para que eventualmente se vuelva falsa. Si no lo hace, el ciclo se ejecutará indefinidamente, creando un **bucle infinito**.

-----

### Utilidad y Usos Reales Comunes

El ciclo `while` es útil en situaciones donde el número de repeticiones es indeterminado y depende de un evento externo o de un cambio de estado. Sus usos más comunes incluyen:

  * **Lectura de Entrada de Usuario**: Se puede usar para seguir pidiendo al usuario que ingrese datos hasta que se cumpla una condición, como ingresar un número válido o una palabra clave para salir.
  * **Procesamiento de Flujos de Datos**: Ideal para leer datos de un archivo o de una conexión de red, donde no se conoce el tamaño total de los datos. El ciclo continúa mientras haya más información para leer.
  * **Validación de Datos**: Útil para asegurarse de que un usuario ingrese un valor dentro de un rango específico, repitiendo la pregunta hasta que la entrada sea correcta.

-----

### Ejercicios de Dificultad Intermedia

A continuación, se presentan cinco ejercicios que utilizan la instrucción `while` para manipular arreglos, listas y `ArrayLists`.

**Ejercicio 1: Búsqueda de un Elemento en un Arreglo**

Busca un número específico en un `array` de enteros. Usa un ciclo `while` que termine tan pronto como encuentre el elemento.

```java
int[] numeros = {10, 20, 30, 40, 50};
int objetivo = 30;
int i = 0;
boolean encontrado = false;

while (i < numeros.length && !encontrado) {
    if (numeros[i] == objetivo) {
        encontrado = true;
    }
    i++;
}

if (encontrado) {
    System.out.println("El numero " + objetivo + " fue encontrado en el arreglo.");
} else {
    System.out.println("El numero " + objetivo + " no fue encontrado.");
}
```

**Ejercicio 2: Eliminar Elementos de una Lista hasta que esté Vacía**

Elimina elementos de un `ArrayList` uno por uno usando un ciclo `while` hasta que la lista quede completamente vacía.

```java
import java.util.ArrayList;

ArrayList<String> tareas = new ArrayList<>();
tareas.add("Comprar leche");
tareas.add("Lavar el coche");
tareas.add("Pagar facturas");

while (!tareas.isEmpty()) {
    String tareaCompletada = tareas.remove(0);
    System.out.println("Tarea completada: " + tareaCompletada);
}

System.out.println("¡Todas las tareas han sido completadas!");
```

**Ejercicio 3: Suma Acumulada hasta un Límite**

Usa un ciclo `while` para sumar los números de un `ArrayList` hasta que la suma total supere un valor específico (por ejemplo, 50).

```java
import java.util.ArrayList;

ArrayList<Integer> valores = new ArrayList<>();
valores.add(10);
valores.add(15);
valores.add(5);
valores.add(25);
valores.add(30);

int suma = 0;
int indice = 0;
int limite = 50;

while (suma <= limite && indice < valores.size()) {
    suma += valores.get(indice);
    indice++;
}

System.out.println("La suma acumulada es: " + suma);
System.out.println("Se detuvo en el indice: " + (indice - 1));
```

**Ejercicio 4: Llenar un `ArrayList` con Entrada del Usuario**

Pide al usuario que ingrese números para un `ArrayList` hasta que ingrese un número negativo.

```java
import java.util.ArrayList;
import java.util.Scanner;

ArrayList<Integer> numeros = new ArrayList<>();
Scanner scanner = new Scanner(System.in);
int numero;

System.out.println("Ingresa numeros (un numero negativo para terminar):");
numero = scanner.nextInt();

while (numero >= 0) {
    numeros.add(numero);
    numero = scanner.nextInt();
}

System.out.println("Los numeros ingresados son: " + numeros);
scanner.close();
```

**Ejercicio 5: Proceso de Descarga con Progreso**

Simula un proceso de descarga en el que una variable `porcentaje` aumenta en cada iteración hasta que llega al 100%.

```java
int porcentaje = 0;

while (porcentaje <= 100) {
    System.out.println("Descargando... " + porcentaje + "%");
    // Simula un proceso de carga o de descarga
    porcentaje += 10;
    
    try {
        // Pausa la ejecución para ver el progreso
        Thread.sleep(500);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}
System.out.println("¡Descarga completa!");
```
