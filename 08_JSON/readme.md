# JSON Javascript Object Notation

JSON es un formato ligero, legible, y estructurado para almacenar y transportar datos. Se usa en servicios web, apps móviles, configuración de sistemas, APIs, etc.

## Puntos clave para entender y escribir JSON
1. Pares clave-valor: Cada dato está representado como "clave": valor.
Ejemplo: "nombre": "Juan"
2. Estructura basada en objetos {}: Un JSON completo suele empezar con {} que agrupa pares clave-valor.

### Ejemplo:

```JSON
{
  "ciudad": "México",
  "poblacion": 21000000
}

```

3. Listas o arreglos []: Para múltiples valores, se usan corchetes.

### Ejemplo:

```JSON
{
  "monedas": ["USD", "EUR", "JPY"]
}
```

4. Tipos de datos permitidos
String: "texto"
Number: 123 o 123.45
Boolean: true, false
Null: null
Object: {...}
Array: [...]

5. Uso de comillas dobles: Las claves y cadenas deben usar comillas dobles " ". Las comillas simples ' ' no son válidas en JSON estándar.

6. 6. Separación por comas: Entre pares clave-valor o elementos de listas se usa una coma ,. Pero no se permite una coma después del último elemento.
7. No permite comentarios: A diferencia de otros formatos, no puedes agregar // ni /* */. JSON debe estar limpio.
8. Jerarquía y anidación: Puedes tener objetos dentro de objetos o arrays dentro de objetos.

### Ejemplo:

'''JSON

  {
  "usuario": {
    "nombre": "Ana",
    "edad": 30
  }
}

9. Formato amigable para máquinas y humanos: Fácil de leer tanto por humanos como por software. Ideal para APIs RESTful, configuración de frontend/backend, IoT, etc.

10. Extensión de archivo estándar: Se guarda como .json. Ejemplo: config.json

11. Validación de estructura: Puedes usar herramientas como https://jsonlint.com para verificar si tu JSON está bien formado.

12. No acepta funciones: No se puede incluir código o funciones dentro de JSON. Solo datos.

13. Interoperabilidad universal: JSON es compatible con casi todos los lenguajes de programación: Java, Python, JavaScript, Kotlin, Swift, etc.
'''

## ¿Cómo leer JSON en Android?

Usas clases como JSONObject, JSONArray, y métodos como getString(), getDouble(), etc.

### Ejemplo:

```Java
JSONObject json = new JSONObject(jsonStr);
double tasaAUD = json.getJSONObject("rates").getDouble("AUD");
```

## Como escribir en JSON

1. Cómo usar y escribir en JSON (máximo 10 claves)
2. Estructura de clave y valor: Todo se compone de pares "clave": valor.
3. Llaves {} para objetos: Agrupan pares clave-valor.
4.  Corchetes [] para listas: Úsalos para arrays, como ["USD","EUR"].
5.  Strings con comillas dobles: Siempre deben ir entre " ".
6.  Valores pueden ser: Números, cadenas, booleanos (true/false), null, objetos o listas.
7. Jerarquía anidada: Puedes tener objetos dentro de objetos, como en "rates".
8. Separar con comas: Cada par clave-valor se separa con ,.
9. No se permite comentarios: JSON es limpio y sin anotaciones.
10. Formato legible por máquinas: Usado en APIs, config files, apps móviles, etc.
11. Extensión estándar: .json es el formato de archivo utilizado.

