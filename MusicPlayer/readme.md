# Notas de Desarrollo - MusicPlayer App

Este documento contiene un resumen de los cambios, desafíos y soluciones implementadas durante el desarrollo del reproductor de música.

## 1. Arquitectura del Reproductor (MediaPlayer)
Para evitar que la música se detenga o se creen múltiples instancias del reproductor al navegar entre actividades, se implementó un patrón **Singleton**.

*   **Clase `MyMediaPlayer`**: Centraliza la instancia de `MediaPlayer`.
*   **Beneficio**: Permite que la música continúe sonando de fondo mientras el usuario regresa a la lista de canciones.
*   **Estado**: Almacena el `currentIndex` para saber qué canción se está reproduciendo actualmente en todo el flujo de la app.

## 2. Gestión de Permisos (Compatibilidad de Versiones)
Uno de los mayores desafíos fue la transición de permisos en Android 13 (API 33).

*   **Android 12 o inferior**: Se requiere `Manifest.permission.READ_EXTERNAL_STORAGE`.
*   **Android 13 o superior**: Se requiere `Manifest.permission.READ_MEDIA_AUDIO`.
*   **Solución**: Se implementó un método `checarPermiso()` en `MainActivity` que detecta la versión del SDK del dispositivo y solicita el permiso correcto dinámicamente.

## 3. Optimización del RecyclerView
Se corrigió un error visual crítico donde solo se mostraba una canción en la lista:
*   **Problema**: El layout `music_item.xml` tenía `android:layout_height="match_parent"`.
*   **Solución**: Se cambió a `wrap_content`.
*   **Resultado**: El `RecyclerView` ahora permite visualizar múltiples elementos y hacer scroll correctamente.

## 4. Carga de Portadas de Álbum (Album Art)
Para mejorar la interfaz, se asociaron las imágenes de los álbumes a cada canción.

*   **Clase `AudioModel`**: Se extendió para incluir el campo `albumId`.
*   **Implementación**:
    1. Se extrae el `ALBUM_ID` desde el `MediaStore` durante el escaneo.
    2. Se construye el URI de la imagen usando: `content://media/external/audio/albumart` + `albumId`.
    3. Se utiliza `ContentUris.withAppendedId()` para generar la ruta final.
*   **Respaldo (Fallback)**: Si una canción no tiene portada, se asigna un icono vectorial por defecto (`music_note` o `directory_music`).

## 5. Ciclo de Vida y Refresco de Datos
Para que la aplicación sea dinámica:
*   **`onResume`**: El escaneo de música se movió de `onCreate` a `onResume`. Esto permite que la lista se actualice automáticamente cada vez que el usuario sube archivos nuevos o regresa de otra aplicación.
*   **`MediaScannerConnection`**: Se añadió un escaneo forzado a la carpeta `Downloads` para obligar al sistema Android a indexar archivos nuevos que aún no aparecen en la base de datos de medios.

## 6. Interfaz del Reproductor (`MusicPlayerActivity`)
*   **Fondo**: Se utilizó `#121212` (Gris oscuro/negro) para un aspecto moderno.
*   **SeekBar**: Configurado con `progressTint` y `thumbTint` en blanco para legibilidad sobre el fondo oscuro.
*   **Texto Marquee**: El título de la canción tiene activado el desplazamiento horizontal (`setSelected(true)`) para nombres largos.

---


# Arquitectura del Proyecto: MusicPlayer

## 1. AudioModel.java (Modelo de Datos)

* Es la clase base que define qué es una "Canción" dentro de tu código.
* Función: Almacenar la información de cada archivo de audio encontrado.

### Atributos:

    * titulo: Nombre de la canción.
    * ruta: Ubicación física del archivo en el dispositivo.
    * duracion: Tiempo total en milisegundos.
    * albumId: Identificador para recuperar la portada del álbum.

* **Especial**: Implementa Serializable para que los objetos puedan enviarse fácilmente entre pantallas (de la lista al reproductor).

## 2. MainActivity.java (Controlador Principal)

* Es el punto de entrada de la aplicación y gestiona la biblioteca musical.
* Gestión de Permisos: Detecta la versión de Android (11 o 13+) y solicita el permiso adecuado para leer archivos de audio.
* Búsqueda de Medios: Utiliza MediaStore para consultar la base de datos interna de Android y encontrar todos los archivos MP3.
* Refresco Dinámico: Mediante onResume y MediaScannerConnection, asegura que si el usuario agrega música nueva, esta aparezca sin necesidad de reiniciar la app.
* Control de Interfaz: Alterna entre mostrar la lista de canciones o el mensaje "No se encontraron canciones".

## 3. MusicAdapter.java (Adaptador de Lista)

* Actúa como puente entre la lista de canciones (datos) y el RecyclerView (interfaz visual).
* Visualización: Infla el diseño music_item.xml para cada canción.
* Carga de Miniaturas: Busca y muestra la pequeña imagen del álbum en cada fila de la lista.
* Manejador de Clics: Detecta qué canción tocó el usuario, actualiza el índice global y lanza la pantalla del reproductor (MusicPlayerActivity).
* Optimización: Usa getBindingAdapterPosition() para asegurar que siempre se abra la canción correcta, incluso si la lista cambia.

## 4. MusicPlayerActivity.java (El Reproductor)
* Gestiona la interfaz de usuario de reproducción y los controles de audio.
* Controles de Audio: Implementa los botones de Play, Pausa, Siguiente y Anterior.
* Actualización en Tiempo Real: Usa un Handler y un Runnable para actualizar el SeekBar (barra de progreso) y los contadores de tiempo cada 100 milisegundos.
* Visualización Estética: Muestra la portada del álbum en grande, aplica el efecto de texto en movimiento (Marquee) al título y gestiona los colores de los iconos (Tint).
* Lógica de SeekBar: Permite al usuario "adelantar" o "atrasar" la canción arrastrando el círculo del control.

## 5. MyMediaPlayer.java (Gestor Global - Singleton)
* Es una clase de utilidad que administra la instancia del reproductor de Android.
* Patrón Singleton: Garantiza que solo exista una instancia de MediaPlayer en toda la app para evitar que se mezclen audios.
* Persistencia: Permite que la música siga sonando aunque el usuario cambie de pantalla o minimice la aplicación.
* Acceso Global: Proporciona un método estático (getInstance()) para que tanto la lista como el reproductor puedan controlar el mismo sonido.

### Donde se llama esta aplicación?

#### 1. En MusicAdapter.java (El disparador)

* Se llama justo cuando el usuario toca una canción en la lista.
* La llamada: MyMediaPlayer.getInstance().reset();
* **Para qué?**: Para detener cualquier canción que esté sonando en ese momento y "limpiar" el reproductor antes de cargar la nueva canción seleccionada.
* También se usa: MyMediaPlayer.currentIndex = currentPosition; para guardar globalmente qué número de canción se acaba de elegir.

#### 2. En MusicPlayerActivity.java (El controlador)
* Se llama al inicio de la clase para vincular la pantalla con el sonido.
* La llamada: MediaPlayer mediaPlayer = MyMediaPlayer.getInstance();
* **Para qué**: Para que esta actividad tenga el control sobre el objeto que está reproduciendo la música. Gracias a esto, cuando presionas el botón de "Pausa" o mueves el "SeekBar" en esta pantalla, le estás enviando la orden directamente al objeto global MyMediaPlayer.

### ¿Qué es un Singleton?

**Un Singleton (o patrón de diseño Singleton) es una técnica de Programación Orientada a Objetos (POO) que garantiza que una clase tenga una sola instancia en toda la aplicación y proporciona un punto de acceso global a ella.**

En una aplicación móvil convencional, cada vez que creas un objeto usando el operador new (por ejemplo, MiClase objeto = new MiClase();), la memoria RAM almacena una nueva instancia independiente. Si otro componente de tu app necesita usar esa misma clase y vuelve a hacer un new, se crea un objeto totalmente nuevo que no comparte información con el anterior.

#### Con un Singleton, esto se restringe de forma estricta:

* La clase controla su propio proceso de creación, asegurando que solo exista un único objeto en la memoria durante todo el ciclo de vida de la aplicación.
* Si la instancia ya existe, te devuelve esa misma. Si no existe, la crea por primera vez y la reutiliza en el futuro.
