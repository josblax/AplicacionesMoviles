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

### 5. ¿Qué es imageBytes?
Es una variable byte[] que contiene los datos de la imagen convertida desde la URI.

Se obtiene usando el método imageUriToBytes().

#### Explicación de imageUriToBytes():

* Convierte la imagen seleccionada (imagenURI) en un arreglo de bytes.
* La imagen se redimensiona (500x500) y se comprime en JPEG con calidad 50%.

```Java
Bitmap resized = Bitmap.createScaledBitmap(bitmap, 500, 500, true);
resized.compress(Bitmap.CompressFormat.JPEG, 50, baos);
return baos.toByteArray();
```
### 6. Aplicación de las operaciones

* Todas las operaciones de la lista cpo se ejecutan de forma atómica usando:

```Java
getContentResolver().applyBatch(ContactsContract.AUTHORITY, cpo);
```

### 7. Limpieza de pantalla

* Una vez creado el contacto, los campos se limpian para que el usuario pueda crear otro.

```Java
binding.nombre.setText(""); // etc.
imagenURI = null;
```

```
├── 1. CONFIGURACIÓN DEL ENTORNO (Gradle & Manifest)
│   ├── build.gradle (Module: App)
│   │   └── Habilitar ViewBinding
│   │       └── Instrucción: `buildFeatures { viewBinding = true }`
│   │
│   └── AndroidManifest.xml
│       ├── Permiso de Lectura (Para Galería)
│       │   └── XML: `<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>`
│       └── Permiso de Escritura (Para Contactos)
│           └── XML: `<uses-permission android:name="android.permission.WRITE_CONTACTS"/>`
│
├── 2. INTERFAZ DE USUARIO (activity_main.xml)
│   ├── Contenedor Raíz
│   │   └── Tipo: `LinearLayout` (orientation="vertical", padding="16dp")
│   │
│   ├── Elemento: Imagen de Perfil
│   │   ├── ID: `@+id/imagen`
│   │   ├── Tamaño: width="120dp", height="120dp"
│   │   └── Acción UX: `android:layout_gravity="center"`
│   │
│   ├── Formulario de Entrada (EditTexts)
│   │   ├── Campo: Nombre
│   │   │   ├── ID: `@+id/nombre`
│   │   │   └── InputType: `textPersonName`
│   │   ├── Campo: Apellido Paterno
│   │   │   └── InputType: `textPersonName`
│   │   ├── Campo: Celular
│   │   │   └── InputType: `phone`
│   │   ├── Campo: Teléfono Casa
│   │   │   └── InputType: `phone`
│   │   ├── Campo: Email
│   │   │   └── InputType: `textEmailAddress`
│   │   └── Campo: Dirección
│   │       └── InputType: `textPostalAddress`
│   │
│   └── Elemento: Botón Guardar
│       ├── Tipo: `FloatingActionButton`
│       ├── ID: `@+id/boton`
│       └── Ubicación: `android:layout_gravity="end"`
│
├── 3. LÓGICA JAVA: Variables y OnCreate (MainActivity.java)
│   ├── Declaración de Variables Globales
│   │   ├── Binding: `ActivityMainBinding binding;`
│   │   ├── Permisos: `private String[] contactPermissions;`
│   │   ├── URI Imagen: `private Uri imagenURI;`
│   │   └── Launcher Galería: `private ActivityResultLauncher<Intent> imagePickerLauncher;`
│   │
│   └── Método: onCreate()
│       ├── Paso 1: Inicializar Binding
│       │   ├── `binding = ActivityMainBinding.inflate(getLayoutInflater());`
│       │   └── `setContentView(binding.getRoot());`
│       │
│       ├── Paso 2: Configurar Launcher de Galería (Moderno)
│       │   └── `registerForActivityResult(new StartActivityForResult(), result -> { ... })`
│       │       └── Condición: `if (result.getResultCode() == RESULT_OK)`
│       │           └── Acción: `binding.imagen.setImageURI(result.getData().getData());`
│       │
│       ├── Paso 3: Listener de Imagen (Click)
│       │   └── `binding.imagen.setOnClickListener(v -> abrirGaleria());`
│       │
│       └── Paso 4: Listener de Botón Guardar (Click)
│           └── Verificar Permisos: `ContextCompat.checkSelfPermission(...)`
│               ├── SI NO tiene permiso: `requestPermissions(...)`
│               └── SI TIENE permiso: `guardarContacto();`
│
├── 4. LÓGICA JAVA: Métodos Auxiliares
│   ├── Método: abrirGaleria()
│   │   ├── Crear Intent: `new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);`
│   │   └── Lanzar: `imagePickerLauncher.launch(intent);`
│   │
│   └── Método: imageUriToBytes()
│       ├── Objetivo: Convertir la imagen visible a `byte[]` para la base de datos.
│       ├── Bitmap: `MediaStore.Images.Media.getBitmap(...)`
│       ├── Redimensionar: `Bitmap.createScaledBitmap(bitmap, 500, 500, true);`
│       ├── Comprimir: `resized.compress(Bitmap.CompressFormat.JPEG, 50, baos);`
│       └── Retorno: `return baos.toByteArray();`
│
└── 5. LÓGICA JAVA: Content Provider (guardarContacto)
    ├── Paso 1: Obtener textos de la UI
    │   └── Ejemplo: `String nombre = binding.nombre.getText().toString().trim();`
    │
    ├── Paso 2: Crear Lista de Operaciones
    │   └── `ArrayList<ContentProviderOperation> cpo = new ArrayList<>();`
    │
    ├── Paso 3: Operación MAESTRA (RawContact)
    │   └── `cpo.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI)`
    │       └── `.withValue(ACCOUNT_TYPE, null)`
    │       └── `.withValue(ACCOUNT_NAME, null)`
    │
    ├── Paso 4: Operaciones VINCULADAS (Usando BackReference)
    │   ├── Insertar Nombre (StructuredName)
    │   │   ├── `withValueBackReference(RAW_CONTACT_ID, 0)` (Enlazar a Op Maestra)
    │   │   ├── `withValue(MIMETYPE, StructuredName.CONTENT_ITEM_TYPE)`
    │   │   └── `withValue(GIVEN_NAME, nombre)`
    │   │
    │   ├── Insertar Celular (Phone)
    │   │   ├── `withValueBackReference(RAW_CONTACT_ID, 0)`
    │   │   ├── `withValue(MIMETYPE, Phone.CONTENT_ITEM_TYPE)`
    │   │   ├── `withValue(NUMBER, celular)`
    │   │   └── `withValue(TYPE, Phone.TYPE_MOBILE)`
    │   │
    │   ├── Insertar Email (Email)
    │   │   ├── `withValue(MIMETYPE, Email.CONTENT_ITEM_TYPE)`
    │   │   └── `withValue(DATA, email)`
    │   │
    │   └── Insertar Foto (Photo) - *Solo si existe*
    │       ├── Condición: `if (imageBytes != null)`
    │       ├── `withValue(MIMETYPE, Photo.CONTENT_ITEM_TYPE)`
    │       └── `withValue(PHOTO, imageBytes)`
    │
    └── Paso 5: Ejecución Final (Commit)
        └── Try/Catch Block
            ├── Ejecutar: `getContentResolver().applyBatch(ContactsContract.AUTHORITY, cpo);`
            └── Notificar: `Toast.makeText(...)`
```


