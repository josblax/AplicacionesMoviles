# Tipos de Variable

Los tipos de variable se asocian a la identidad del valor de dicha variable a lo largo del problema estas identidades se dividen en cuatro tipos básicos: numérico, texto o alfabético, lógico, carácter
___

## Enteros. Representa un número entero, son valores simples, que representan un valor numérico.

--- 

### short. Variable entera corta.

> Limite: Rango -32,768 a 32,767.

Ejemplo: 

```Java
short a = 100;
```
---

### int. Variable entera normal.

> Limite: Rango -2,147,483,648 a 2,147,483,647.

Ejemplo:

```Java
int b = 1000;
```
---

### long. Variable entera larga.

> Limite: Rango -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.

Ejemplo:

```Java
long c = 555688722;
```
---

___

## Números fraccionarios/con decimales

### float. Variable decimal con precisión simple. 

> Limite: Rango de una variable float Aproximadamente 1.2E-38 a 3.4E+38
> Precisión: 6-7 digitos

Ejemplo:

```Java
float f = 3.14f;
```
---

### double. Variable decimal con precisión doble.

> Limite: Rango de una variable float Aproximadamente 2.3E-308 a 1.7E+308
> Precisión 15-16 digitos

Ejemplo:

```Java
double g = 3.1415926535;
```
---

___

## boolean. Variable booleana que puede tener solo dos valores {falso,verdadero}.


Ejemplo:

```cplusplus
boolean llueve = true; 
boolean tiene_sombrilla = false; 
```


---

## Textos y Caracteres

### string. Es una representación de cadenas de caracteres que proporciona muchas funcionalidades útiles para manipular cadenas.

En Java, puedes trabajar con cadenas de caracteres (strings) utilizando la clase Strung



Ejemplo:

```Java
String saludo = "Hola, mundo!";
```

---

### char. Variable que almacena un solo caracter.

> Limite: uede representar caracteres desde -128 a 127 o desde 0 a 255, dependiendo de si se considera signo o no.

Ejemplo:

```Java
char letra = 'a';
char digito = '2';
char simbolo = '%';
```

---
### Array. 

Una colección de variables del mismo tipo.

Ejemplo:

```Java
// tipo_variable[] identificador = {1,2,3,4,5};

int[] miarreglo =  {1,2,3,4,5};
```

___
### ArrayList

```Java
ArrayList<TipoVariable>
```

* Es una implementación de tamaño variable de la interfaz List. Implementa todas las operaciones de lista opcionales y permite todos los elementos, incluido null. 
* Además de implementar la interfaz List, esta clase proporciona métodos para manipular el tamaño de la matriz que se usa internamente para almacenar la lista.
* Las operaciones size, isEmpty, get, set, iterator y listIterator se ejecutan en tiempo constante. La operación de adición se ejecuta en tiempo constante amortizado, es decir, la adición de n elementos requiere tiempo O(n).
* Cada instancia de ArrayList tiene una capacidad. La capacidad es el tamaño de la matriz utilizada para almacenar los elementos de la lista.
* Siempre es al menos tan grande como el tamaño de la lista. A medida que se agregan elementos a una ArrayList, su capacidad crece automáticamente.
* Los detalles de la política de crecimiento no se especifican más allá del hecho de que la adición de un elemento tiene un costo de tiempo amortizado constante.
* Una aplicación puede aumentar la capacidad de una instancia de ArrayList antes de agregar un gran número de elementos mediante la operación ensureCapacity. Esto puede reducir la cantidad de reasignación incremental.

Ejemplo:

```Java

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store Strings
        ArrayList<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Jose");
        nombres.add("Ana");
        nombres.add("Claudia");

        // Obtener un elemento del arrayList
        String name = nombres.get(1); // Get the element at index 1
        System.out.println("The name at index 1 is: " + name);
        System.out.println("Original list: " + nombres);

        // Quitar un elemento del ArrayList
        nombres.remove("Ana"); // Remove the element with the value "Ana"
        // OR: nombres.remove(1); // Remove the element at index 1
        System.out.println("List after removal: " + nombres);

        // Moverse a través del ArrayList
        System.out.println("\nIterating through the list:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}

```
# Que es una interfase?

Define un conjunto de métodos que una clase debe implementar, pero no provee la funcionalidad necesaria para funcionar, piense como una estructura vacía que necesitamos implementar.

En el ejemplo abajo se muestra que la implementación del botón necesita un escuchador asociado al widget, este escuchador tiene un método llamado "onClick()" que esta vacío, como un contenedor sin funcionalidad, en este caso, tenemos las instrucciones necesarias para recibir datos, calcular una formula y devolver el resultado a nuestra interfase gráfica.

```Java
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
```
___


# Palabra Reservada.

Son palabras usadas para escribir una gramática correcta que puede ser interpretada o compilada por la computadora para producir un resultado.

## Variables y Nombres de Variables

Los nombres de variables deben de reflejar el uso para el que es usado la variable, y para que posteriores programadores puedan comprender el código.


1. Los nombres de variables pueden ser de cualquier longitud
3. Los nombres son diferenciables en mayúsculas o minúsculas.
4. Se pueden separar las asignaciones en la misma línea mediante punto y coma.
5. Puedes usar guión bajo "_" como separador o iniciador de un nombre de una variable.
6. Todas las variables deben llevar un tipo de variable.

## No debes...

1. No iniciar el nombre con un número.
2. No usar caracteres especiales como #,!,%,$ etc...
3. No existen espacios en ningun punto del nombre de una variable.
4. No uses mayúsculas y minúsculas, asumiendo que es la misma variable.

___

