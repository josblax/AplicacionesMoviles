# Definición de un ciclo finito

* Se usa cuando se necesita ejecutar un bloque de código por un número finito de veces.
* Es una estructura de control que permite ejecutar el código a través de un contador de forma que este, se incrementa o decrementa, es decir sumando o restando.


### La Instrucción `for` en Java

La instrucción `for` es una estructura de control de flujo que se utiliza para ejecutar un bloque de código repetidamente un número específico de veces. Es ideal cuando sabes de antemano cuántas iteraciones necesitas. Su principal ventaja es que condensa el proceso de inicialización, la condición de terminación y la actualización en una sola línea, lo que hace que el código sea más legible y conciso.

-----

### Definición, Sintaxis y Parámetros

La sintaxis del bucle `for` se divide en tres partes, separadas por punto y coma `;`:

1.  **Inicialización**: Se ejecuta solo una vez al inicio del bucle. Aquí se declara e inicializa la variable de control (ej. `int i = 0`).
2.  **Condición de Terminación**: Se evalúa antes de cada iteración. Si la condición es `true`, el bucle continúa; si es `false`, el bucle termina.
3.  **Actualización**: Se ejecuta al final de cada iteración. Normalmente se usa para incrementar o decrementar la variable de control (ej. `i++`).

**Sintaxis Genérica:**

```java
for (inicialización; condición; actualización) {
    // Código a ejecutar en cada iteración
}
```

-----

### Utilidad y Usos Reales Comunes

El bucle `for` es extremadamente útil en situaciones cotidianas de programación. Sus usos más comunes incluyen:

  * **Recorrer Colecciones:** Es la herramienta perfecta para iterar sobre elementos de un `Array`, `ArrayList` o cualquier otra estructura de datos que tenga un índice.
  * **Repeticiones Fijas:** Cuando necesitas ejecutar una tarea un número predeterminado de veces, como mostrar una tabla de multiplicar del 1 al 10 o generar un menú con opciones numeradas.
  * **Procesamiento de Datos:** Para analizar o manipular datos almacenados en arreglos, como buscar un elemento específico, sumar todos los valores o encontrar el valor máximo.

-----

### Ejercicios de Dificultad Intermedia

A continuación, se presentan cinco ejercicios que utilizan la instrucción `for` para manipular arreglos, listas y `ArrayLists`.

**Ejercicio 1: Suma de Elementos Pares en un Arreglo**

Crea un `array` de enteros y usa un bucle `for` para sumar solo los elementos que son números pares. Luego, imprime el resultado.

```java
int[] numeros = {2, 5, 8, 11, 14, 17, 20};
int sumaPares = 0;

for (int i = 0; i < numeros.length; i++) {
    if (numeros[i] % 2 == 0) {
        sumaPares += numeros[i];
    }
}
System.out.println("La suma de los numeros pares es: " + sumaPares);
```

**Ejercicio 2: Contar Frecuencia de un Carácter en una Cadena**

Usa un bucle `for` para recorrer un `String` y contar cuántas veces aparece un carácter específico (por ejemplo, la letra 'a').

```java
String texto = "programacion en java";
char caracterBuscado = 'a';
int contador = 0;

for (int i = 0; i < texto.length(); i++) {
    if (texto.charAt(i) == caracterBuscado) {
        contador++;
    }
}
System.out.println("El caracter '" + caracterBuscado + "' aparece " + contador + " veces.");
```

**Ejercicio 3: Invertir los Elementos de un `ArrayList`**

Crea un `ArrayList` de `Strings` y usa un bucle `for` para invertir el orden de sus elementos sin usar métodos de la API de colecciones (`Collections.reverse`).

```java
import java.util.ArrayList;

ArrayList<String> frutas = new ArrayList<>();
frutas.add("Manzana");
frutas.add("Banana");
frutas.add("Naranja");
frutas.add("Uva");

ArrayList<String> frutasInvertidas = new ArrayList<>();

for (int i = frutas.size() - 1; i >= 0; i--) {
    frutasInvertidas.add(frutas.get(i));
}
System.out.println("ArrayList original: " + frutas);
System.out.println("ArrayList invertido: " + frutasInvertidas);
```

**Ejercicio 4: Encontrar el Elemento Más Grande en un `ArrayList`**

Recorre un `ArrayList` de enteros y encuentra el número más grande.

```java
import java.util.ArrayList;

ArrayList<Integer> numeros = new ArrayList<>();
numeros.add(45);
numeros.add(23);
numeros.add(78);
numeros.add(12);
numeros.add(99);

int maximo = numeros.get(0);

for (int i = 1; i < numeros.size(); i++) {
    if (numeros.get(i) > maximo) {
        maximo = numeros.get(i);
    }
}
System.out.println("El numero mas grande en el ArrayList es: " + maximo);
```

**Ejercicio 5: Duplicar Elementos de un `ArrayList`**

Crea un `ArrayList` de enteros y usa un bucle `for` para crear una nueva lista donde cada elemento de la lista original aparezca dos veces.

```java
import java.util.ArrayList;

ArrayList<Integer> original = new ArrayList<>();
original.add(1);
original.add(2);
original.add(3);

ArrayList<Integer> duplicada = new ArrayList<>();

for (int i = 0; i < original.size(); i++) {
    duplicada.add(original.get(i));
    duplicada.add(original.get(i));
}
System.out.println("ArrayList original: " + original);
System.out.println("ArrayList duplicado: " + duplicada);
```
