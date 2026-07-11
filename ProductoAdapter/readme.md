# Producto Adapter (Adaptador Customizado)

Este código es un componente fundamental en Android: un Adapter. Su trabajo es ser el puente entre tus datos (ArrayList<Producto>) y la interfaz visual (ListView). Sin él, no podrías mostrar una lista dinámica donde cada fila tenga sus propios controles interactivos.


### 1. La clase y el Constructor

```Java
public class ProductoAdapter extends ArrayAdapter<Producto> {
    public ProductoAdapter(Context context, ArrayList<Producto> productos) {
        super(context, 0, productos);
    }
```

* **Extensión**: Heredamos de ArrayAdapter<Producto>. Esto le da a nuestra clase todas las herramientas para manejar listas de objetos de tipo Producto.

* **Constructor**: Pasamos el contexto (la actividad que lo llama) y la lista de datos. El 0 en super indica que no usaremos un layout predeterminado de Android, sino que inflaremos nuestro propio diseño (R.layout.list_item_producto).


### 2. El método getView (El motor de la lista)

* **Este método se ejecuta por cada fila que aparece en la pantalla.**

#### A. Inflado de la vista (Reciclaje)

```Java
if (convertView == null) {
    convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_producto, parent, false);
}
```

* Android es inteligente: no crea mil vistas si solo caben 5 en pantalla. Reutiliza (convertView) las filas que ya no son visibles. 

* Si convertView es nulo, significa que la fila se está creando por primera vez; si no, la reciclamos para ahorrar memoria.

#### B. Obtención de datos y Vistas

```Java
Producto producto = getItem(position);
TextView textNombre = convertView.findViewById(R.id.textNombre);
// ... findViewById para los demás elementos
```

**En este paso, realizamos dos acciones fundamentales:**

* **Recuperar el objeto**: Con getItem(position), obtenemos la información del Producto específico que corresponde a la fila que el sistema está dibujando en este momento.

* **Vincular la vista**: Con findViewById, accedemos a los componentes visuales (como TextView o EditText) que definimos en nuestro archivo XML. Esto nos permite conectar los datos del objeto con los elementos que el usuario verá y podrá editar en la pantalla.

#### C. Asignación de valores

```Java
textNombre.setText(producto.getNombre());
textPrecio.setText(String.format("$%.2f", producto.getPrecio()));
```

Simplemente tomamos los datos del objeto Producto y los colocamos en los componentes visuales. El String.format es una excelente práctica para asegurar que el precio siempre tenga dos decimales.

### 3. Interactividad con TextWatcher

Esta es la parte más interesante. Queremos que, en el momento en que el usuario escriba una cantidad en el EditText, ese dato se guarde automáticamente en el objeto Producto.

```Java
editCantidad.addTextChangedListener(new TextWatcher() {
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        try {
            int cantidad = Integer.parseInt(s.toString());
            producto.setCantidad(cantidad); // Guardado en tiempo real
        } catch (NumberFormatException e) {
            producto.setCantidad(0); // Manejo de error si borran todo
        }
    }
    // beforeTextChanged y afterTextChanged se dejan vacíos por obligación del contrato
});
```

* **¿Por qué un Listener?** Si esperáramos a que el usuario presione un botón "Calcular" al final, sería más sencillo. Pero al usar TextWatcher, estamos haciendo una interfaz responsiva.

* **Try-Catch**: Este es el punto crítico de lógica que mencionamos en las rúbricas de evaluación. Si el usuario borra el texto, Integer.parseInt intentaría convertir un string vacío, lo que provocaría un Force Close. El try-catch evita que la aplicación colapse.

### En resumen

* **Patrón de Adaptador**: Es el intermediario que "adapta" un objeto Java a un elemento de interfaz Android.

* **Optimización**: El uso de convertView != null es lo que permite que una lista de 1,000 productos no bloquee el teléfono.

* **Seguridad de tipos**: El uso de TextWatcher con un try-catch es la diferencia entre una app "juguete" y una app profesional que no se cierra ante el error humano.

## Como se llenan las filas con informacion?

Para "poblar" la pantalla, es decir, para que los datos del ArrayList aparezcan en el ListView antes de que el usuario interactúe, la instrucción clave no es una sola línea, sino la combinación de crear el adaptador y asignarlo al ListView.

La instrucción definitiva es:

```Java
listView.setAdapter(adapter);
```

**¿Por qué esta es la instrucción funciona?**

Aunque tú rellenas el ArrayList previamente, el ListView no sabe que esos datos existen hasta que ejecutas esta línea. Aquí te explico qué sucede internamente en ese momento:

* **Conexión**: Al hacer listView.setAdapter(adapter), le estás diciendo al componente visual: "Este adapter tiene la lista de tus datos y sabe cómo dibujarlos".

* **Solicitud de datos**: El ListView inmediatamente le pregunta al adaptador: "¿Cuántos elementos tengo?" (getCount()).

* **Renderizado inicial**: El ListView le pide al adaptador que le entregue las vistas (llamando al método getView()) para todas las filas que caben en el espacio físico de la pantalla.

## El flujo completo en MainActivity.java

### Para que esto funcione correctamente en tu onCreate, el flujo debe ser este:

```Java
// 1. Preparas los datos (los objetos Producto)
productos = new ArrayList<>();
productos.add(new Producto("Detergente", 130.00));
// ... otros productos

// 2. Creas el adaptador, pasándole la lista llena
ProductoAdapter adapter = new ProductoAdapter(this, productos);

// 3. LA INSTRUCCIÓN QUE POBLA LA PANTALLA
listView.setAdapter(adapter);
```

### NOTAS

#### El adaptador como intermediario: Es fundamental que entiendan que el ListView es un contenedor "tonto" (solo sabe mostrar lo que le dan) y el ArrayList es solo el almacenamiento. El adapter es el "traductor" necesario entre ambos.

#### ¿Qué pasa si olvido esa línea? La aplicación compilará perfectamente, pero el usuario verá una pantalla en blanco, porque el ListView nunca recibió la orden de mostrar los elementos.

#### Actualización dinámica: Si más adelante añaden un producto nuevo al ArrayList usando productos.add(...), la pantalla no se actualizará sola. Tendrán que llamar a adapter.notifyDataSetChanged() para avisarle al adapter que los datos cambiaron y debe volver a dibujar la lista.

**Cómo lograr que aparezca el menú correcto de getItem (Overrides)**:

Haz clic dentro del archivo: Abre tu clase ProductoAdapter.java y haz clic con el mouse justo dentro de las llaves de la clase, por ejemplo, después de la línea del constructor.

Verifica la combinación:

* Para el menú de Override Methods, intenta usar: Control + O (incluso en Mac, a veces Android Studio prioriza Cmd+O para navegación).

* Alternativa infalible: Ve al menú superior de Android Studio:

    * Haz clic en Code.

    * Selecciona Generate...

Elige Override Methods...
