# Java es un lenguaje orientado a objetos.

## Clases
Las clases son estructuras que pueden ser convertidos en objetos, estas, son contenidas en paquetes. Estos paquetes pueden ser de creacion propia o de otros autores que podemoste importar y usar. Estas se usan en nuestro código fuente que es .java 

## Métodos
Lós métodos son contenedores que tienen dos componentes:

1. Atributos o propiedades. Que son los datos que albergan los objetos para las funciones para las cuales fue creada la clase. Estos llevan la declaración donde se debe indicar el tipo de dato y el nombre de la variable.
2. Métodos. Que son funciones o acciones ineherentes a lo que el objeto debe de realizar. Por ejemplo un objeto tipo automóvil tiene acciones como: acelerar, frenar, maniobrar etc.

![Que es una clase?](https://github.com/josblax/AplicacionesMoviles/blob/main/Images/Clase-2.png)

## API en Android Application Programming Interface)

Una API es una colección de reglas y protocolos que permite a diferentes aplicaciones de software comunicarse una con otra a través de packages (paquetes). Estos en escencia están compuestos por clases. Estas permiten comunicarse con otras aplicaciones, servicios o dispositivos.

Esto permite a los dispositivos ser herramientas poderosas, con las múltple bibliotecas disponibles para expandir la funcionalidad de los dispositivos móviles.

![API en android](https://github.com/josblax/AplicacionesMoviles/blob/main/Images/Package%20Android.png)

## JDK (Java Development Kit)

Es escencial para el desarrollo en Java que incluye varias herramientas:

### Principales funciones:

1. Compilar códigos en Java. JDK incluye un compilador (javac), que traduce los códigos fuentes de Java a bytecode que puedenla ser ejecutado en JVM (Java Virtual Machine)
2. Correr programas en Java. JRE (Java Runtime Environment) que incluye JVM (Java Virtual Machine) y otros componentes necesarios para correr las aplicaciones en Java.
3. Debugging (Depuración de programas en Java). (jdb), el cuál ayuda a los desarrolladores a encontrar y corregir "bugs" en sus códigos en Java.

Estas herramientas nos ayudan a craer nuestras aplicaciones de manera integral.

Adiciónalmente existen Bibliotecas que contienen API's a las que puedes llamar desde tu código fuente de Kotlin o Java. Tenga en cuenta que no todas las funciones están disponibles en Android.

Java es un lenguaje de programación de alto nivel, basado en clases y orientado a objetos, diseñado para tener el menor número posible de dependencias de implementación. Fue desarrollado por Sun Microsystems a mediados de la década de 1990 y ahora es propiedad de Oracle Corporation.

## Características principales:

* Independencia de la plataforma: el código Java se compila en código de bytes, que puede ejecutarse en cualquier máquina con la máquina virtual Java (JVM). Esto hace que Java sea un lenguaje de "escribir una vez, ejecutar en cualquier lugar".

* Orientado a objetos: Java sigue el paradigma de programación orientada a objetos, lo que permite un código modular, reutilizable y mantenible.

* Robusto y seguro: Java hace hincapié en la comprobación temprana de posibles errores, la comprobación en tiempo de ejecución y la asignación segura de memoria.

* Multithreading: Java soporta multithreading, lo que permite la ejecución simultánea de dos o más hilos para la máxima utilización de la CPU.

* Biblioteca estándar enriquecida: Java viene con una vasta biblioteca estándar que proporciona muchas utilidades para tareas comunes (por ejemplo, colecciones, manejo de entrada/salida, redes).

# Casos de uso:

* Desarrollo web: Java es ampliamente utilizado para crear aplicaciones y servicios web a gran escala (por ejemplo, utilizando marcos como Spring).

* Desarrollo móvil: Java es el lenguaje principal para el desarrollo de aplicaciones Android.

* Aplicaciones empresariales: Java es popular en el sector empresarial para crear aplicaciones empresariales escalables y robustas.

* Big Data: Java se utiliza en tecnologías de big data como Apache Hadoop.

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

___
