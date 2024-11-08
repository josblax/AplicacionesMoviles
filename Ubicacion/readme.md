# Obteniendo una ubicación 


## Permisos.
fuente : https://developer.android.com/develop/sensors-and-location/location/permissions

Para proteger la privacidad del usuario, las aplicaciones que usan servicios de ubicación deben solicitar permisos de ubicación. 

 Cuando solicite permisos de ubicación, siga las mismas prácticas recomendadas que aplicaría a cualquier otro permiso de tiempo de ejecución. Una diferencia importante cuando se trata de permisos de ubicación es que el sistema incluye múltiples permisos relacionados con la ubicación. Los permisos que solicites y la forma en que los solicites dependerán de los requisitos de ubicación para el caso de uso de tu app.

Tipos de acceso a la ubicación 

Cada permiso tiene una combinación de las siguientes características: 

Categoría: Ubicación en primer plano o ubicación en segundo plano. 
Precisión: Ubicación precisa o ubicación aproximada.

Si la aplicación contiene una función que comparte o recibe información de ubicación solo una vez o durante un período de tiempo definido, esa función requiere acceso a la ubicación en primer plano. Algunos ejemplos son los siguientes:

* Dentro de una aplicación de navegación, una función permite a los usuarios obtener indicaciones paso a paso.
*	Dentro de una aplicación de mensajería, una función permite a los usuarios compartir su ubicación actual con otro usuario.


El sistema considera que la aplicación usa la ubicación en primer plano si una función de la aplicación accede a la ubicación actual del dispositivo en una de las siguientes situaciones:

Una actividad que pertenece a la aplicación es visible.

La aplicación ejecuta un servicio en primer plano. Cuando se ejecuta un servicio en primer plano, el sistema aumenta la conciencia del usuario mostrando una notificación persistente. La aplicación conserva el acceso cuando se coloca en segundo plano, por ejemplo, cuando el usuario presiona el botón Inicio en su dispositivo o apaga la pantalla de su dispositivo.

Declaras la necesidad de una ubicación en primer plano cuando la aplicación solicita el permiso ACCESS_COARSE_LOCATION o el permiso ACCESS_FINE_LOCATION, como se muestra en el siguiente fragmento de código:

##android manifest xml(permissions)

```XML
<uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
```

## Precisión
Android admite los siguientes niveles de precisión de ubicación:

## Aproximado 
Proporciona una estimación de la ubicación del dispositivo. Si esta estimación de ubicación procede de LocationManagerService o FusedLocationProvider, esta estimación tiene una precisión de aproximadamente 3 kilómetros cuadrados (aproximadamente 1,2 millas cuadradas). 
La aplicación puede recibir ubicaciones con este nivel de precisión cuando declaras el permiso ACCESS_COARSE_LOCATION, pero no el permiso ACCESS_FINE_LOCATION.

## Precisa
Proporciona una estimación de la ubicación del dispositivo que es lo más precisa posible. Si la estimación de ubicación procede de LocationManagerService o FusedLocationProvider, esta estimación suele estar dentro de unos 50 metros (160 pies) y, a veces, es tan precisa como dentro de unos pocos metros (10 pies) o más. La aplicación puede recibir ubicaciones con este nivel de precisión cuando declaras el permiso ACCESS_FINE_LOCATION.

Android también intentará ver todas las redes WiFi de la zona y enviará información sobre ellas también al servidor de Google y, si es posible, el servidor de Google devolverá una nueva ubicación con mayor precisión para, por ejemplo, 800 metros.

En este momento, el GPS estará encendido. El dispositivo GPS necesita al menos 30 segundos desde un arranque en frío para obtener una solución, por lo que, si puede obtener una solución, devolverá la latitud y la longitud, pero nuevamente con una precisión que será la más alta posible para un ejemplo de 100 metros. Cuanto más tiempo funcione el GPS, mejor precisión obtendrá.

Set up Google Play Services.
fuente: https://developers.google.com/android/guides/setup
fuente: https://maven.google.com/web/index.html#com.google.android.gms
Para desarrollar una app con las API de los Servicios de Google Play, la página de la fuente contiene las implementaciones vigentes de Google Services para configurar tu proyecto con los SDK correspondientes.

## Declarar dependencias para los Servicios de Google Play.

Para desarrollar funciones que dependan de las API de los Servicios de Google Play en tu app, sigue estos pasos:

Abre el archivo build.gradle dentro del directorio de módulos de tu app. 
Nota: Los proyectos de Android Studio contienen un archivo build.gradle de nivel superior y un archivo build.gradle para cada módulo. Asegúrate de editar el archivo del módulo de tu app. 

```Kotlin
    implementation 'com.karumi:dexter:6.2.3'
    implementation 'com.google.android.gms:play-services-maps:18.1.0'
    implementation 'com.google.android.gms:play-services-location:21.0.1'
```

## MetaData Android Manifest

Par nombre-valor para un elemento de datos arbitrarios adicionales que se pueden proporcionar al componente principal. Un elemento componente puede contener cualquier número de subelementos <meta-data>. Los valores de todos ellos se recopilan en un único objeto Bundle y se ponen a disposición del componente.

Ejemplo:

```XML
<meta-data android:name="zoo" android:value="@string/kangaroo" />
```

En nuestro caso es para aplicar la llave proporcionada por Google Maps API.
# android manifest xml (metada), va entre el código de <application> & <activity>

```XML
uses-library android:name="com.google.android.maps" android:required="true"/>

<meta-data android:name="com.google.android.geo.API_KEY" android:value="AIzaSyCki8i5lnTKNSnRKN56FyR4QpAJohv05H0"/>
```

## SupportMapFragment

public class SupportMapFragment extiende Fragment 
Un componente de mapa en una aplicación. Este fragmento es la forma más sencilla de colocar un mapa en una aplicación. 

Es un envoltorio alrededor de una vista de un mapa para manejar automáticamente las necesidades necesarias del ciclo de vida. Al ser un fragmento, este componente se puede agregar al archivo de diseño de una actividad simplemente con el XML a continuación.

```XML
<fragment
    android:id="@+id/mapa"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:name="com.google.android.gms.maps.SupportMapFragment"/>
```

Se debe adquirir un GoogleMap mediante getMapAsync(OnMapReadyCallback). Esta clase inicializa automáticamente el sistema de mapas y la vista

## Task<Location>.

fuente: https://developer.android.com/reference/com/google/android/play/core/tasks/Task

Representa una operación asíncrona.

Método público.

addOnSuccessListener.
Agrega un agente de escucha al que se llama si la tarea se completa correctamente.
Si se agregan varios agentes de escucha, se les llamará en el orden en que se agregaron. Si la tarea ya se ha completado correctamente, se programará inmediatamente una llamada al agente de escucha.

![Listener](<img width="468" alt="image" src="https://github.com/user-attachments/assets/199d9f6f-069e-4fc6-b164-6b31009bc1fe">
)

## getMapAsync
Es parte de la actividad MapFragment.
fuente: https://developers.google.com/maps/documentation/android-sdk/reference/com/google/android/libraries/maps/MapFragment
Método Público.

public void getMapAsync (OnMapReadyCallback callback)

Establece un objeto de devolución de llamada que se activará cuando la instancia de GoogleMap esté lista para usarse.

* Se debe llamar a este método desde el subproceso principal.

* La devolución de llamada se ejecutará en el hilo principal.


En el caso de que los servicios de Google Play no estén instalados en el dispositivo del usuario, la devolución de llamada no se activará hasta que el usuario la instale.
En el raro caso de que el mapa de Google se destruya inmediatamente después de su creación, la devolución de llamada no se activa.

El objeto GoogleMap proporcionado por la devolución de llamada no es nulo.

LatLng.
Clase inmutable que representa un par de coordenadas de latitud y longitud, almacenadas como grados.
La latitud y la longitud son los dos tipos de coordenadas geográficas angulares que conforman el sistema de referencia planetario y que permiten ubicar un punto cualquiera en la superficie del planeta Tierra. Este sistema es el empleado por tecnologías como el GPS (Global Positioning System).

fuente: https://definicion.edu.lat/concepto/latitud-y-longitud.html

Así, la latitud es el ángulo imaginario que un punto ocupa respecto del ecuador (la línea imaginaria que divide el mundo en dos hemisferios: Norte y Sur), si trazamos una línea desde su ubicación hacia el centro de la Tierra. La latitud se simboliza con la letra griega phi, ϕ.

En cambio, la longitud es un ángulo imaginario similar, pero determinado por el Meridiano de Greenwich o Meridiano 0, que atraviesa la localidad del mismo nombre en Londres, Inglaterra, en donde está el Real Observatorio inglés.

Dicho meridiano divide el mundo en dos regiones, la occidental (Oeste) y la oriental (Este). Sirve para trazar los demás meridianos que cruzan imaginariamente el globo de manera paralela al meridiano de referencia. La longitud se simboliza con la letra griega lambda, λ.
La posición absoluta es la combinatoria de coordenadas que ubica un punto en la superficie terrestre.

En otras palabras, se trata de qué tan lejos o tan cerca se encuentra un punto de la referencia del ecuador, y de los trópicos que le son paralelos: el Trópico de Cáncer y el de Capricornio. Los paralelos sirven de referencia para calcular la latitud.

## MarkerOption

Define MarkerOptions para un marcador.

Ocupa los siguientes métodos públicos.
Establecer la posición del marcador. a través del constructor que tiene un método position(), donde asignamos el parámetro LatLng

## GoogleMap.

fuente: https://developers.google.com/maps/documentation/android-sdk/configure-map

El punto de entrada para administrar las entidades y los datos de mapa subyacentes. Tu app solo puede acceder a un objeto de GoogleMap después de que se haya recuperado de un objeto SupportMapFragment.
