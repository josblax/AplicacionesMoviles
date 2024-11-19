# SQL (Structured Query Language)

Para que una aplicación sea significativa, debe capturar gran cantidad de datos, existen muchos recursos como JSON, CSV para administrar datos en línea. Otro recurso es SQL, para manejar y administrar datos localmente.

## Objetivos

* Que es una base de datos
* Que es SQL y SQLite
* Conceptos básicos del lenguage SQL
* Android SQL API
* Crear una pequeña aplicación con SQLite

  
Que es una base de Datos?

Es un recurso para guardar y obtener información, así como la manipulación de la misma. La data es guardada en forma de tabla, semejante a una hoja de excel, conde las columnas representan los campos, y los reglones los registros o entradas a la base de datos.

![image](https://github.com/user-attachments/assets/ff3e48b5-98a6-4ef9-9947-2c2d16a135f8)

La suma de todos los componentes, se denominan tablas.

# Que es SQL?

SQL significa Lenguaje Estructurado de Querys o Structured Query Language, que es la sintaxis que es usada para ejecutar las operaciones en las bases de datos.

# Que es SQLite?

Es una aplicación de bases de datos que será usada en Android, y tiene una versión customizada de SQL, es decir, las características pueden variar un poco.

# Sintaxis SQL.

## Funciones SQL

* **INSERT** Permite añadir datos nuevos registros a la base de datos.
* **DELETE** Remueve datos de la base de datos
* **SELECT** Permite leer datos de la base de datos
* **WHERE** Nos permite seleccionar partes de la base de datos que cumplan con los criterios seleccionados ya sea para alguna de las tres acciones anteriores.
* **FROM** Se usa pra especificar una tabla o columna en la base de datos.

## Tipos de datos en SQL

* **integer** nos sirve para guardar numeros enteros.
* **text** nos sirve para guardar datos alfanumericos.
* **real** nos sirve para guardar datos com punto flotante.

## Crear una tabla

Las bases de datos son privadas a la app. Una vez creada una base de datos podremos crear una tabla, por ejemplo:

**create** table Estudiantes **_ID integer** primary key autoincrement not null,
**nombre** text not null,
**grado** int;


