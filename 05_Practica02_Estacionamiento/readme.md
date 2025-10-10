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

3. Entendido. Basándome en la rúbrica que proporcionaste, he generado una rúbrica específica y detallada para el ejercicio de cálculo de estancia del estacionamiento.

El puntaje total máximo se mantiene en **10.0 Puntos**.

---

## Rúbrica de Evaluación: Cálculo de Pago de Estacionamiento

| Criterio | Puntos Máximos | Muy Bueno (2.0 / 3.0 Pts) | Bueno (1.5 / 2.25 Pts) | Deficiente (0.5 / 0.75 Pts) | Muy Deficiente (0.0 Pts) |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **1. Planteamiento del Problema/Diagrama** (Máx. 2.0 Puntos) | 2.0 | El pseudocódigo y/o diagrama de flujo son de **claro entendimiento** y representan con precisión la **lógica escalonada y acumulativa** de cobro. | 1.5 | El pseudocódigo o diagrama es **incompleto** o **confuso**; la lógica del ciclo (`while`) es difícil de entender o está mal planteada. | 0.5 | No entregó el planteamiento, pseudocódigo ni diagrama. | 0.0 |
| **2. Resolución y Algoritmos** (Máx. 2.0 Puntos) | 2.0 | Utiliza las instrucciones `if...else if...else` y el ciclo `while` de manera **óptima y eficiente** para manejar las tarifas escalonadas y la acumulación de horas. | 1.5 | Utiliza las instrucciones correctas, pero la lógica del cálculo acumulativo (`while`) es **redundante** o **no es la más adecuada** (ej. usa demasiados `if` anidados). | 0.5 | Utiliza instrucciones incorrectas o el algoritmo implementado no resuelve la **lógica acumulativa** correctamente. | 0.0 |
| **3. Funcionamiento** (Máx. 3.0 Puntos) | 3.0 | El cálculo del costo es **100% correcto** para todos los escenarios (gratis, 1hr, 2hr, 3hr, y cualquier número de horas adicionales). El manejo de errores (`try-catch`) es robusto. | 2.25 | El cálculo tiene **fallos menores** (ej. errores de redondeo o en un límite específico), pero la lógica general de acumulación funciona. | 0.75 | El funcionamiento tiene **fallos importantes** (ej. la tarifa acumulativa (`while`) es incorrecta o los casos límite (30, 60, 180 min) fallan). | 0.0 |
| **4. Identificación de Componentes** (Máx. 1.5 Puntos) | 1.5 | Nombra correctamente todos los `EditText`, `Button` y `TextView` usando **nomenclatura estándar** (ej. `et_hora_entrada`, `btn_calcular`, `tv_resultado`) tanto en XML como en Java. | 1.12 | Nombra correctamente la **mayoría** de los componentes, pero faltan algunos o usa nombres genéricos (ej. `campo1`, `btn1`). | 0.375 | Nombra correctamente **solo algunos** componentes o usa nombres incomprensibles en la mayoría de los casos. | 0.0 |
| **5. Diseño Gráfico** (Máx. 1.0 Punto) | 1.0 | El diseño es **claro, estructurado, fácil de usar** y tiene coherencia visual. Los campos de hora y minuto están bien agrupados. | 0.75 | El diseño es funcional, pero la alineación o el uso de colores/espaciado no es óptimo, aunque todos los componentes necesarios están presentes. | 0.375 | El diseño está desordenado, es **difícil de leer** o faltan etiquetas (`TextView` descriptivos) para los campos de entrada. | 0.0 |
| **6. Documentación Interna** (Máx. 0.5 Puntos) | 0.5 | Aporta **documentación completa y clara** en Java, explicando las constantes de tarifas, la lógica del `if...else if` y el funcionamiento del ciclo `while`. | 0.375 | La documentación aportada es **justa**; explica la inicialización de vistas y el manejo del botón, pero no detalla completamente la lógica de `calcularTarifa()`. | 0.125 | La documentación es **insuficiente** o solo se incluyen comentarios básicos que no explican la lógica compleja del cálculo. | 0.0 |
