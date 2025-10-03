# Operadores

## Los operadores son de suma importancia en programación ya que permiten operaciones o acciones sobre datos, variables y valores.

### Los operadores aritméticos son importantes para realizar cálculos matemáticos básicos. Nos permiten procesamiento numérico, desde calculos que requieren resolver o contestar problemas o casos que en escencia requieren operaciones simples o complejos.

### Los operadores de comparaciones se utilizan para comparar valores. Estos nos regresaran un valor booleano, es decir, verdadero o falso.

### Los operadores lógicos nos ayudan a validar afirmaciones de nuestras proposiciones son verdaderas o falsas, o si necesito invertir el resultado de dichas afirmaciones.

### Las asignaciones de valores nos permiten asignar un valor a una variable en una cantidad específica, y en algunos casos modificar el valor mientras asignamos o reasignamos el valor.

## Evaluación de operadores lógicos y aritméticos, y precedencia

* La precedencia es la combinación de valores, variables, operadores y funciones que son expresiones que necesitan ser evaluadas y validas. Por ejemplo 5-7
* La mayor precedencia la tienen los parentesis, donde evaluará lo que se encuentre adentro antes que nada.
* La evaluación de los operadores aritméticos básicos (+,*,-,/) tienen una propiedad asociativa de izquierda a derecha.
*  La precedencia es la jerarquía con la que las expresiones son evaluadas, Por ejemplo 10-4*2, donde la multiplicación tiene una mayor prioridad que la suma.

## Numeros y matematicas

Aquí tienes la tabla de precedencia de operadores, traducida al español y en formato Markdown.

| Prioridad | Operadores | Descripción |
| :---: | :--- | :--- |
| **Baja** | `x or y`, `lambda arguments: expression` | **O lógico** (y evaluado solo si x es falso), función anónima |
| | `x and y` | **Y lógico** (y evaluado solo si x es verdadero) |
| | `not x` | **Negación lógica** |
| | `<`, `<=`, `>`, `>=`, `==`, `!=`, `is`, `is not`, `in`, `not in` | **Operadores de comparación**, pruebas de identidad, pertenencia a secuencia |
| | `x \| y` | **O a nivel de bit** |
| | `x ^ y` | **O Exclusivo (XOR) a nivel de bit** |
| | `x & y` | **Y a nivel de bit** |
| | `x << n`, `x >> n` | **Desplazamiento a la izquierda o derecha** de x por n bits |
| | `x + y`, `x - y` | **Adición numérica** o concatenación de secuencias, **sustracción** |
| | `x * y`, `x / y`, `x % y` | **Multiplicación** o repetición de secuencias, **división**, **módulo** |
| | `-x`, `+x`, `~x` | **Negación unaria**, identidad, negación a nivel de bit |
| | `x[i]`, `x[i:j]`, `x.y`, `x(...)` | **Indexación** y rebanado de secuencias, cualificación, **llamada de función** |
| **Alta** | `(...)`, `[...]`, `{...}`, `...` | **Tupla**, **Lista**, **Diccionario**, conversión a cadena de texto |

