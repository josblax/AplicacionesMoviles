# Funciones principales de un lenguaje de programación.

* 1\. **Comunicación con una computadora.** Usando instrucciones permite crear programas, funciones que cumplen un propósito específico.
* 2\. **Creación de Software.** El software cumple objetivos de solucionar problemas o satisfacer necesidades específicas en una área especpifica de aplicación.
* 3\. **Automatización.** Se usan en procesos repetitivos optimizando o substituyendo interacción humana, desde procesos sencillos, hasta muy complejos.
* 4\. **Resolución de problemas.** Usando algoritmos y estructuras de datos.
* 5\. **Interacción usuario-máquina.** Usando interfaces que permiten satisfacer necesidades de aquellos que lo usan.

[Información adicional Unidad de Apoyo de Aprendizaje UNAM](https://programas.cuaed.unam.mx/repositorio/moodle/pluginfile.php/1023/mod_resource/content/1/contenido/index.html)

___

# Palabra Reservada.

Son palabras usadas para escribir una gramática correcta que puede ser interpretada o compilada por la computadora para producir un resultado.

## Variables y Nombres de Variables

Los nombres de variables deben de reflejar el uso para el que es usado la variable, y para que posteriores programadores puedan comprender el código.


1. Los nombres de variables pueden ser de cualquier longitud
3. Los nombres son diferenciables en mayúsculas o minúsculas.
4. Se pueden separar las asignaciones en la misma línea mediante punto y coma.
5. Puedes usar guión bajo "_" como separador o iniciador de un nombre de una variable.
6. Todas las variables deben llevar un tipo de variable.

## No debes...

1. No iniciar el nombre con un número.
2. No usar caracteres especiales como #,!,%,$ etc...
3. No existen espacios en ningun punto del nombre de una variable.
4. No uses mayúsculas y minúsculas, asumiendo que es la misma variable.

___


# Tipos de Variable

Los tipos de variable se asocian a la identidad del valor de dicha variable a lo largo del problema estas identidades se dividen en cuatro tipos básicos: numérico, texto o alfabético, lógico, carácter
___

## Enteros. Representa un número entero, son valores simples, que representan un valor numérico.

--- 

### short. Variable entera corta.

> Limite: Rango -32,768 a 32,767.

Ejemplo: 

```Java
short a = 100;
```
---

### int. Variable entera normal.

> Limite: Rango -2,147,483,648 a 2,147,483,647.

Ejemplo:

```Java
int b = 1000;
```
---

### long. Variable entera larga.

> Limite: Rango -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807.

Ejemplo:

```Java
long c = 555688722;
```
---

___

## Números fraccionarios/con decimales

### float. Variable decimal con precisión simple. 

> Limite: Rango de una variable float Aproximadamente 1.2E-38 a 3.4E+38
> Precisión: 6-7 digitos

Ejemplo:

```Java
float f = 3.14f;
```
---

### double. Variable decimal con precisión doble.

> Limite: Rango de una variable float Aproximadamente 2.3E-308 a 1.7E+308
> Precisión 15-16 digitos

Ejemplo:

```Java
double g = 3.1415926535;
```
---

___

## boolean. Variable booleana que puede tener solo dos valores {falso,verdadero}.


Ejemplo:

```cplusplus
bool llueve = true; 
bool tiene_sombrilla = false; 
```


---

## Textos y Caracteres

### string. Es una representación de cadenas de caracteres que proporciona muchas funcionalidades útiles para manipular cadenas.

En Java, puedes trabajar con cadenas de caracteres (strings) utilizando la clase Strung



Ejemplo:

```Java
String saludo = "Hola, mundo!";
```

---

### char. Variable que almacena un solo caracter.

> Limite: uede representar caracteres desde -128 a 127 o desde 0 a 255, dependiendo de si se considera signo o no.

Ejemplo:

```Java
char letra = 'a';
char digito = '2';
char simbolo = '%';
```

---