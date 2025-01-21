# Aplicaciones Móviles

![50%](https://progress-bar.xyz/50)
____

## Creditos & Disclaimer de algunas imagenes usadas en esta sección usadas bajo permiso explicito de Google 

[*Shared by Open Source Project*](http://code.google.com/policies.html)
___
## Mapa de aprendizaje

```bash
├──PARTE I: Introducción
    └── Instalación de Android Studio
        ├── Instalación de Android Studio.
        ├── Instalación del Emulador para Android Estudio.
        ├── Fundamentos de una app
        ├── Componentes generales de una aplicación
        ├── Que es una actividad?
        ├── Que es una API?
        ├── Java y Kotlin son lenguajes orientados a objetos
        └── Como trabajan Java y Android juntos
├── PARTE II Crear un proyecto en Android Studio
    ├── Preeliminar para crear un proyecto con Android Studio
        ├── Conocer el ambiente de desarrollo integrado
        ├── Conocer la interfase de usuario de Android Studio
        ├── Conocer los diferentes componentes que se integran al desarrollo de una app
        ├── Uso de dispositivos virtuales y fisicos para crear una app.
        └── Uso del gradle y las dependencias que se pueden integrar para el desarrollo de una app
    ├── Creacion de un proyecto basado en XML y Java.
        ├── Tipo de Actividad (Empty Views Activity)
        ├── Seleccion de Nombre del Proyecto, Lenguaje y SDK.
        └── Interfase de Usuario
            └── Arbol del Proyecto.
                └── Folder manifests
                    └── Android Manifests
                └── Folder Java
                    └── main Java folder
                        └── MainActiivity.java!
                    ├── androidTest folder
                    └── test folder
                ├── res folder
                    ├── drawable folder
                    └── layout folder
                        └── activity_main.xml!
                    ├── mipmap folder
                    ├── values folder
                    └── xml folder
            ├── Gradle Scripts
                ├── build.gradle.kts (Project)
                └── build.gradle.kts (Module:app)
├── PARTE III XML
    ├── activity_main.xml
        ├── layouts
                ├── constraint layout!
                ├── linear layout
                ├── relative layout
                ├── table layout
                ├── FrameLayout
                ├── grid layout
        ├── Text widgets
            ├── TextView!
            └── EditText
        ├── Button widgets
            ├── Button
            └── ImageButton
        ├── Image Widgets
            └── ImageView!
        ├── Input Widgets
            ├── CheckBox
            ├── RadioButton
            └── Switch
        ├── Progress Widgets
            └── ProgressBar
├── Parte IV Java (Instrucciones Comunes)
    ├── Tipos basicos de variables
        ├── Enteros: byte, short, int, long
        ├── Fraccionarios: float, double
        ├── Texto: char, String
        └── Boleanos: boolean
    ├── Tipos no basicos de estructuras
        ├── String
        ├── Arrays (arreglos)
        ├── ArrayList (Lista de arreglos)
        ├── Class (clase)
        └── Interface (interfases)    
├── Parte V Practicas 
    ├── Practica #1 Calculo de Masa Corporal
    ├── Practica #2 Calculo de Pago de Estacionamiento
    └── Practica #3 Crear actividades multiples y enviar información entre actividades
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

## Ecosistema de Android

Una plataforma abierta móvil, para dispositivos móviles, embebidos (ejemplo, dispositivo Android para autos, TV’s etc.) y usables en nuestro cuerpo.

* Google es el principal responsable de su actualización, aunque otras personas contribuyen al sistema.

* Cada fabricante de dispositivos móviles puede adaptar “customize” Android a sus necesidades.

## Situacion Actual de Android

* Android es el sistema operativo más utilizado en el mundo.  

* Incluso Windows está rezagado con respecto a la adopción generalizada de la plataforma funcional de teléfonos inteligentes propiedad de Google. iOS ni siquiera está cerca.  

* Cuando se trata de dispositivos móviles, Apple ha ganado algo de terreno en los últimos años, pero Android todavía impulsa alrededor del 75% de todos los teléfonos inteligentes y tabletas.

[fuente](https://techjury.net/blog/android-market-share/)

## Mercado Actual

* Android tiene una cuota del 71.77%, mientras que iOS representó el 27.6% del mercado de sistemas operativos móviles. 

* Hay más de 2,500 millones de usuarios activos de Android en más de 190 países. 

* Un total de 1,570 millones de dispositivos Android vendidos en 2022, frente a los 0.980 millones de 2021. 

* Android representó el 44.86% del mercado de sistemas operativos móviles, mientras que iOS representó el 54.74% en enero de 2023. 

* El 97% del malware para teléfonos inteligentes se dirige a teléfonos Android. 

* Las ventas de Android están aumentando en Estados Unidos, Europa, Japón, India y China. 

* La cuota de mercado de Samsung en Estados Unidos fue del 28.57% en 2023, frente al 26.45% de 2022. 

* La participación de Android en todos los dispositivos conocidos fue del 70.97%.

[fuente actualizada 2024](https://techjury.net/blog/android-market-share/)

## Arquitectura de Android

La arquitectura de Android está organizada en varias capas, cada una con su propia función específica:

* Aplicaciones: La capa más alta donde se encuentran las aplicaciones que los usuarios instalan y utilizan.

* Marco de Aplicaciones (Application Framework): Proporciona varias APIs que los desarrolladores pueden usar para construir sus aplicaciones. Aqui residen los siguientes sistemas: View System, Content Provider, Resoure Manager, Notification Manager, Activity Manager.

* Bibliotecas y Android Runtime: Incluye bibliotecas nativas escritas en C/C++ y la máquina virtual ART (Android Runtime) que ejecuta las aplicaciones.

* Dalvik Virtual Machine. Entorno en el que cada aplicación Android corre android cada aplicación se ejecuta en su propio proceso, con su propia instancia de la VM Dalvik.

* Dalvik ha sido escrito tal que un dispositivo puede correr múltiples máquinas virtuales eficientemente. Virtual machine basada en registros.


* Bibliotecas Principales: Ofrecen funcionalidades básicas como gráficos, bases de datos y navegación web.

* Kernel de Linux: La base del sistema operativo Android, que maneja la gestión de memoria, procesos, seguridad y controladores de hardware


![Arquitectura](https://source.android.com/static/images/android-stack.svg?hl=es-419)
