# ArrayList<TipoVariable>

* Es una implementación de tamaño variable de la interfaz List. Implementa todas las operaciones de lista opcionales y permite todos los elementos, incluido null. 
* Además de implementar la interfaz List, esta clase proporciona métodos para manipular el tamaño de la matriz que se usa internamente para almacenar la lista.
* Las operaciones size, isEmpty, get, set, iterator y listIterator se ejecutan en tiempo constante. La operación de adición se ejecuta en tiempo constante amortizado, es decir, la adición de n elementos requiere tiempo O(n).
* Cada instancia de ArrayList tiene una capacidad. La capacidad es el tamaño de la matriz utilizada para almacenar los elementos de la lista.
* Siempre es al menos tan grande como el tamaño de la lista. A medida que se agregan elementos a una ArrayList, su capacidad crece automáticamente.
* Los detalles de la política de crecimiento no se especifican más allá del hecho de que la adición de un elemento tiene un costo de tiempo amortizado constante.
* Una aplicación puede aumentar la capacidad de una instancia de ArrayList antes de agregar un gran número de elementos mediante la operación ensureCapacity. Esto puede reducir la cantidad de reasignación incremental.
