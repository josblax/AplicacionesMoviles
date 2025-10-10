# Ejercicio

Calcula el pago de estancia:

Realice la aplicación en Android Studio, que represente el pago en estancia en plaza satélite, calcule el monto a pagar por el servicio de estacionamiento, teniendo en cuenta que los primeros 30 minutos son gratuitos y después del minuto 31 hasta la primera hora son 4.00 pesos, posteriormente en el minuto 61 al 120, se cobraran 12.00, Del minuto 121 hasta el 180 se cobraran 26.00.
A partir de la hora cuarta se cobrará de la siguiente forma: Del minuto 01 al 15 4.00, del minuto 16 al 30 4.00, del minuto 31 al 45 3.00 y del minuto 46 al 60 3.00; todo esto de manera acumulativa, escriba el seudocódigo y el diagrama de flujo para representar este ejercicio.

Racional:

## Se tiene que meter el boleto del estacionamiento, validarse, calcular el tiempo de entrada                                                                                  y de salida para poder cobrar:
* Los primeros 30 minutos son gratuitos.
* Después del minuto 31 hasta la primera hora son $4.00. 
* En el minuto 61 al 120, se cobrarán $12.00.
* Del minuto 121 hasta el 180 se cobrarán $26.00.

## A partir de la hora cuarta se cobrará de la siguiente forma: 
* Del minuto 01 al 15 = 26 + 4.00 = $30
* Del minuto 16 al 30 = 30 + 4.00 =$34
* Del minuto 31 al 45 = 34 + 3.00 =$37
* Del minuto 46 al 60 = 37 + 3.00 =$40

Considerar que la estancia puede ser cualquier numero de horas, 4,5,6 etc... para esto considerar un ciclo que pueda acumular horas completas.

Interface Gráfica del Usuario

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/estacionamiento.jpg" alt="Layout app" width="200" height="400">
</p>

---

| Componente/Atributo              | Concepto                                                                 | Uso en el Diseño                                                                                          |
|----------------------------------|--------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| `LinearLayout`                   | Es el contenedor principal que apila vistas de forma secuencial.        | Se usa como la vista raíz para apilar el título, los bloques de entrada, el botón y el resultado, uno debajo del otro. |
| `android:orientation="vertical"` | Define que los elementos hijos se apilen en una columna.                | Aplica al contenedor principal para asegurar que las secciones fluyan de arriba hacia abajo.              |
| `android:layout_width="match_parent"` | Indica que la vista debe ocupar todo el ancho disponible de su contenedor padre. | Usado en contenedores y TextView para que se extiendan a lo largo de la pantalla.                         |
| `android:layout_weight="1"`      | Asigna el espacio restante a los elementos dentro de un LinearLayout de orientación horizontal. | Se usa en los EditText de Hora y Minuto para que cada uno ocupe exactamente el 50% del ancho disponible.  |
| `android:gravity="center_horizontal"` | Define dónde se debe colocar el contenido dentro de este contenedor.   | Utilizado en el contenedor principal para centrar horizontalmente todos los elementos de la aplicación.   |
| `android:layout_gravity="start"` | Define cómo la vista debe ser colocada dentro de su contenedor padre.   | Se usa en el TextView de "Hora de Entrada" para alinearlo al borde izquierdo, sobrescribiendo el center_horizontal del padre. |

# I. Widgets (Elementos Interactivos y de Visualización)

Los widgets son los elementos visibles con los que el usuario interactúa o que sirven para mostrar datos.

| Widget    | Concepto                                                                 | Uso en el Diseño                                                                                                      |
|-----------|--------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------|
| `TextView` | Componente para mostrar texto estático o dinámico. No es editable por el usuario. | Usado para el Título, las etiquetas de las secciones de entrada/salida y el texto "Costo Total", y para mostrar el resultado final (`tv_resultado`). |
| `EditText` | Es un campo de texto editable que permite al usuario ingresar datos.    | Utilizado para capturar las cuatro entradas de tiempo: Hora/Minuto de entrada y Hora/Minuto de salida.              |
| `Button`   | Un control interactivo diseñado para detectar clics y disparar acciones. | Es el disparador (`btn_calcular`) que activa el método de cálculo de la tarifa al ser presionado.                   |


