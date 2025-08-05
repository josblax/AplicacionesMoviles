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
