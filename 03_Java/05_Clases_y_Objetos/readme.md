## Clases
Las clases son estructuras que pueden ser convertidos en objetos, estas, son contenidas en paquetes. Estos paquetes pueden ser de creacion propia o de otros autores que podemoste importar y usar. Estas se usan en nuestro código fuente que es .java 

## Métodos
Lós métodos son contenedores que tienen dos componentes:

1. Atributos o propiedades. Que son los datos que albergan los objetos para las funciones para las cuales fue creada la clase. Estos llevan la declaración donde se debe indicar el tipo de dato y el nombre de la variable.
2. Métodos. Que son funciones o acciones ineherentes a lo que el objeto debe de realizar. Por ejemplo un objeto tipo automóvil tiene acciones como: acelerar, frenar, maniobrar etc.

![Que es una clase?](https://github.com/josblax/AplicacionesMoviles/blob/main/Images/Clase-2.png)

---

### Clases y Objetos en Java

La Programación Orientada a Objetos (POO) es un paradigma de programación que se basa en el concepto de **"objetos"**. En Java, las **clases** son la plantilla o el plano para crear objetos. Un **objeto** es una instancia de una clase; es una entidad que tiene estado (atributos) y comportamiento (métodos). 

Piénsalo así: la clase `Coche` es la plantilla que define las características generales (color, marca, modelo) y las acciones (acelerar, frenar) de un coche. Un objeto, por otro lado, sería tu coche específico: un `Coche` de color rojo, marca Tesla, modelo 3.

---

### Constructores, Getters y Setters

* **Constructores**: Son métodos especiales que se usan para inicializar un objeto. Se llaman automáticamente cuando creas una nueva instancia de una clase. Pueden tener parámetros para inicializar los atributos del objeto con valores específicos.
    * **Ejemplo**: `public Coche(String marca, String color) { ... }`

* **Getters (métodos de acceso)**: Se usan para obtener (get) el valor de los atributos de un objeto. Proporcionan un control sobre cómo se accede a los datos de la clase.
    * **Ejemplo**: `public String getMarca() { return this.marca; }`

* **Setters (métodos de mutación)**: Se usan para establecer (set) o modificar el valor de los atributos de un objeto. Permiten validar los datos antes de asignarlos, garantizando la integridad.
    * **Ejemplo**: `public void setColor(String nuevoColor) { this.color = nuevoColor; }`

---

### Interfaces

Una **interfaz** es un contrato que define un conjunto de métodos abstractos. Una clase que "implementa" una interfaz se compromete a proporcionar una implementación concreta para todos los métodos de esa interfaz. Las interfaces son clave para lograr la **abstracción** y el **polimorfismo**, permitiendo que objetos de diferentes clases sean tratados de manera uniforme si implementan la misma interfaz.

* **Ejemplo**: La interfaz `Conducible` podría tener un método `acelerar()`. Las clases `Coche` y `Moto` podrían implementar `Conducible`, y cada una proporcionaría su propia lógica para `acelerar()`.

---

### Usos Reales Comunes e Integración con Android Studio

Las clases y los objetos son el núcleo de casi toda la programación moderna, y Android Studio no es la excepción.

* **Componentes de UI**: En Android, cada elemento de la interfaz de usuario (un botón, una caja de texto, una imagen) es un objeto de una clase específica (`Button`, `TextView`, `ImageView`). Manipulas la UI llamando a métodos en estos objetos, como `myButton.setText("Hacer clic")`.
* **Actividades y Fragments**: Las `Activity` y `Fragment` son clases que representan pantallas o partes de la interfaz de tu app. Al crear una nueva pantalla, extiendes la clase `Activity` y sobrescribes sus métodos para definir el comportamiento.
* **Modelo de Datos**: Usas clases para modelar los datos de tu aplicación. Por ejemplo, una clase `Usuario` con atributos como `nombre`, `correo` y `contraseña` simplifica el manejo y la manipulación de los datos del usuario.
* **Clases de Utilidad**: Creas clases con métodos estáticos para tareas comunes, como dar formato a fechas o validar correos electrónicos, que puedes usar en toda tu aplicación sin necesidad de crear un objeto.

---

### Ejercicios de Dificultad Intermedia

#### 1. Clase `Libro` con `ArrayList` de Autores

Crea una clase `Libro` con atributos para `titulo`, `añoPublicacion`, y un `ArrayList` de `String` para los `autores`. Implementa un constructor, getters y setters, y un método para agregar un autor.

#### 2. Clase `Estudiante` y `ArrayList` de Materias

Define una clase `Estudiante` con atributos `nombre`, `edad`, y un `ArrayList` de `String` para las `materias`. Crea un constructor para inicializar el nombre y la edad, y un método `añadirMateria()`.

#### 3. Clase `Rectangulo` con Métodos

Crea una clase `Rectangulo` con atributos `ancho` y `alto`. Añade un constructor para inicializar los valores y métodos para calcular el `area()` y el `perimetro()`.

#### 4. Clase `Producto` y Arreglo de Precios

Crea una clase `Producto` con atributos `nombre` y `precios`. El atributo `precios` debe ser un arreglo de `double`. Implementa un constructor, getters y un método para calcular el precio promedio.

#### 5. Clase `Playlist` con `ArrayList` de Canciones

Crea una clase `Playlist` con un `ArrayList` de objetos `Cancion`. La clase `Cancion` debe tener atributos `titulo` y `duracion`. Implementa métodos para agregar, eliminar y listar canciones.

#### 6. Clase `CuentaBancaria` con Manejo de Transacciones

Define una clase `CuentaBancaria` con un atributo `saldo` y un `ArrayList` de `String` para registrar las `transacciones`. Implementa métodos para `depositar()`, `retirar()` y `obtenerHistorial()`.

#### 7. Clase `Vehiculo` con Herencia

Crea una clase base `Vehiculo` con atributos `marca` y `modelo`. Luego, crea una clase `Coche` que herede de `Vehiculo` y añada un atributo `puertas`.

#### 8. Interfaz `Figura` y Clases que la Implementan

Define una interfaz `Figura` con métodos `calcularArea()` y `calcularPerimetro()`. Crea las clases `Circulo` y `Cuadrado` que implementen esta interfaz, cada una con su propia lógica de cálculo.

#### 9. Clase `Inventario` con `HashMap`

Crea una clase `Inventario` que use un `HashMap<String, Integer>` para guardar el nombre del producto y su cantidad. Implementa métodos para `agregarProducto()`, `venderProducto()` y `obtenerCantidad()`.

#### 10. Clase `Catalogo` y Filtrado

Crea una clase `Catalogo` con un `ArrayList` de objetos `Producto`. Implementa un método que devuelva un nuevo `ArrayList` con todos los productos cuyo precio sea mayor a un valor dado.

---


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


