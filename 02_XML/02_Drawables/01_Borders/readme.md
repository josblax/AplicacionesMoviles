# border

Esta dentro del esquema de formas (shape), donde un marco puede ser añadido con tres propiedades a modificar:

* **solid** andorid:color. Usando la siguiente propiedad se le da color al fondo del recuadro.
* **stroke**. android:width. Propiedad para ver el ancho de la línea del marco andorid:color y el color de la línea
* **corners** android:radius. Modifica la curvatura de las esquinas.

```XML
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="#FFFFFF"/> <!-- Fondo color blanco -->
    <stroke android:width="3dp" android:color="#000000"/> <!-- Marco con color negro -->
    <corners android:radius="2dp"/> <!-- Radio de las esquinas -->
</shape>
```
