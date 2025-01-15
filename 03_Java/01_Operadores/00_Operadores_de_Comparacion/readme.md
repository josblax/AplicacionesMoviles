# Operadores comparativos

Son usados para comparar valores. Y solo regresan un valor de verdadero o falso. De acuerdo a la expresión evaluada.
___

Todos los ejemplos usan las siguientes variables 

```cplusplus
// Enteros
	int n1 = 10;
	int n2 = 20;

	// Floats
	float f1 = 1.5;
	float f2 = 5.2;
```
___

## ">" Mayor a - Verdadero si el operando izquierdo es mayor al derecho, x > y.

Ejemplo:

```cplusplus
// 1. Mayor que
	System.out.println("(n1 > n2): " + (n1 > n2));
	System.out.println("(f1 > f2): " + (f1 > f2));
```

___

## "<" Menor a - Verdadero si el operando izquierdo es menor al de la derecha, x < y.

Ejemplo:

        // 2. Menor que
        System.out.println("(n1 < n2): " + (n1 < n2));
        System.out.println("(f1 < f2): " + (f1 < f2));

___

## "==" Igual a - Verdadero si ambos operandos son iguales, x==y.

Ejemplo:

        // 3. Igualdad
        System.out.println("(n1 == n2): " + (n1 == n2));
        System.out.println("(f1 == f2): " + (f1 == f2));

___


## "!=" Diferente a - Verdadero si ambos operadores son diferentes, x!= y.

Ejemplo:

        // 4. Desigualdad
        System.out.println("(n1 != n2): " + (n1 != n2));
        System.out.println("(f1 != f2): " + (f1 != f2));

___

 ## ">=" Mayor o igual - Verdadero si el operando izquierdo es mayor o igual al derecho, x >= y.

 Ejemplo:

        // 5. Mayor o igual que
        System.out.println("(n1 >= n2): " + (n1 >= n2));
        System.out.println("(f1 >= f2): " + (f1 >= f2));

___

## "<=" Menor o igual - Verdadero si el operando izquierdo es menor o igual al derecho, x <= y.

Ejemplo:


        // 6. Menor o igual que
        System.out.println("(n1 <= n2): " + (n1 <= n2));
        System.out.println("(f1 <= f2): " + (f1 <= f2));

 ___

 ## Ejemplos mixtos

        // 7. Comparaciones de tipos mixtos
        System.out.println("(n1 > f2): " + (n1 > f2));
        System.out.println("(f1 < n2): " + (f1 < n2));

        // 8. Valores negativos
        System.out.println("(n1 > -n2): " + (n1 > -n2));
        System.out.println("(f1 < -f2): " + (f1 < -f2));

        // 9. Combinación de comparaciones
        System.out.println("((n1 < n2) && (f1 > f2)): " + ((n1 < n2) && (f1 > f2)));
        System.out.println("((n1 == 10) || (f1 == 5.2)): " + ((n1 == 10) || (f1 == 5.2)));

        // 10. Comparaciones anidadas
        System.out.println("(n1 > n2 - 10): " + (n1 > n2 - 10));
        System.out.println("(f1 <= f2 + 10.5): " + (f1 <= f2 + 10.5));

        // 11. Comparacón con constantes
        System.out.println("(n1 == 10): " + (n1 == 10));
        System.out.println("(f1 == 5.2): " + (f1 == 5.2));

        // 12. Comparación con los resultados de las operaciones aritméticas
        System.out.println("((n1 + n2) < (f1 * f2)): " + ((n1 + n2) < (f1 * f2)));
        System.out.println("((n1 - n2) >= (f1 / f2)): " + ((n1 - n2) >= (f1 / f2)));

        // 13. Comparación de resultados negativos y positivos
        System.out.println("((-n1) < n2): " + ((-n1) < n2));
        System.out.println("((-f1) < f2): " + ((-f1) < f2));

        // 14. Combinación de aritméticas y comparación
        System.out.println("((n1 * n2) > (f1 - f2)): " + ((n1 * n2) > (f1 - f2)));
        System.out.println("((n2 / n1) <= (f1 + f2)): " + ((n2 / n1) <= (f1 + f2)));

        // 15. Comparaciones encadenadas
        System.out.println("(n1 < n2 && n2 < f1): " + (n1 < n2 && n2 < f1));
        System.out.println("(f2 > f1 && f1 > n1): " + (f2 > f1 && f1 > n1));

        // 16. Comparación de módulos
        System.out.println("((n2 % n1) == 0): " + ((n2 % n1) == 0));
    }
}
