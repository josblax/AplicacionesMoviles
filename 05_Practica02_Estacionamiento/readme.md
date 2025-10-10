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

I. Hoja de Ruta del Proyecto (Roadmap)
Este Roadmap te guía a través de las fases de desarrollo en Android Studio usando Java, cubriendo los conceptos fundamentales requeridos para completar el ejercicio.

Fase	Concepto Clave	Descripción Breve	Uso en el Ejercicio
1. Interfaz (XML)	Sintaxis y Estructura XML	Define la estructura visual de la UI usando etiquetas y atributos de Android (ej. android:id, android:layout_width).	Se usa para crear los campos de entrada (EditTexts) para HH:MM de entrada/salida, el botón (Button) y el resultado (TextView).
2. Inicialización	Sintaxis y Variables	Reglas fundamentales de Java. Las variables son contenedores de datos que se declaran para la UI y la lógica.	Se usan para declarar las referencias de UI (ej. private EditText etHoraEntrada;) y en el método onCreate() para inicializarlas con findViewById().
3. Lógica de Control	Tipos de Datos	Define la naturaleza de los datos. int para minutos/horas y double para el costo y las tarifas.	int: para obtener las horas de los EditText. double: para realizar cálculos de tarifas y mostrar el resultado con decimales.
4. Flujo y Ciclos	if...else if (Flujo de Control)	Instrucciones que permiten al programa tomar decisiones evaluando condiciones de forma secuencial.	Crucial para la Etapa 1 del cálculo: Determinar el costo fijo de las primeras 3 horas según los rangos (0-30 min, 31-60 min, 61-120 min, 121-180 min).
5. Acumulación	Ciclos (while)	Estructuras de repetición que ejecutan código mientras una condición sea verdadera. Ideal cuando no sabes cuántas veces repetir.	Crucial para la Etapa 2: Manejar la tarifa acumulativa a partir de la cuarta hora, repitiendo el cobro de $14.00 por cada 60 minutos adicionales.

---


