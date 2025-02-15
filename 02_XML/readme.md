____

## Creditos & Disclaimer de algunas imagenes usadas en esta sección usadas bajo permiso explicito de Google 

[*Content License*](https://developer.android.com/license)
___

```bash
├──PARTE I: Elementos Básicos
    └── eXtensible Markup Language
        ├── Función principal. Formato de transporte y guardar información.
    └── Estructura
        ├── Declaración de XML <?xml version="1.0" encoding="utf-8"?>
        ├── Elementos (Tags) Widgets/Layouts
            ├── Etiquetas de Inicio/Fin
                ├── <TextView...atributos.../>
                ├── <TableLayout...atributos...></TableLayout>
            ├── Algunos elementos se pueden anidar
        ├── Atributos
            ├── Formato: nombre_atributo/"valor"
        ├── Arbol XML
            ├── Relaciones padre/hijo ("parent")
            ├── Existe un elemento "raiz"
        ├── Namespaces. Define un espacio del elemento para no ser confundido por otros elementos
            ├── atributo <androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
            ├── xmlns:app="http://schemas.android.com/apk/res-auto". Atributos customizados
            ├── xmlns:tools="http://schemas.android.com/tools". Relevantes solo para android studio
├── PARTE II Sintaxis General XML
    ├── Es sensible a mayusculas y minusculas
    ├── Revisa que las anidaciones sean adecuadas.
    ├── Los atributos son encapsulados en...
        ├── " " comillas dobles
        ├── ' ' comillas sencillas
        └── El cierre de etiquetas
            └── Es requerido por todos los elementos.
```
___
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

## Principales atributos usados en XML

___
### id (identificador de widgets)

Se utiliza para identificar cada widget o vista dentro de un layout. Se puede referenciar a sí misma para alinear versus otros lyouts o widgets o para identificarlo en Java para manipulación de entrada y salida de datos.

> Se usa el prefijo @+id/ seguido de un nombre de tu elección.

Ejemplo:

```XML
android:id="@+id/titulo"
```
___

### layout_width (ancho de la vista o widget)

Define el ancho de un componente en un layout. Es una de las propiedades fundamentales que debes especificar al diseñar tu interfaz de usuario. Los valores comunes para layout_width son:

* wrap_content: El ancho del componente se ajusta al tamaño de su contenido.

* match_parent: El componente toma todo el ancho disponible del contenedor padre.

* Valor específico en píxeles o dp (density-independent pixels):

> Puedes establecer un valor fijo, como 80dp, para definir el ancho exacto del componente.


Ejemplo:

```XML
android:layout_width="wrap_content"
```

### layout_height (alto de la vista o widget)

definir la altura de un componente en un layout. Es una propiedad fundamental que necesitas especificar para diseñar tu interfaz de usuario. Los valores comunes para layout_height son:

* wrap_content: La altura del componente se ajusta al tamaño de su contenido.

* match_parent: El componente toma toda la altura disponible del contenedor padre.

* Valor específico en píxeles o dp (density-independent pixels):

> Puedes establecer un valor fijo, como 80dp, para definir la altura exacta del componente.


Ejemplo:

```XML
android:layout_height="wrap_content"
```
___

### layout_margin (margenes)

Define el espacio exterior alrededor de una vista o widget. Hay varias propiedades para establecer márgenes en distintas direcciones. Aquí tienes un resumen de todas sus variaciones:

#### Propiedades de los márgenes

* layout_margin:

Define el margen en todos los lados de la vista.

Ejemplo: 

```
android:layout_margin="16dp"
```

#### layout_marginStart y layout_marginEnd:

Define el margen al inicio y al final de la vista, respetando la direccionalidad del idioma (izquierda o derecha).

Ejemplo:
```
android:layout_marginStart="8dp"
android:layout_marginEnd="8dp"
```

#### layout_marginLeft y layout_marginRight:

Define el margen específicamente en el lado izquierdo o derecho de la vista.

Ejemplo:

```
android:layout_marginLeft="8dp"
android:layout_marginRight="8dp"
```

#### layout_marginTop y layout_marginBottom:


Define el margen en la parte superior o inferior de la vista.

Ejemplo:

```
android:layout_marginTop="8dp"
android:layout_marginBottom="8dp"
```
___

### gravity (gravedad/alineado)

Se Define para especificar cómo se debe alinear el contenido de una vista dentro de sí misma. Es diferente de layout_gravity, que se usa para alinear una vista dentro de su contenedor padre.

gravity: La propiedad gravity se usa principalmente en vistas como TextView, EditText, y Button. Aquí hay algunas de las opciones más comunes para usar con gravity:

* top: Alinea el contenido en la parte superior de la vista.

* bottom: Alinea el contenido en la parte inferior de la vista.

* left: Alinea el contenido a la izquierda de la vista.

* right: Alinea el contenido a la derecha de la vista.

* center: Alinea el contenido en el centro de la vista, tanto horizontal como verticalmente.

* center_horizontal: Alinea el contenido en el centro horizontal de la vista.

* center_vertical: Alinea el contenido en el centro vertical de la vista.

Ejemplo:

```
android:gravity="center"
```
___

### text (texto)

Se define para especificar el texto que se muestra en una vista, como un TextView, Button, EditText, entre otros. Esta propiedad es esencial para definir y mostrar contenido textual en la interfaz de usuario.

Ejemplo:

```
android:text="Ingrese clave : "
```
___

#### Otras propiedades relacionadas con text:

Además de text, hay varias propiedades útiles que te permiten personalizar la apariencia y el comportamiento del texto:

___

##### textColor: Define el color del texto.

Ejemplo:

```
android:textColor="#FF0000"  <!-- Texto en rojo -->
```
___

##### textSize: Establece el tamaño del texto.

Ejemplo:

```
android:textSize="18sp"  <!-- Tamaño de texto de 18sp -->
```
___

##### textStyle: Permite aplicar estilos como negrita (bold) o itálica (italic).

Ejemplo:

```
android:textStyle="bold"  <!-- Texto en negrita -->
```
___

##### textAlignment: Define la alineación del texto dentro de la vista.

Ejemplo:

```
android:textAlignment="center"  <!-- Texto centrado -->
```
___

##### fontFamily: Especifica la familia de fuentes para el texto.

Ejemplo:

```
android:fontFamily="sans-serif"  <!-- Texto en fuente sans-serif -->
```

##### maxLines: Limita el número de líneas de texto que se pueden mostrar.

```
android:maxLines="2"
```
___
