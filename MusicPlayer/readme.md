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
