# Vector Asset

Android Studio incluye una herramienta llamada Vector Asset Studio que te ayuda a agregar íconos de materiales e importar archivos de gráficos vectoriales escalables (SVG) y documentos de Adobe Photoshop (PSD) a tu proyecto como recursos vectoriales de elementos de diseño. El uso de elementos de diseño vectoriales en lugar de mapas de bits reduce el tamaño de tu APK, ya que se puede cambiar el tamaño del mismo archivo para diferentes densidades de pantalla sin perder la calidad de la imagen. 

En el caso de las versiones anteriores de Android que no admiten elementos de diseño vectoriales, Vector Asset Studio puede, en el momento de la compilación, convertir los elementos de diseño vectoriales en diferentes tamaños de mapa de bits para cada densidad de pantalla.

Vector Asset Studio agrega un gráfico vectorial al proyecto como un archivo XML que describe la imagen. Mantener un archivo XML puede ser más fácil que actualizar varios gráficos rasterizados en varias resoluciones.

Android 4.4 (nivel de API 20) y versiones anteriores no admiten elementos de diseño vectoriales. Si el nivel mínimo de API se establece en uno de estos niveles de API, tiene dos opciones al utilizar Vector Asset Studio: generar archivos de gráficos de red portátiles (PNG) (el valor predeterminado) o utilizar la biblioteca de compatibilidad.