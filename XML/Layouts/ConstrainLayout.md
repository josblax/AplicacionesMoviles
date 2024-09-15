# Constraint Layout

[Fuente](https://developer.android.com/develop/ui/views/layout/constraint-layout)

Permite crear diseños grandes y complejos con una jerarquía de vistas plana (sin grupos de vistas anidadas). Para definir la 
posición de una vista en ConstraintLayout, debes agregar al menos una restricción horizontal y una vertical.  
Cada restricción representa una conexión o alineación con otra vista, el diseño de nivel superior o una guía invisible. Cada 
restricción define la posición de la vista a lo largo del eje vertical u horizontal, por lo que cada vista debe tener un mínimo de una restricción para cada eje, aunque a menudo se necesitan más.

ConstraintLayout permite crear diseños grandes y complejos con una jerarquía de vistas planas, sin grupos de vistas anidados. Es similar a RelativeLayout en el sentido de que todas las vistas se distribuyen de acuerdo con las relaciones entre las vistas del mismo nivel y el diseño principal, pero es más flexible que RelativeLayout y más fácil de usar con el editor de diseño de Android Studio.
Toda la potencia de ConstraintLayout está disponible directamente desde las herramientas visuales del Editor de Diseño, ya que la API de diseño y el Editor de Diseño están especialmente diseñados el uno para el otro. Puede crear su diseño con ConstraintLayout completamente arrastrando en lugar de editar el XML.

<p align="left">
  <img src="https://developer.android.com/static/training/constraint-layout/images/constraint-fail_2x.png" />
</p>
<p align="right">
  <img src="https://developer.android.com/static/training/constraint-layout/images/constraint-fail-fixed_2x.png" />
</p>



