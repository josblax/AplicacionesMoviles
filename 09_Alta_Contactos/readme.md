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


# Proyecto: AgregaContacto (Android Java)

## 1. Configuración del Proyecto (Gradle & Manifest)
### 1.1. AndroidManifest.xml [Esencial]
* **Permisos de Escritura:** `<uses-permission android:name="android.permission.WRITE_CONTACTS"/>`
    * [cite_start]*Nota:* Necesario para guardar en la base de datos del teléfono[cite: 6].
* **Permisos de Lectura:** `<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE"/>`
    * [cite_start]*Nota:* Para seleccionar la foto de la galería[cite: 5].

### 1.2. build.gradle (Module: App)
* **ViewBinding:** Habilitar para evitar el uso excesivo de `findViewById`.
    * [cite_start]Código: `buildFeatures { viewBinding = true }`.

## 2. Diseño de Interfaz (XML Layout)
### 2.1. Recursos (res/drawable)
* **Iconos:** Importar Vector Assets para la imagen por defecto y el botón de guardar.
    * [cite_start]*ic_person_placeholder* (para el ImageView)[cite: 15].
    * [cite_start]*ic_save* (para el FAB)[cite: 109].

### 2.2. activity_main.xml (Estructura)
* **Contenedor Principal:** `ScrollView` (Recomendado para asegurar que el formulario se vea en pantallas pequeñas).
    * **Layout Hijo:** `LinearLayout` (Vertical).
* **Componentes de Entrada (Inputs)**
    * **Imagen de Perfil:** `ImageView`
        * ID: `@+id/imagen`
        * [cite_start]Acción: Al hacer clic, abre la galería[cite: 149].
    * [cite_start]**Nombre:** `EditText` (InputType: `textPersonName`)[cite: 28].
    * [cite_start]**Apellido:** `EditText` (InputType: `textPersonName`)[cite: 41].
    * [cite_start]**Teléfono Celular:** `EditText` (InputType: `phone`)[cite: 54].
    * [cite_start]**Teléfono Casa:** `EditText` (InputType: `phone`)[cite: 67].
    * [cite_start]**Email:** `EditText` (InputType: `textEmailAddress`)[cite: 80].
    * [cite_start]**Dirección:** `EditText` (InputType: `textPostalAddress`)[cite: 93].
* **Botón de Acción:** `FloatingActionButton`
    * ID: `@+id/salvar`
    * [cite_start]Ubicación: Esquina inferior derecha (gravity: bottom|end)[cite: 100].

## 3. Lógica Principal (MainActivity.java)
### 3.1. Inicialización
* **Declaración de Variables Globales**
    * [cite_start]Constantes para códigos de permisos (ej. `WRITE_CONTACT_PERMISSION_CODE = 100`)[cite: 124].
    * [cite_start]URI de la imagen seleccionada (`image_uri`)[cite: 137].
    * [cite_start]Binding (`ActivityMainBinding`)[cite: 115].
* **Método onCreate()**
    * [cite_start]Inflar la vista con Binding[cite: 144].
    * Configurar Listeners (`setOnClickListener`):
        * [cite_start]Botón Imagen -> Ejecutar `abrirGaleria()`[cite: 151].
        * [cite_start]Botón Salvar -> Ejecutar `salvarContacto()`[cite: 154].

### 3.2. Gestión de Permisos (Runtime Permissions)
* [cite_start]**Verificar Permiso:** `checkSelfPermission` antes de intentar guardar[cite: 328].
* [cite_start]**Solicitar Permiso:** `requestPermissions` si no está otorgado[cite: 341].
* **Manejar Respuesta:** `onRequestPermissionsResult`
    * [cite_start]Si el usuario acepta -> Llamar a `salvarContacto()`[cite: 359].
    * [cite_start]Si el usuario niega -> Mostrar `Toast` explicativo[cite: 361].

### 3.3. Gestión de Imagen (Galería)
* [cite_start]**Intent de Galería:** `Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)`[cite: 162].
* **Procesar Resultado (onActivityResult)**
    * [cite_start]Verificar `RESULT_OK` y código de solicitud[cite: 166].
    * [cite_start]Obtener URI: `data.getData()`[cite: 173].
    * [cite_start]Mostrar en ImageView: `setImageURI()`[cite: 174].
* **Conversión (Helper Method):** `imageUriToBytes()`
    * [cite_start]Objetivo: Convertir el Bitmap a `byte[]` para poder guardarlo en la base de datos de contactos[cite: 258].
    * [cite_start]Uso de `ByteArrayOutputStream` y compresión JPEG[cite: 312].

### 3.4. Lógica de Guardado (ContentProvider)
* *Concepto Clave:* Los contactos en Android se guardan mediante `ContentProviderOperation` en lote (Batch).
* **Paso 1: Obtener Datos de la UI**
    * [cite_start]Extraer texto de los EditTexts y convertir a String (usando `.trim()`)[cite: 185].
* **Paso 2: Crear el ArrayList de Operaciones**
    * [cite_start]`ArrayList<ContentProviderOperation> cpo = new ArrayList<>()`[cite: 201].
* **Paso 3: Definir el RawContact (Identificador)**
    * [cite_start]Insertar un registro vacío en `RawContacts.CONTENT_URI` para obtener un nuevo ID[cite: 214].
* **Paso 4: Insertar Datos (Vinculados al RawContact ID)**
    * **Nombre Estructurado (StructuredName):**
        * MimeType: `StructuredName.CONTENT_ITEM_TYPE`.
        * [cite_start]Datos: `GIVEN_NAME` (Nombre) y `FAMILY_NAME` (Apellido)[cite: 218].
    * **Teléfonos (Phone):**
        * MimeType: `Phone.CONTENT_ITEM_TYPE`.
        * [cite_start]Móvil: `Phone.TYPE_MOBILE`[cite: 230].
        * [cite_start]Casa: `Phone.TYPE_HOME`[cite: 239].
    * **Correo (Email):**
        * [cite_start]MimeType: `Email.CONTENT_ITEM_TYPE`[cite: 244].
    * **Dirección (SipAddress/StructuredPostal):**
        * [cite_start]MimeType: `SipAddress.CONTENT_ITEM_TYPE` (o Postal)[cite: 252].
    * **Foto (Photo):**
        * Validar si `imageBytes` no es null.
        * MimeType: `Photo.CONTENT_ITEM_TYPE`.
        * [cite_start]Dato: `Photo.PHOTO` (array de bytes)[cite: 273].
* **Paso 5: Ejecutar el Batch**
    * Envolver en bloque `try-catch`.
    * [cite_start]Ejecutar: `getContentResolver().applyBatch(ContactsContract.AUTHORITY, cpo)`[cite: 281].
    * [cite_start]Feedback: Mostrar Toast "Guardado con éxito"[cite: 284].

