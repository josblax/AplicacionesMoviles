# Introducción
____
## Creditos & Disclaimer de algunas imagenes usadas en esta sección usadas bajo permiso explicito de Google 

[*Content License*](https://developer.android.com/license)
___

## Instalacion de Android Studio

1. Usar la siguiente liga:

[Liga](https://developer.android.com/studio?gclid=Cj0KCQjwpv2TBhDoARIsALBnVnkwzQ1DRsss8q_ANTFfekEjGFhifyWJYiLiQUXcq4EU9fVAn_7NmtAaAqYWEALw_wcB&gclsrc=aw.ds)

<img width="582" alt="image" src="https://github.com/user-attachments/assets/4886f52d-ebbd-46c0-b15a-9b70d758adbb" />

___

2. Acepta los términos y condiciones 

<img width="582" alt="image" src="https://github.com/user-attachments/assets/5cdc2cf7-3eb6-4e5e-8510-ebd448c67b45" />

___

3. Asegurate que baje en tu equipo de computo

<img width="582" alt="image" src="https://github.com/user-attachments/assets/9d6a1000-6236-49ba-9132-81145da1937f" />

___

4. Comienza la instalación

<img width="582" alt="image" src="https://github.com/user-attachments/assets/0d81681c-8c7e-4d5a-aae2-274566cf281b" />

___

5. Selecciona "Android Virtual Device"

<img width="582" alt="image" src="https://github.com/user-attachments/assets/06b3a3a2-5073-46d6-b12a-a71b6d59c284" />

___

6. Permite que instale el ADB (Android Device Bridge), si estás en Windows.

<img width="582" alt="image" src="https://github.com/user-attachments/assets/175f6e95-2401-443a-9fb3-844e296a9d64" />

> ADB. Android debug bridge. Nos permite instalar y depurar aplicaciones. Nos permite usar unix Shell para realizar comandos en el dispositivo.

___

7. Una vez instalado, lo encontraras en Windows o Mac de la siguiente manera

<img width="64" alt="Screenshot 2025-01-06 at 11 36 07 AM" src="https://github.com/user-attachments/assets/5c85c8d3-3377-4c30-b973-afd7a67cd6d0" />

___

## Instalacion de Emulador para Android Studio

1. Cuando se ejecuta por primera vez aparecerá esta pantalla.

<img width="582" alt="image" src="https://github.com/user-attachments/assets/c3eb31d1-eb75-4b70-a7da-a25cfad2d7ea" />

___

2. Cuando se ejecuta subsecuentemente aparecerá de la siguiente forma.

<img width="582" alt="image" src="https://github.com/user-attachments/assets/c8f1c36f-2e9b-4f8f-a893-892ce8b2154b" />

___

3. Algunas opciones de customizacion (Preferencias de ejecución)

<img width="474" alt="image" src="https://github.com/user-attachments/assets/9879501c-9507-4243-9a9d-d38dd4e2afe9" />

___

1. Ubicar la pestana de Device Manager

<img width="582" alt="image" src="https://github.com/user-attachments/assets/45b4e7fc-cc1d-407d-b775-32911093e408" />

Nueva version

___

<img width="150" alt="image" src="https://github.com/user-attachments/assets/b27cea9a-1217-40bd-87ac-732822627feb" />

___

2. Selecciona el simbolo + y seleccionar "Create Virtual Device"

<img width="582" alt="image" src="https://github.com/user-attachments/assets/b82ff95c-21bf-40cd-9d5c-8d9969135a09" />

___

3. Selecciona “Phone” y “Pixel 8 Pro” y oprime el botón “Next”

<img width="582" alt="image" src="https://github.com/user-attachments/assets/99133891-23ea-4439-9a10-9a3675d9f32c" />

___

4. Selecciona Tiramisu version 33, este bajará el software como se muestra en la siguiente lamina y al finalizar presiona “Next”.

<img width="582" alt="image" src="https://github.com/user-attachments/assets/66c310ec-02c4-4888-8219-d4bd690d67eb" />


> La ultima version es Blakava que equivale a la version 16 de Android, las versiones anteriores son: API 35 para la version 15 de Android, UpsideDownCake para la version 14 de Android y Tiramisu para la version 13 de Android.
> La version Blakava no tiene version, ni nombre de postre, ni numero de API. 

___

5. Selecciona download 

<img width="516" alt="image" src="https://github.com/user-attachments/assets/2c8a1fef-c25a-485c-91a8-5d4f11a0e3e4" />

___

6. Finalmente selecciona "finish" o "finalizar" deja las opciones por default.

<img width="597" alt="image" src="https://github.com/user-attachments/assets/ae4302c5-9085-42be-9dac-34fc8a2c60a1" />

___

7. De regreso en la interfase principal podrás ver que el dispositivo virtual ha sido creado, corre el dispositivo seleecionando el icono de play.

<img width="630" alt="image" src="https://github.com/user-attachments/assets/21b44330-131c-4c1a-bf73-49be00ae6ffe" />

___

8. Selecciona Emulador o "Running Devices"

<img width="582" alt="image" src="https://github.com/user-attachments/assets/eb556547-850f-4fd7-a6e2-c0d49d071de6" />

___

9. Si te aparece la siguiente pantalla, presiona play para activar el emulador.

<img width="582" alt="image" src="https://github.com/user-attachments/assets/34e93205-18c3-4378-8184-7b1c0edc7ec7" />

___

10. Finalmente tendras listo el emulador

<img width="200" alt="image" src="https://github.com/user-attachments/assets/e1d722f4-4f9f-4df1-b2a8-f3fcf8d70cca" />

---

11. Gradle.

Gradle es un poderoso sistema de compilación que se usa en el desarrollo de Android que te permite definir tu proyecto y dependencias, y distinguir entre diferentes tipos y tipos de compilación. 

Gradle usa un lenguaje específico de dominio (DSL) que brinda a los desarrolladores un control casi completo sobre el proceso de compilación. Cuando activas una compilación en Android Studio, Gradle es la herramienta que trabaja en segundo plano para compilar y empaquetar tu app. 

Examina las dependencias que declaraste en tus archivos build.gradle y crea una secuencia de comandos de compilación en consecuencia. El uso de Gradle en el desarrollo de Android requiere la edición continua de los archivos build.gradle para administrar las dependencias de la app, las variantes de compilación, las configuraciones de firma y otros aspectos esenciales relacionados con la compilación de tu app.

[*fuente:*](https://roadmap.sh/android)

---

## Fundamentos de una app

* Apps son escritas en Java
* Contenida en: Android Asset Packaging Tool
* Cada aplicación corre en su propio proceso Linux.
* Cada proceso tiene su propia Java Virtual Machine
* Para cada aplicación es asignada un único identificación de usuario Linux
* Apps pueden compartir el mismo usuario para poder compartir archivos.

## Componentes Generales de una aplicación

1. Actividades
  * Es una interface visual enfocada al usuario.
  * Ejemplo: una lista de items que los usuarios pueden escoger.
2. Servicios
  * Corren en “background” por tiempo indefinido.
  * Ejemplo: calcular y proveer el resultado de las actividades que son necesarias.
3. Broadcast Receivers
  * Reciben y toman acción a notificaciones.
  * Ejemplo: notificación de una noticia importante.
4. Content Providers
  * Guarda y recupera información para hacerla accesible a todas las aplicaciones.
  * Ejemplo: Android provee con algunos proveedores de contenido para tipos comúnes de tipos de datos. (ej., audio, video, imagenes, información personal, etc.)
5. Intents
  * Mantiene el contenido de un mensaje
  * Ejemplo: actividad como agregar comentarios a una imagen presentada al usuario.

## Que es una actividad?

* Una actividad representa una pantalla como una pantalla o un marco (“frame”) y esta es una subclase de la clase ContextThemeWrapper.
  
* Como en lo lenguajes de programación C, C++ o Java que en su programa parte de la función main(). De manera muy similar, sistema Android inicia su programa con una actividad a partir de una llamada en el método onCreate(). 

* Hay una secuencia de métodos de devolución de llamada que comienzan una actividad y una secuencia de métodos de devolución (“callback”) de llamada que quita una actividad como se muestra en el siguiente diagrama de ciclo de vida de actividad.

![ciclo de vida de una actividad](https://developer.android.com/guide/components/images/activity_lifecycle.png?hl=es-419)


## Que es una API?

Una API simplifica la programación del APP’s usando interfases que nos ayudan a acceder los componentes necesarios que requerimos para nuestra aplicación.

Por ejemplo si queremos obtener la ubicación del dispositivo usaremos la siguiente interfase:

**locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)**


## Java y Kotlin son lenguajes OOP

* Java es un lenguaje de programación que existe desde hace mucho más tiempo que Android. 

* Es un lenguaje orientado a objetos. Esto significa que utiliza el concepto de objetos de programación reutilizables. 


## Como trabajan Java y Android Juntos

Después de escribir un programa en Java para Android, hacemos clic en un botón para cambiar nuestro código a otra forma que sea entendida por Android. Esta otra forma se denomina código Dalvik EXecutable (DEX) y el proceso de transformación se denomina compilación. La compilación se lleva a cabo en la máquina de desarrollo después de hacer clic en ese botón. Veremos este trabajo justo después de configurar nuestro entorno de desarrollo.

Android es un sistema bastante complejo, pero no es necesario entenderlo en profundidad para poder crear aplicaciones increíbles. La parte del sistema Android que ejecuta (ejecuta) nuestro código DEX compilado se llama Dalvik Virtual Machine (DVM). El DVM en sí es una pieza de software escrita en otro idioma que se ejecuta en una versión especialmente adaptada del sistema operativo Linux. Entonces, lo que el usuario ve de Android es en sí mismo solo una aplicación que se ejecuta en otro sistema operativo.

El propósito del DVM es ocultar la complejidad y diversidad del hardware y el software en el que se ejecuta Android, pero, al mismo tiempo, su propósito es exponer todas sus características útiles. Esta exposición de características generalmente funciona de dos maneras. El propio DVM debe tener acceso al hardware, lo cual tiene, pero este acceso debe ser amigable para el programador y fácil de usar. La forma en que el DVM nos permite el acceso es realmente fácil de usar debido a la interfaz de programación de aplicaciones (API) de Android.


*Bibliografia* 
Android Programming for Beginners by John Horton, Paresh Mayani, Editorial Packt
