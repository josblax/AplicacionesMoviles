# Constraint Layout

[Fuente](https://developer.android.com/develop/ui/views/layout/constraint-layout)

Permite crear diseños grandes y complejos con una jerarquía de vistas plana (sin grupos de vistas anidadas). Para definir la 
posición de una vista en ConstraintLayout, debes agregar al menos una restricción horizontal y una vertical.  
Cada restricción representa una conexión o alineación con otra vista, el diseño de nivel superior o una guía invisible. Cada 
restricción define la posición de la vista a lo largo del eje vertical u horizontal, por lo que cada vista debe tener un mínimo de una restricción para cada eje, aunque a menudo se necesitan más.

ConstraintLayout permite crear diseños grandes y complejos con una jerarquía de vistas planas, sin grupos de vistas anidados. Es similar a RelativeLayout en el sentido de que todas las vistas se distribuyen de acuerdo con las relaciones entre las vistas del mismo nivel y el diseño principal, pero es más flexible que RelativeLayout y más fácil de usar con el editor de diseño de Android Studio.
Toda la potencia de ConstraintLayout está disponible directamente desde las herramientas visuales del Editor de Diseño, ya que la API de diseño y el Editor de Diseño están especialmente diseñados el uno para el otro. Puede crear su diseño con ConstraintLayout completamente arrastrando en lugar de editar el XML.

<p align="center">
  <img src="https://developer.android.com/static/training/constraint-layout/images/constraint-fail_2x.png" />
</p>
<p align="center">
  <img src="https://developer.android.com/static/training/constraint-layout/images/constraint-fail-fixed_2x.png" />
</p>

# Layout Constraints

Los layout constraints son atributos que permiten definir cómo se posicionan y dimensionan las vistas relativas a otras vistas o al contenedor padre. 

Estas restricciones proporcionan una gran flexibilidad y control para crear layouts complejos y responsivos sin necesidad de anidar múltiples layouts.

Tipos de Restricciones:

## Restricciones Horizontales:

### layout_constraintStart_toStartOf:

Alinea el borde inicial (izquierdo en LTR) de la vista con el borde inicial de otra vista.

Ejemplo: 

```
app:layout_constraintStart_toStartOf="parent"
```
___

### layout_constraintStart_toEndOf:

Alinea el borde inicial de la vista con el borde final de otra vista.

Ejemplo: 

```
app:layout_constraintStart_toEndOf="@id/otroWidget"
```
___

### layout_constraintEnd_toStartOf:

Alinea el borde final (derecho en LTR) de la vista con el borde inicial de otra vista.

Ejemplo: 

```
app:layout_constraintEnd_toStartOf="@id/otraVista"
```
___

### layout_constraintEnd_toEndOf:

Alinea el borde final de la vista con el borde final de otra vista.

Ejemplo: 

```
app:layout_constraintEnd_toEndOf="parent"
```
___

## Restricciones Verticales:

### layout_constraintTop_toTopOf:

Alinea el borde superior de la vista con el borde superior de otra vista.

Ejemplo: 

```
app:layout_constraintTop_toTopOf="parent"
```

___

### layout_constraintTop_toBottomOf:

Alinea el borde superior de la vista con el borde inferior de otra vista.

Ejemplo: 

```
app:layout_constraintTop_toBottomOf="@id/otraVista"
```
___

### layout_constraintBottom_toTopOf:

Alinea el borde inferior de la vista con el borde superior de otra vista.

Ejemplo: 

```
app:layout_constraintBottom_toTopOf="@id/otraVista"
```
___

### layout_constraintBottom_toBottomOf:

Alinea el borde inferior de la vista con el borde inferior de otra vista.

Ejemplo: 

```
app:layout_constraintBottom_toBottomOf="parent"
```
___

## Otros Atributos Importantes:


### layout_constraintHorizontal_bias / layout_constraintVertical_bias:

Ajustan la posición de la vista entre dos restricciones. Valores de 0 a 1, donde 0 es al inicio y 1 es al final.

Ejemplo: 

```
app:layout_constraintHorizontal_bias="0.5"
```

___

### layout_constraintWidth_default / layout_constraintHeight_default:

Definen el comportamiento del tamaño de la vista: spread, wrap o percent.

Ejemplo: 

```
app:layout_constraintWidth_default="wrap"
```

### layout_constraintDimensionRatio:

Mantiene una relación de aspecto fija para la vista, especificada en formato width:height.

Ejemplo: 

```
app:layout_constraintDimensionRatio="16:9"
```

___


### layout_goneMargin:

Define márgenes alternativos cuando la vista referenciada está GONE.

Ejemplo: 

```
app:layout_goneMarginTop="16dp"
```

> Aunque una restricción que falta no provoca un error de compilación, el Editor de diseño indica las restricciones que faltan como un error en la barra de herramientas. Para ver los errores y otras advertencias.
