# Vector Asset 

[Fuente](https://developer.android.com/studio/write/vector-asset-studio)

Android Studio incluye una herramienta llamada Vector Asset Studio que te ayuda a agregar íconos de materiales e importar archivos de gráficos vectoriales escalables (SVG) y documentos de Adobe Photoshop (PSD) a tu proyecto como recursos vectoriales de elementos de diseño. El uso de elementos de diseño vectoriales en lugar de mapas de bits reduce el tamaño de tu APK, ya que se puede cambiar el tamaño del mismo archivo para diferentes densidades de pantalla sin perder la calidad de la imagen. 

En el caso de las versiones anteriores de Android que no admiten elementos de diseño vectoriales, Vector Asset Studio puede, en el momento de la compilación, convertir los elementos de diseño vectoriales en diferentes tamaños de mapa de bits para cada densidad de pantalla.

Vector Asset Studio agrega un gráfico vectorial al proyecto como un archivo XML que describe la imagen. Mantener un archivo XML puede ser más fácil que actualizar varios gráficos rasterizados en varias resoluciones.

Android 4.4 (nivel de API 20) y versiones anteriores no admiten elementos de diseño vectoriales. Si el nivel mínimo de API se establece en uno de estos niveles de API, tiene dos opciones al utilizar Vector Asset Studio: generar archivos de gráficos de red portátiles (PNG) (el valor predeterminado) o utilizar la biblioteca de compatibilidad.

# Agregar un vector asset

Selecciona File->New->Vector Asset

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/vector1.png" alt="Layout app" width="400" height="400">
</p>

Dar click en el click art

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/vector2.png" alt="Layout app" width="400" height="400">
</p>

Seleccionar o busca el icono que deseas incluir en tu archivo XML

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/vector3.png" alt="Layout app" width="400" height="400">
</p>

Cambiar el Nombre, Tamaño o color del icono

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/vector4.png" alt="Layout app" width="400" height="400">
</p>

Confirmar la ruta donde quieres guardar tus iconos. (Sugerencia, deja la ruta por default)

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/vector5.png" alt="Layout app" width="400" height="400">
</p>

Agregar el icono al XML usando el widget ImageView

```XML
<ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:contentDescription="@string/content1"
                    android:src="@drawable/baseline_person_80"/>
```
