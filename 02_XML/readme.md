# Escribir en XML Extensible Markup Language

Con el vocabulario XML de Android, puedes diseñar rápidamente los diseños de la interfaz de usuario y los elementos de pantalla que contienen, de la misma manera que creas páginas web en HTML con una serie de elementos anidados.

Cada archivo de diseño debe contener exactamente un elemento raíz, que debe ser un objeto View o ViewGroup. Después de definir el elemento raíz, puede agregar objetos de diseño o widgets adicionales como elementos secundarios para crear gradualmente una jerarquía de vistas que defina el diseño. 

Por ejemplo, este es un diseño XML que usa un LinearLayout vertical para contener un TextView y un Button:

![xml](https://github.com/josblax/AplicacionesMoviles/blob/main/Images/Captura%20de%20pantalla%202024-09-15%20113332.png)



[Fuente](https://developer.android.com/develop/ui/views/layout/declaring-layout)

**XML (Extensible Markup Language)** es un lenguaje de marcado similar a HTML, pero sin etiquetas predefinidas para usar. En su lugar, usted define sus propias etiquetas diseñadas específicamente para sus necesidades. Esta es una forma eficaz de almacenar datos en un formato que se puede almacenar, buscar y compartir. Y lo que es más importante, dado que el formato fundamental de XML está estandarizado, si comparte o transmite XML a través de sistemas o plataformas, ya sea localmente o a través de Internet, el destinatario aún puede analizar los datos debido a la sintaxis XML estandarizada.

[Fuente](https://developer.mozilla.org/en-US/docs/Web/XML/XML_introduction)

## Caracteristicas:

* **Lenguaje de marcado:** XML utiliza etiquetas para anotar datos, proporcionando contexto y estructura.

* **Etiquetas definidas por el usuario:**  Usted crea sus propias etiquetas para representar los datos con los que está trabajando. Esto hace que XML sea muy flexible y adaptable.

* **Almacenamiento e intercambio de datos:** XML está diseñado para almacenar y transportar datos. Su formato estandarizado facilita el intercambio de datos entre diferentes sistemas y plataformas.

* **Legibles por humanos y máquinas:** Los documentos XML están basados en texto, lo que los hace fáciles de leer y entender para los humanos. Al mismo tiempo, el formato estructurado permite que el software analice y procese los datos de manera eficiente.

* **Cómo funciona XML:** XML utiliza una estructura jerárquica, con elementos anidados unos dentro de otros. Cada elemento está definido por una etiqueta de inicio y una etiqueta de fin.