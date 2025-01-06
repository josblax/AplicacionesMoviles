# Aplicaciones Móviles

![50%](https://progress-bar.xyz/50)
____

## Mapa de aprendizaje

```bash
├──PARTE I: Introducción
    ├── Instalación de Android Studio
        ├── Instalación de Android Studio.
        ├── Instalación del Emulador para Android Estudio.
    ├── Crear un proyecto con Android Studio
        ├── Conocer el ambiente de desarrollo integrado
        ├── Conocer la interfase de usuario de Android Studio
        ├── Conocer los diferentes componentes que se integran al desarrollo de una app
        ├── Uso de dispositivos virtuales y fisicos para crear una app.
        ├── Uso del gradle y las dependencias que se pueden integrar para el desarrollo de una app
├── PARTE II Fundamentos de Programación.
    ├── Funciones principales de un lenguaje de programación.
    ├── Que es una palabra reservada?
    ├── Estructuras de Salida.
        ├── Instrucción de Salida cout
    ├── Nombres de Variables/Identificadores
    ├── Tipos de Variables
        ├── Enteros. Signed/Unsigned. Números sin punto decimal.
            ├── Como se declaran?
            ├── Como se asignan valores desde programa?
            ├── Como se asignan valores desde consola?
            ├── Como se imprimen en consola?
            ├── short
            ├── int
            ├── long long
            ├── unsigned
        ├── Fraccionarios/Decimales. Números con punto decimal
            ├── Como se declaran?
            ├── Como se asignan valores desde programa?
            ├── Como se asignan valores desde consola?
            ├── Como se imprimen en consola?
            ├── float. 7-8 decimales de precisión.
            ├── double. 15-16 decimales de precisión.
        ├── Booleanos. Valor lógico 0,1 {true, false}
            ├── bool
            ├── función boolalpha
        ├── Textos y caracteres
            ├── Como se declaran?
            ├── Como se asignan valores desde programa?
            ├── Como se asignan valores desde consola?
            ├── Como se imprimen en consola?
            ├── Como convertir un string a número.
            ├── string
            ├── char
        ├── Contenedores
            ├── Arreglos
            ├── Clase Arreglo <array>
            ├── Vectores <vector>
                ├── Iteradores
                ├── Modificadores
        ├── Clases y Objetos
            ├── Estructuras <struct>
            ├── Clases y Objetos
                ├── Encapsulación
                ├── Herencia
                ├── Polimorfismo
├── PARTE III Decisiones
    ├── Tipos de condiciones de if..else
        ├── if simple. solamente if.
        ├── if doble. if..else
        ├── if's anidados
        ├── instrucción switch
├── PARTE IV Instrucciones Cíclicas
    ├── Instrucción for
    ├── Instrucción do..while
    ├── Instrucción while.
```


## Que es Android?

* Android es un sistema operativo de código abierto, creado por Google específicamente para su uso en dispositivos móviles (teléfonos celulares y tabletas).
* Basado en Linux (kernel 6.1)
* Puede ser programado en C y C++ pero se hace más desarrollo de aplicaciones en Java (Java accesa a bibliotecas C vía JNI (Java native Interface). Google ha seleccionado Kotlin como el lenguaje predominante para que todas las aplicaciones lo usen en el futuro.
* Soporta Bluetooth, Wi-Fi y redes 3G, 4G y 5G.

 ## Android y Java

* Después de escribir un programa en Java o Kotlin para Android, hacemos clic en un botón y nuestro código se transforma en un nuevo código, el código que entiende Android. 

* Esta otra forma se denomina **dalvik bytecode** y el proceso de transformación se denomina compilación.  

* Luego, cuando el usuario instala nuestra aplicación, el código de **dalvik bytecode** es es traducido por otro proceso conocido como Android Runtime (ART) en código máquina.

* Este es el formato de ejecución más rápido posible, bytecode se cambia a código máquina que es rápido para el dispositivo. Este proceso de compilación añade a nuestra app la optimización necesaria para la administración de batería y memoria.

* El proceso correcto es **java byte code -> dalvik bytecode**




