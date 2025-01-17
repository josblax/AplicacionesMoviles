# Layouts

Los layouts sirven para dar formato a nuestras pantallas (canvas/lienzo) y generar una interfase de usuario que se aclople a las necesidades de diseño y funcionalidad de nuestra app.

Características de los principales layouts

## Constraint Layout:

1. Flexible y potente para diseñar layouts complejos sin necesidad de anidar múltiples layouts.

2. Permite definir restricciones entre los elementos, como alineaciones, márgenes y guías.

2. Facilita la disposición gráfica y rápida de los elementos.

___

## Linear Layout

1. Disposición en una sola dirección, ya sea vertical u horizontal.

2. Admite tanto orientación horizontal como vertical.

3. Se puede alinear contenido usando gravity.

4. Admite pesos (weight) para distribuir espacio entre los elementos.

___

## Table Layout

1. Dispone elementos en forma de tabla, usando filas y columnas.

2. Cada fila es una instancia de **TableRow**, que a su vez puede contener varias vistas.

3. Se puede definir el peso de las columnas para ajustar el tamaño de las mismas.

4. Ideal para layouts que requieran una disposición tipo tabla, aunque puede ser menos flexible que otros tipos de layouts.

___

## Relative Layout

1. Permite que los elementos se posicionen relativos a otros elementos o al contenedor principal.

2. Ideal para diseños complejos donde los elementos deben estar en relación unos con otros.

3. Puede ser más difícil de manejar y mantener en comparación con otros layouts.

4. Usa atributos como layout_alignParentTop, layout_toRightOf, etc.

__ 

## Frame Layout

1. Diseñado para contener un único hijo, aunque puede contener varios superpuestos.

2. Ideal para contenedores simples o para manejar vistas superpuestas como un Snackbar.

3. Los elementos superpuestos se renderizan en el orden que se añaden.

4. Usa atributos como layout_gravity para alinear contenido dentro del frame.
