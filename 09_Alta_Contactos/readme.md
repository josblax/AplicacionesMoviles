# Secuencia de declaraciones y acciones

## 1. Preparación y permisos

### Android Manifest
* Se define el permiso WRITE_CONTACTS necesario para guardar contactos.
* Se solicita este permiso si aún no está concedido.

```Java
contactPermissions = new String[]{Manifest.permission.WRITE_CONTACTS};

```

## 2. Inicialización y selección de imagen

* Se crea un ActivityResultLauncher para seleccionar una imagen de la galería.
* Cuando el usuario la selecciona, se guarda la URI en imagenURI.

```Java
imagePickerLauncher = registerForActivityResult(...);
imagenURI = result.getData().getData();

```

## 3. Evento del botón para guardar contacto
* Cuando se presiona el botón, se valida el permiso y se ejecuta el método guardarContacto().

```Java
binding.boton.setOnClickListener(v -> guardarContacto());
```

## 4. Método guardarContacto()
Este método construye el contacto paso a paso usando una lista llamada cpo de tipo ArrayList<ContentProviderOperation>.

> ¿Qué es cpo?
> Es una lista que acumula operaciones de inserción o modificación sobre la base de datos de contactos.

Estas operaciones se procesan en bloque mediante applyBatch(...).

### Pasos dentro de guardarContacto():


0	Contacto base (RawContact)	RawContacts.CONTENT_URI	(no aplica)	ACCOUNT_TYPE, ACCOUNT_NAME
1	Nombre y apellido	Data.CONTENT_URI	StructuredName.CONTENT_ITEM_TYPE	GIVEN_NAME, FAMILY_NAME
2	Teléfono móvil	Data.CONTENT_URI	Phone.CONTENT_ITEM_TYPE	NUMBER, TYPE_MOBILE
3	Teléfono casa	Data.CONTENT_URI	Phone.CONTENT_ITEM_TYPE	NUMBER, TYPE_HOME
4	Correo electrónico	Data.CONTENT_URI	Email.CONTENT_ITEM_TYPE	DATA, TYPE_WORK
5	Dirección postal	Data.CONTENT_URI	StructuredPostal.CONTENT_ITEM_TYPE	FORMATTED_ADDRESS, TYPE_HOME
6	Fotografía (si se selecciona imagen)	Data.CONTENT_URI	Photo.CONTENT_ITEM_TYPE
