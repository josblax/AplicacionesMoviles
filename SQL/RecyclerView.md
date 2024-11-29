# Recycler View Class

RecyclerView facilita la visualización eficiente de grandes conjuntos de datos. Usted proporciona los datos y define el aspecto de cada elemento, y la biblioteca RecyclerView crea dinámicamente los elementos cuando son necesarios.

Como su nombre lo indica, RecyclerView recicla esos elementos individuales. Cuando un elemento se desplaza fuera de la pantalla, RecyclerView no destruye su vista. En su lugar, RecyclerView reutiliza la vista para los nuevos elementos que se han desplazado en la pantalla. RecyclerView mejora el rendimiento y la capacidad de respuesta de tu app, y reduce el consumo de energía.

fuente: https://developer.android.com/develop/ui/views/layout/recyclerview

Varias clases trabajan juntas para crear su lista dinámica.

1.	`RecyclerView` es el `ViewGroup` que contiene las vistas correspondientes a los datos. Es una vista en sí misma, por lo que se agrega `RecyclerView` al diseño de la misma manera que se agregaría cualquier otro elemento de la interfaz de usuario.
  
2.	Cada elemento individual de la lista está definido por un  objeto de contenedor de vista. Cuando se crea el contenedor de vista, no tiene ningún dato asociado. Una vez creado el contenedor de vista, RecyclerView  lo enlaza a sus datos. El contenedor de vista se define extendiendoRecyclerView.ViewHolder.

3.	RecyclerView solicita vistas y enlaza las vistas a sus datos llamando a métodos en el adaptador. El adaptador se define extendiendo RecyclerView.Adapter.

4.	El administrador de diseño organiza los elementos individuales en su lista. Puede utilizar uno de los administradores de diseño proporcionados por la biblioteca RecyclerView o puede definir el suyo propio. Todos los administradores de diseño se basan en la  clase abstracta LayoutManager de la biblioteca.

