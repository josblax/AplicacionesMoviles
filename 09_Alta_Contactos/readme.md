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

#### Contacto base (RawContact)

URI destino: RawContacts.CONTENT_URI

MIME Type: No aplica

Campos usados: ACCOUNT_TYPE, ACCOUNT_NAME

#### Nombre y apellido

URI destino: Data.CONTENT_URI

MIME Type: StructuredName.CONTENT_ITEM_TYPE

Campos usados: GIVEN_NAME, FAMILY_NAME

#### Teléfono móvil

URI destino: Data.CONTENT_URI

MIME Type: Phone.CONTENT_ITEM_TYPE

Campos usados: NUMBER, TYPE_MOBILE

#### Teléfono de casa

URI destino: Data.CONTENT_URI

MIME Type: Phone.CONTENT_ITEM_TYPE

Campos usados: NUMBER, TYPE_HOME

#### Correo electrónico

URI destino: Data.CONTENT_URI

MIME Type: Email.CONTENT_ITEM_TYPE

Campos usados: DATA, TYPE_WORK

#### Dirección postal

URI destino: Data.CONTENT_URI

MIME Type: StructuredPostal.CONTENT_ITEM_TYPE

Campos usados: FORMATTED_ADDRESS, TYPE_HOME

#### Fotografía

URI destino: Data.CONTENT_URI

MIME Type: Photo.CONTENT_ITEM_TYPE

Campos usados: PHOTO (byte[])

> El MIME Type (Multipurpose Internet Mail Extensions) es una forma estándar de identificar el tipo de contenido que se está manejando, especialmente en comunicaciones por internet como HTTP o correo electrónico.

> ¿Para qué sirve?

Le dice al navegador, servidor o aplicación qué tipo de datos está recibiendo o enviando.

Permite que el sistema sepa cómo procesar o mostrar ese contenido.


En Android (como en tu tabla de guardar contacto): Cada dato que se guarda (nombre, teléfono, correo, etc.) se identifica con un MIME Type específico para que el sistema sepa cómo tratarlo. Por ejemplo:

vnd.android.cursor.item/phone_v2 → número de teléfono

vnd.android.cursor.item/email_v2 → correo electrónico

vnd.android.cursor.item/photo → fotografía


