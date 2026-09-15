# Tarjeta de Presentacion.

Donde consultar los elementos de la practica : [Click aqui](https://github.com/josblax/AplicacionesMoviles/tree/main/02_XML)

## Creacion de una tarjeta de presentación. 

El equipo de trabajo de su empresa le ha solicitado crear una vista de una tarjeta de presentación corporativa, el modelo sugerido se muestra abajo:

<p align="center">
<img src="https://github.com/josblax/AplicacionesMoviles/blob/main/Images/tarpres2.png"/>
</p>


```XML
├── Practica #0 Tarjeta de Presentacion
    └── Elementos XML
        └── ConstraintLayout
        └── TableLayout
            └── TableRow
        └── ScrollView
        └── TextView
        └── Vector Asset
        └── ImageView
    └── colors.xml
    └── borders.xml
```

# Tarjeta de Presentación — Java vs. Kotlin en Android Studio

Guía de referencia para construir la app de tu captura de pantalla en ambos lenguajes, y entender qué cambia realmente entre uno y otro.

## Resumen

La parte difícil (Android) **no cambia** entre Java y Kotlin — solo cambia la sintaxis. Como ya dominas XML, ese conocimiento se transfiere al 100% sin importar el lenguaje que elijas para la lógica, porque el layout, los recursos y el manifiesto son idénticos en ambos casos.

Este documento incluye:

- El **layout XML** de la tarjeta (compartido, no cambia entre versiones).
- **MainActivity en Java** con `findViewById` clásico.
- **MainActivity en Kotlin** — la estructura es casi calcada para una app tan simple como esta.
- La forma **moderna recomendada (ViewBinding)** en ambos lenguajes, que es lo que probablemente veas en tutoriales actuales en vez de `findViewById`.
- Una **tabla de diferencias reales** (null safety, `val`/`var`, data classes, `when` vs `switch`, etc.) — esto es lo único que realmente tienes que aprender.
- Un estimado honesto de dificultad: para alguien que ya domina Java+XML, volverse productivo en Kotlin básico toma **1–2 semanas de práctica activa**, no meses — porque no se aprende Android de nuevo, solo una sintaxis más corta para lo mismo que ya se sabe hacer.

---

## 0. Lo más importante primero: qué NO cambia entre Java y Kotlin

Esto es lo que más te va a tranquilizar dado que ya dominas XML:

- **El layout XML es idéntico.** `activity_main.xml`, `strings.xml`, `colors.xml`, los drawables vectoriales, el `AndroidManifest.xml` — nada de esto se ve afectado por el lenguaje que elijas. Un archivo XML no "sabe" si el código detrás está en Java o Kotlin.
- **El ciclo de vida de Activity/Fragment es el mismo concepto** (`onCreate`, `onStart`, `onResume`, etc.) — solo cambia la sintaxis para escribirlo.
- **Java y Kotlin son 100% interoperables.** Compilan al mismo bytecode de la JVM. Puedes tener un proyecto con algunas clases en Java y otras en Kotlin al mismo tiempo, y llamarse entre sí sin fricción. Esto también significa que puedes migrar un proyecto poco a poco, archivo por archivo, en vez de todo de golpe.
- **Los conceptos de Android (Views, Activities, Intents, Resources, Gradle) son idénticos.** Lo único que cambia es el lenguaje con el que escribes la lógica.

Es decir: tu conocimiento de XML se transfiere al 100% sin importar qué lenguaje elijas para la lógica.

---

## 1. El layout XML (compartido por ambas versiones)

Una barra de título con borde, y 4 filas con ícono + texto (persona, credencial/matrícula, correo, antena/teléfono).

```xml
<!-- res/layout/activity_main.xml -->
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#FFFDF0"
    android:padding="16dp">

    <TextView
        android:id="@+id/tvTitulo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Tarjeta de Presentación"
        android:textStyle="bold"
        android:textSize="18sp"
        android:textAlignment="center"
        android:padding="12dp"
        android:background="@drawable/border_box"
        android:layout_marginBottom="16dp"/>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="12dp"
        android:background="#E4F1F5">
        <ImageView
            android:layout_width="32dp"
            android:layout_height="32dp"
            android:src="@drawable/ic_person"/>
        <TextView
            android:id="@+id/tvNombre"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:layout_marginStart="16dp"
            android:layout_gravity="center_vertical"/>
    </LinearLayout>

    <!-- Repite el mismo patrón de fila para matrícula, correo y teléfono,
         cambiando el drawable del ícono y el id del TextView -->

</LinearLayout>
```

Este archivo **no cambia entre la versión Java y la versión Kotlin del proyecto.**

---

## 2. La lógica — versión Java

```java
// MainActivity.java
package com.example.tarjetapresentacion;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String nombre = "Alumno 1";
    private String matricula = "1234567";
    private String correo = "mymail@mycompany.com";
    private String telefono = "55 2321 3022";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNombre = findViewById(R.id.tvNombre);
        TextView tvMatricula = findViewById(R.id.tvMatricula);
        TextView tvCorreo = findViewById(R.id.tvCorreo);
        TextView tvTelefono = findViewById(R.id.tvTelefono);

        tvNombre.setText(nombre);
        tvMatricula.setText(matricula);
        tvCorreo.setText(correo);
        tvTelefono.setText(telefono);
    }
}
```

## 3. La lógica — versión Kotlin

```kotlin
// MainActivity.kt
package com.example.tarjetapresentacion

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val nombre = "Alumno 1"
    private val matricula = "1234567"
    private val correo = "mymail@mycompany.com"
    private val telefono = "55 2321 3022"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvNombre).text = nombre
        findViewById<TextView>(R.id.tvMatricula).text = matricula
        findViewById<TextView>(R.id.tvCorreo).text = correo
        findViewById<TextView>(R.id.tvTelefono).text = telefono
    }
}
```

Nota que la estructura es casi calcada — misma clase, mismo método `onCreate`, mismo `findViewById`. Esto es intencional: para una app de solo lectura como esta, la diferencia entre Java y Kotlin es casi puramente cosmética.

---

## 4. La forma "moderna" recomendada: ViewBinding (aplica a ambos lenguajes)

`findViewById` funciona, pero desde hace varios años Google recomienda **ViewBinding** en ambos lenguajes — genera automáticamente una clase con referencias directas a cada vista, sin casteos y sin riesgo de `NullPointerException` por un id mal escrito.

**Java con ViewBinding:**
```java
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvNombre.setText("Alumno 1");
        binding.tvMatricula.setText("1234567");
    }
}
```

**Kotlin con ViewBinding:**
```kotlin
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvNombre.text = "Alumno 1"
        binding.tvMatricula.text = "1234567"
    }
}
```

*(Requiere activar `buildFeatures { viewBinding = true }` en `build.gradle`, igual en ambos lenguajes.)*

---

## 5. Diferencias reales entre Java y Kotlin (más allá de este ejemplo)

| Aspecto | Java | Kotlin |
|---|---|---|
| Punto y coma | Obligatorio | Opcional (casi nadie lo usa) |
| Variables | `String x = "a";` (tipo explícito siempre) | `val x = "a"` (inferencia de tipo; `val` = constante, `var` = variable) |
| Null safety | No hay control del compilador; `NullPointerException` en tiempo de ejecución | El compilador distingue `String` (nunca nulo) de `String?` (puede ser nulo) — muchos errores se detectan antes de correr la app |
| Clases de datos (POJOs) | Escribes constructor, getters, setters, `equals()`, `hashCode()`, `toString()` a mano (o con Lombok) | `data class Alumno(val nombre: String, val matricula: String)` genera todo eso automáticamente en una línea |
| Funciones de una línea | Siempre con `{ return ... }` | `fun doble(x: Int) = x * 2` (sin llaves ni `return`) |
| Switch / when | `switch` clásico, con `break` obligatorio | `when` — más flexible, sin fallthrough accidental |
| Miembros estáticos | `static` | `companion object { }` dentro de la clase |
| Lambdas | Sintaxis más verbosa (`(v) -> { ... }`) | Muy natural, sobre todo para listeners: `button.setOnClickListener { ... }` |
| Interpolación de texto | Concatenación con `+` o `String.format()` | Plantillas de texto: `"Hola $nombre, tienes ${edad} años"` |
| Extensiones | No existen | Puedes "agregar" funciones a clases que no escribiste (`fun String.esVacio() = this.isEmpty()`) |

---

## 6. ¿Qué tan difícil es pasar de Java a Kotlin sin usar IA?

La curva es **corta comparada con aprender Android desde cero**, porque lo que realmente es difícil de aprender —el sistema de Views, el ciclo de vida, Activities/Fragments, Intents, Gradle— **no cambia**. Lo único nuevo es sintaxis y algunos hábitos idiomáticos.

**Estimado realista:**
- **1–2 días:** puedes leer y entender código Kotlin ajeno sin problema (la sintaxis es muy legible).
- **1–2 semanas** de práctica activa (reescribiendo proyectos pequeños como este): te sientes cómodo escribiendo Kotlin básico para Activities/Fragments sin consultar referencia todo el tiempo.
- **1–3 meses:** dominas los conceptos más "propios" de Kotlin que no tienen equivalente directo en Java — coroutines (para tareas asíncronas, reemplazan a `AsyncTask`/hilos manuales), `sealed class`, delegación (`by`), funciones de alcance (`let`, `apply`, `also`, `run`, `with`), null safety avanzado.

**Recomendaciones concretas para aprenderlo sin IA:**
1. **Documentación oficial de Kotlin — "Kotlin for Java developers"** (comparación directa, pensada exactamente para tu caso): kotlinlang.org
2. **Codelabs oficiales de Android en Kotlin** (Google) — mismos ejercicios de siempre, pero te obligan a escribir Kotlin idiomático paso a paso.
3. **Ejercicio práctico recomendado:** toma esta misma app de tarjeta de presentación, constrúyela primero en Java, y luego reescríbela tú mismo en Kotlin sin copiar — es el ejercicio más rápido para interiorizar la sintaxis porque ya conoces la lógica de memoria y solo te concentras en la traducción.

**En resumen:** no es como aprender un lenguaje nuevo de cero (como pasar de Java a Python, por ejemplo). Es más parecido a aprender una forma más corta de escribir lo mismo que ya sabes hacer — la mayoría de desarrolladores Java-Android reportan sentirse productivos en Kotlin en cuestión de días, no de meses, precisamente porque el terreno conceptual (Android) ya lo dominan.
