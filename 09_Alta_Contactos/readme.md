# Secuencia de declaraciones y acciones

## 1. Preparación y permisos

### Android Manifest
* Se define el permiso WRITE_CONTACTS necesario para guardar contactos.
* Se solicita este permiso si aún no está concedido.

```XML
contactPermissions = new String[]{Manifest.permission.WRITE_CONTACTS};

``` 
