# Layout usado en estas practicas

TableLayout Coloca sus elementos secundarios en filas y columnas. Los contenedores TableLayout no muestran líneas de borde para sus filas, columnas o celdas. La tabla tendrá tantas columnas como la fila con más celdas. Una tabla puede dejar celdas vacías. Las celdas pueden abarcar varias columnas, como en HTML. 

Los objetos TableRow son las vistas secundarias de un TableLayout (cada TableRow define una sola fila en la tabla). Cada fila tiene cero o más celdas, cada una de las cuales está definida por cualquier otro tipo de vista. 
Por lo tanto, las celdas de una fila pueden estar compuestas por una variedad de objetos View, como los objetos ImageView o TextView. 
Una celda también puede ser un objeto ViewGroup (por ejemplo, puede anidar otro TableLayout como una celda).

El siguiente diseño de ejemplo tiene dos filas y dos celdas en cada una. La captura de pantalla adjunta muestra el resultado, con los bordes de las celdas mostrados como líneas punteadas (agregadas para un efecto visual).
[Fuente](https://developer.android.com/guide/topics/ui/layout/grid)
```XML
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:stretchColumns="1">
    <TableRow>
        <TextView
            android:text="@string/table_layout_4_open"
            android:padding="3dip" />
        <TextView
            android:text="@string/table_layout_4_open_shortcut"
            android:gravity="right"
            android:padding="3dip" />
    </TableRow>

    <TableRow>
        <TextView
            android:text="@string/table_layout_4_save"
            android:padding="3dip" />
        <TextView
            android:text="@string/table_layout_4_save_shortcut"
            android:gravity="right"
            android:padding="3dip" />
    </TableRow>
</TableLayout>
```
<p align="center">
<img src="https://developer.android.com/static/images/table_layout.png" />
</p>
