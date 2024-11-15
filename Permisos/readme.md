# Permisos
Los permisos de las aplicaciones ayudan a respaldar la privacidad del usuario al proteger el acceso a lo siguiente:

1. ***Datos restringidos***, como el estado del sistema y la información de contacto de los usuarios
2. ***Acciones restringidas** como conectarse a un dispositivo emparejado y grabar audio.

## Flujo de información para solicitar permisos:

![image](https://github.com/user-attachments/assets/b6702e3f-4d10-4088-bba0-33bae67f9311)

## Tipos de permisos

Android clasifica los permisos en diferentes tipos, incluidos los permisos en el momentode la instalación, los permisos en tiempo de ejecución y los permisos especiales. 

El tipo de cada permiso indica el alcance de los datos restringidos a los que puede acceder la aplicación y el alcance de las acciones restringidas que puede realizar cuando el sistema le otorga ese permiso. El nivel de protección de cada permiso se basa en su tipo y se muestra en la página de referencia de la API de permisos. 

fuente: https://developer.android.com/reference/android/Manifest.permission

## Permisos al tiempo de la instalación.

Los permisos durante el tiempo de instalación otorgan a tu app acceso limitado a datos restringidos o permiten que tu app realice acciones restringidas que afecten mínimamente al sistema o a otras apps. Cuando declaras permisos de tiempo de instalación en tu app, una tienda de aplicaciones presenta un aviso de permiso de tiempo de instalación al usuario cuando ve la página de detalles de una app, como se muestra en la figura abajo. El sistema concede automáticamente los permisos a la aplicación cuando el usuario la instala.

Android incluye varios subtipos de permisos en el momento de la instalación, incluidos los permisos normales y los permisos de firma.

![image](https://github.com/user-attachments/assets/e2fa0ff7-929d-4aed-9156-ee81aacc9bb0)

## Permisos normales

Estos permisos permiten el acceso a datos y acciones que se extienden más allá del espacio aislado de la aplicación, pero presentan muy poco riesgo para la privacidad del usuario y el funcionamiento de otras aplicaciones.

El sistema asigna el nivel de protección normal a los permisos normales. Los permisos normales son permisos de menor riesgo (asSET_WALLPAPER) que
otorgan a las aplicaciones solicitantes acceso a funciones aisladas a nivel de aplicación con un riesgo mínimo para otras aplicaciones, el sistema o el usuario.

## Permisos de firma

El sistema concede un permiso de firma a una aplicación solo cuando la aplicación estáfirmada por el mismo certificado que la aplicación o el sistema operativo que define el permiso.

Las aplicaciones que implementan servicios con privilegios, como los servicios de autocompletar o VPN, también hacen uso de permisos de firma. Estas aplicaciones requieren permisos de firma de enlace de servicio para que solo el sistema pueda vincularse a los servicios.

## Permisos en tiempo de ejecución 

El mensaje de permiso del sistema que aparece cuando la aplicación solicita un permiso de tiempo de ejecución.

![image](https://github.com/user-attachments/assets/8b580b72-83e5-48ae-b8ce-806653aecdc3)

Los permisos de tiempo de ejecución, también conocidos como permisos peligrosos, otorgan a tu app acceso adicional a datos restringidos o permiten que tu app realice acciones restringidas que afecten de manera más sustancial al sistema y a otras apps.

Por lo tanto, debes solicitar permisos de tiempo de ejecución en tu app antes de poder acceder a los datos restringidos o realizar acciones restringidas. 

No asumir que estos permisos se han otorgado previamente: verificar y, si es necesario, solicítar antes de cada acceso.

fuente : https://developer.android.com/training/permissions/requesting

Cuando la aplicación solicita un permiso de tiempo de ejecución, el sistema presenta un mensaje de permiso de tiempo de ejecución, como se muestra en la figura arriba.

Muchos permisos de tiempo de ejecución acceden a datos privados del usuario, un tipo especial de datos restringidos que incluye información potencialmente confidencial.

Algunos ejemplos de datos privados del usuario son la ubicación y la información de contacto.

El micrófono y la cámara proporcionan acceso a información especialmente sensible. Por lo tanto, el sistema te ayuda a explicar por qué tu aplicación accede a esta información. En la siguiente liga puedes aprender mas. https://developer.android.com/training/permissions/explaining-access

El sistema asigna el nivel de protección peligroso a los permisos de tiempo de ejecución.

## ¿Como se requiere un permiso en tiempo de ejecución?

Todas las aplicaciones de Android se ejecutan en un entorno aislado de acceso limitado. Si tu app necesita usar recursos o información fuera de su propio entorno, puedes [declarar un permiso de tiempo de ejecución](https://developer.android.com/training/permissions/declaring) y configurar una solicitud de permiso que proporcione este acceso. Estos pasos forman parte del flujo de [trabajo para usar permisos](https://developer.android.com/guide/topics/permissions/overview#workflow).

___Si declaras permisos considerados [peligrosos](https://developer.android.com/guide/topics/permissions/overview#dangerous_permissions) y si tu app está instalada en un dispositivo con Android 6.0 (nivel de API 23) o versiones posteriores, debes solicitar los permisos peligrosos en el tiempo de ejecución siguiendo los pasos de esta guía.___

___Si no declaras ningún permiso peligroso o si tu app está instalada en un dispositivo con Android 5.1 (nivel de API 22) o versiones anteriores, los permisos se otorgan automáticamente y no es necesario que completes ninguno de los pasos restantes de esta página.___

# Principios básicos para solicitar permisos

Los principios básicos para solicitar permisos en tiempo de ejecución son los siguientes:

1. Pida un permiso en contexto, cuando el usuario comience a interactuar con la característica que lo requiera.
2. No bloquees al usuario. Proporcione siempre la opción de cancelar un flujo de interfaz de usuario educativo, como un flujo que explique la razón por la que se solicitan permisos.
3. Si el usuario deniega o revoca un permiso que necesita una característica, degrada la aplicación de forma correcta para que el usuario pueda seguir usándola, posiblemente inhabilitando la función que requiere el permiso.
4. No asumas ningún comportamiento del sistema. Por ejemplo, no suponga que los permisos aparecen en el mismo grupo de permisos. Un grupo de permisos simplemente ayuda al sistema a minimizar el número de cuadros de diálogo del sistema que se presentan al usuario cuando una aplicación solicita permisos estrechamente relacionados.

Antes de declarar y solicitar permisos de tiempo de ejecución en tu app, [evalúa si es necesario hacerlo](https://developer.android.com/privacy-and-security/minimize-permission-requests). Puede cumplir muchos casos de uso en su aplicación, como tomar fotos, pausar la reproducción multimedia y mostrar anuncios relevantes, sin necesidad de declarar ningún permiso.

Si llegas a la conclusión de que tu app necesita declarar y solicitar permisos en tiempo de ejecución, completa estos pasos:

1. En el archivo de ___AndroidManifiest.xml___ de tu app, declara los permisos que tu app podría necesitar solicitar. Añadir declaración en el ___AndroidManifiest.xml___ de la aplicación Para declarar un permiso que tu app podría solicitar, incluye el elemento ``` <uses-permission> ``` adecuado en el archivo de manifiesto de tu app. Por ejemplo, una aplicación que necesita acceder a la cámara tiene esta línea en ___AndroidManifest.xml___:

![image](https://github.com/user-attachments/assets/15195faa-c46a-40b4-918a-2b57a13374f6)

2. Diseña la experiencia de usuario de tu app para que acciones específicas de tu app estén asociadas con permisos de tiempo de ejecución específicos. Informa a los usuarios qué acciones pueden requerir que les otorguen permiso para que
tu app acceda a datos privados de los usuarios.

![image](https://github.com/user-attachments/assets/cafe742c-5063-48b6-833e-ffd4c7c229b6)

3. [Espera a que el usuario](https://developer.android.com/training/permissions/requesting#principles) invoque la tarea o acción en tu app que requiere acceso a datos privados específicos del usuario. En ese momento, la aplicación puede solicitar el permiso de tiempo de ejecución necesario para acceder a esos datos.

4. [Comprueba si el usuario ya ha concedido el permiso](https://developer.android.com/training/permissions/requesting#already-granted) de tiempo de ejecución que requiere tu aplicación. Si es así, la aplicación puede acceder a los datos privados del usuario. Si no es así, continúe con el siguiente paso.

Debe comprobar si tiene un permiso cada vez que realice una operación que requiera ese permiso.

![image](https://github.com/user-attachments/assets/95a89da4-9177-4fea-829b-07cc1919a579)

5. [Verifica si tu app debe mostrar una justificación al usuario](https://developer.android.com/training/permissions/requesting#explain), explicando por qué tu app necesita que el usuario otorgue un permiso de tiempo de ejecución en particular. Si el sistema determina que la aplicación no debe mostrar una
justificación, continúa directamente con el siguiente paso, sin mostrar un elemento de la interfaz de usuario.

Sin embargo, si el sistema determina que la aplicación debe mostrar una justificación, preséntala al usuario en un elemento de la interfaz de usuario. En este razonamiento, explica claramente a qué datos intenta acceder tu aplicación
y qué beneficios puede proporcionar al usuario si concede el permiso de tiempo de ejecución. Una vez que el usuario reconozca la justificación, continúe con el siguiente paso.

6. Solicita el permiso de tiempo de ejecución que requiere tu app para acceder a los datos privados del usuario. El sistema muestra una solicitud de permisos en tiempo de ejecución:

![image](https://github.com/user-attachments/assets/d5a7e499-17a5-473d-9c8d-81dac6352232)

7. Compruebe la respuesta del usuario, si ha elegido conceder o denegar el permiso de tiempo de ejecución. Este método esta predefinido y se accesa escribiendo onReques…

![image](https://github.com/user-attachments/assets/b49cf0fb-0344-4806-957b-c02249fcc8e7)

8. Si el usuario concedió el permiso a tu aplicación, puedes acceder a los datos privados del usuario. Si el usuario denegó el permiso en su lugar, [degrada correctamente la experiencia de la aplicación para que proporcione funcionalidad
al usuario sin la información protegida por ese permiso](https://developer.android.com/training/permissions/requesting#handle-denial).

9. Diagrama de Flujo

![image](https://github.com/user-attachments/assets/b4b042e6-22ff-41b3-9af4-1a15078760ea)




