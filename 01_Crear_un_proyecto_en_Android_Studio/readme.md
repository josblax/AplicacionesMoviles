# Ambiente de Desarrollo Integrado.

____

## Creditos & Disclaimer de algunas imagenes usadas en esta sección usadas bajo permiso explicito de Google 

[*Content License*](https://developer.android.com/license)

___
## Proceso inicial

Selecciona el boton crear un proyecto, donde te mostrará una serie de actividades, selecciona "Empty Views Activity"

![image](https://github.com/user-attachments/assets/9d604a91-7fad-4ec8-bbd5-f858ca2f132d)

## Asigna un nombre a tu proyecto

En la casilla "Name" asigna un nombre a tu proyecto que se relacione con la actividad o proyecto que estas haciendo. Selecciona el lenguaje, en la casilla "Language" y asigna el lenguaje "Java", y oprime "Finish" para continuar.

![image](https://github.com/user-attachments/assets/b195795f-70fe-42d9-a95c-37864a1e4e81)


## Estructura del Proyecto

En Android Studio, la estructura del folder java es fundamental para organizar el código fuente de tu aplicación. Contenido:

### Manifests Folder:

Contiene el archivo AndroidManifest.xml, que define la estructura básica de la aplicación, incluyendo los componentes como permisos y definiciones meta que usara la app.

### Java Folder:

* src/main/java: Aquí se encuentran todos los archivos de código fuente en Java o Kotlin.
* src/androidTest/java: Contiene los archivos de prueba de instrumentación, que se ejecutan en un dispositivo Android.
* src/test/java: Contiene los archivos de prueba locales, que se ejecutan en la JVM de tu máquina de desarrollo

### Resource (res) Folder:

* res/drawable: Imágenes y gráficos.
* res/layout: Archivos de diseño XML para las interfaces de usuario.
* res/mipmap: Iconos de la aplicación.
* res/values: Archivos XML que contienen valores como cadenas, colores y estilos1.

### Gradle Scripts:

#### Archivos de configuración de Gradle. 

build.gradle, que definen cómo se compila y construye la aplicación. Esta estructura ayuda a mantener el proyecto organizado y facilita la gestión del código y los recursos.

## Donde necesito codificar la logica de mi app?


```bash
app/
├── src/
│   ├── main/
│       └── java/
│           └── com/example/myapp/
│               └── MainActivity.java
│
├── res/
    ├── layout/
        └── activity_main.xml
```


# Interfase Grafica de Android Studio

![image](https://github.com/user-attachments/assets/1564bcc0-36af-4c6c-ba0a-b6b9aee62c77)

## Barra de Herramientas

![image](https://github.com/user-attachments/assets/e6d98d0a-374c-43a6-9052-768a2355c043)

## Barra de Navegacion

![image](https://github.com/user-attachments/assets/b8e6e8f6-dcc5-4532-8eec-0692c4d3c16f)

## Ventana Editor de XML

![image](https://github.com/user-attachments/assets/4d137f78-f7bb-44ad-981b-1153002a8ebd)

## Ventana Editor Java

![image](https://github.com/user-attachments/assets/4b3f29e0-dc21-42d6-8644-ed8dc2c172a2)

## Barra izquierda de herramientas 

![image](https://github.com/user-attachments/assets/e2775c8c-ed6d-434f-ade6-68f9a112a401)

## Ventana del Emulador

![image](https://github.com/user-attachments/assets/857ee838-b46b-4dc9-b9e9-ab5cb5a0ce45)
