# Como se calcula la densidad de pixeles

En Android Studio, un dp (píxel independiente de la densidad) es una unidad de medida que se usa para garantizar que los elementos de la IU parezcan consistentes en diferentes densidades de pantalla. Es una unidad abstracta que se basa en la densidad física de la pantalla. Un dp es aproximadamente igual a un píxel en una pantalla con una densidad de 160 puntos por pulgada (ppp), que se considera la densidad de referencia1.
Cómo se calcula el dp

La fórmula para convertir dp a píxeles es:

## píxeles = dp × (ppp/160 ppp)

He aquí un desglose:

* dp: El valor de píxel independiente de la densidad que desea convertir.
* ppp: La densidad de la pantalla en puntos por pulgada.
* 160: La densidad de referencia.

Por ejemplo, si tiene un dispositivo con una densidad de pantalla de 320 ppp y desea convertir 10 pp a píxeles:

## píxeles = 10× (320/160) = 10×2 = 20 píxeles

El uso de dp garantiza que los elementos de la interfaz de usuario se escalen correctamente en diferentes dispositivos, manteniendo una apariencia coherente.

[Más información](https://www.geeksforgeeks.org/understanding-density-independence-pixel-sp-dp-dip-in-android/)
