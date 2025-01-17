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

Su aplicación debe contar con los siguientes elementos gráficos:

1. TextViews para representar las etiquetas de Entrada y Salida, así como la estancia en minutos representado por los 999999 y el monto a pagar representado por $$$$$,así como los dos puntos ":", que esta entre las horas y los minutos de la entrada y salida.
2. EditText para representar las horas y los minutos de entrada y salida.
