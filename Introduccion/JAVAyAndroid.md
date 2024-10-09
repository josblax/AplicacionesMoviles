# Como trabajan Java y Android Juntos

Después de escribir un programa en Java para Android, hacemos clic en un botón para cambiar nuestro código a otra forma que sea entendida por Android. Esta otra forma se denomina código Dalvik EXecutable (DEX) y el proceso de transformación se denomina compilación. La compilación se lleva a cabo en la máquina de desarrollo después de hacer clic en ese botón. Veremos este trabajo justo después de configurar nuestro entorno de desarrollo.

Android es un sistema bastante complejo, pero no es necesario entenderlo en profundidad para poder crear aplicaciones increíbles. La parte del sistema Android que ejecuta (ejecuta) nuestro código DEX compilado se llama Dalvik Virtual Machine (DVM). El DVM en sí es una pieza de software escrita en otro idioma que se ejecuta en una versión especialmente adaptada del sistema operativo Linux. Entonces, lo que el usuario ve de Android es en sí mismo solo una aplicación que se ejecuta en otro sistema operativo.

El propósito del DVM es ocultar la complejidad y diversidad del hardware y el software en el que se ejecuta Android, pero, al mismo tiempo, su propósito es exponer todas sus características útiles. Esta exposición de características generalmente funciona de dos maneras. El propio DVM debe tener acceso al hardware, lo cual tiene, pero este acceso debe ser amigable para el programador y fácil de usar. La forma en que el DVM nos permite el acceso es realmente fácil de usar debido a la interfaz de programación de aplicaciones (API) de Android.


*Bibliografia* 
## Android Programming for Beginners by John Horton, Paresh Mayani, Editorial Packt
