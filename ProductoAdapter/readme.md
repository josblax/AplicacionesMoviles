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

#### Este método se ejecuta por cada fila que aparece en la pantalla.

A. Inflado de la vista (Reciclaje)

```Java
if (convertView == null) {
    convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_producto, parent, false);
}
```
