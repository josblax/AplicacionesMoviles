1. Declaración de Variables: val vs varA diferencia de Java, donde primero se define el tipo de dato y luego el nombre (int total = 10;), en Kotlin la sintaxis comienza por definir la mutabilidad de la variable. Tampoco es obligatorio el uso de punto y coma (;).Kotlin// Sintaxis general:
// [val|var] nombreVariable: TipoDato = valorInicial

val tarifaFija: Double = 26.0   // Inmutable (Solo lectura)
var minutosEstancia: Int = 45   // Mutable (Puede reasignarse)
Reglas de Usoval (Value): Variable de solo lectura. Una vez asignado un valor, no puede modificarse ni reasignarse (equivalente a final en Java). Debe ser la opción por defecto.var (Variable): Variable mutable. Permite cambiar el valor asignado a lo largo del flujo del programa (acumuladores, contadores, estados).Kotlinval precio = 15.0
precio = 20.0 // ❌ Error de compilación: Val cannot be reassigned

var contador = 0
contador = 1  //  Correcto
2. Inferencia de TiposSi se asigna un valor inicial en el momento de la declaración, Kotlin deduce automáticamente el tipo de dato sin necesidad de escribirlo explícitamente:Kotlinval estacionamiento = "Plaza Satélite" // Infiere String
val capacidadMaxima = 500              // Infiere Int
val costoPorHora = 14.0                // Infiere Double
val servicioActivo = true              // Infiere Boolean
3. Tipos de Datos PrincipalesEn Kotlin no existe la separación visual entre tipos primitivos y clases envoltorio; todos los tipos se gestionan uniformemente como objetos:Enteros: Byte, Short, Int, Long (ejemplo para Long: 1000L).Decimales: Float (ejemplo: 12.5f), Double (tipo decimal predeterminado).Lógicos y Caracteres: Boolean (true o false), Char (comillas simples: 'A').Texto: String (admite interpolación de variables mediante el símbolo $).4. Seguridad Contra Nulos (Null Safety)Para evitar el error de ejecución NullPointerException, los tipos de datos en Kotlin no admiten valores nulos por defecto.Kotlinvar mensaje: String = "Bienvenido"
mensaje = null // ❌ Error de compilación: Null can not be a value of a non-null type String
Tipos Nulables (?)Si una variable necesita admitir explícitamente la ausencia de valor (null), se debe añadir el operador ? al declarar su tipo:Kotlinvar horaSalidaOpcional: Int? = null //  Permitido
Operadores de NulabilidadLlamada Segura (?.): Ejecuta la acción únicamente si la variable no es nula. Si contiene null, devuelve null sin detener la ejecución de la app.Kotlinval longitud: Int? = horaSalidaOpcional?.toString()?.length
Operador Elvis (?:): Asigna un valor de respaldo si la expresión de la izquierda resulta nula.Kotlin// Si toIntOrNull() no logra convertir la cadena, devuelve null y el operador Elvis asigna 0:
val horaEntrada = campoTexto.toIntOrNull() ?: 0
Aserción No Nula (!!): Fuerza a Kotlin a tratar una variable nulable como no nula. Si la variable contiene null, la aplicación se cerrará de golpe arrojando un NullPointerException. Evita su uso.5. Inicialización de Vistas: lateinit varEn Android, los componentes visuales (como EditText, TextView o Button) no pueden inicializarse al momento de declarar los atributos de clase porque el diseño XML todavía no ha sido inflado (lo cual sucede dentro de onCreate mediante setContentView).Para declarar variables de vistas a nivel de clase sin tener que marcarlas como nulables (Button?), se usa la palabra clave lateinit:Kotlinclass MainActivity : AppCompatActivity() {

    // Se compromete a inicializar la vista antes de acceder a cualquiera de sus métodos
    private lateinit var etHoraEntrada: EditText
    private lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Enlazar primero la vista con el ID del XML
        etHoraEntrada = findViewById(R.id.et_hora_entrada)
        btnCalcular = findViewById(R.id.btn_calcular)

        // 2. Posteriormente, configurar eventos o interactuar con el componente
        btnCalcular.setOnClickListener {
            // Acción al hacer clic
        }
    }
}
Regla de oro sobre el ciclo de vida: Si intentas llamar a setOnClickListener o leer text de una variable declarada con lateinit antes de haber ejecutado su findViewById, la aplicación colapsará inmediatamente con el error UninitializedPropertyAccessException.6. Manipulación de Textos: getText y setText con PropiedadesKotlin expone de forma directa los métodos tradicionales getText() y setText() de Android a través de la propiedad simplificada .text.Comparativa BásicaOperaciónJava TradicionalSintaxis Idiomática en KotlinLeer texto (Get)String valor = etHora.getText().toString();val valor = etHora.text.toString()Escribir texto (Set)tvTotal.setText("Total: $50");tvTotal.text = "Total: $50"Limpiar textoetHora.setText("");etHora.text.clear()Lectura y Conversión Segura de EntradasAl leer de un EditText, .text devuelve un objeto de tipo Editable. Para transformarlo en texto manipulable y números seguros:Kotlin// Extraer cadena eliminando espacios en blanco accidentales
val strHora = etHoraEntrada.text.toString().trim()

// Conversión segura a entero evitando caídas por campos vacíos o letras
val horaNumerica = strHora.toIntOrNull() ?: 0

// Validar si el campo fue dejado en blanco
if (etHoraEntrada.text.isNullOrBlank()) {
    etHoraEntrada.error = "Este dato es obligatorio"
}
Escritura e Interpolación de CadenasPara actualizar etiquetas (TextView), se asigna directamente el valor usando comillas dobles y el operador $ para incrustar variables:Kotlinval subtotal = 26.0

// Interpolación simple
tvTotal.text = "Total a pagar: $$subtotal"

// Con formato decimal fijo
tvTotal.text = "$${String.format("%.2f", subtotal)}"
7. Estructuras de Control Modernas: when y Rangos (in ..)Reemplazo de switch y cadenas de if-else con whenEn Kotlin, la sentencia when puede utilizarse tanto para evaluar condiciones como para devolver un valor directamente:Kotlinval tarifa: Double = when {
    minutosTotales <= 30 -> 0.0
    minutosTotales <= 60 -> 4.0
    minutosTotales <= 120 -> 12.0
    minutosTotales <= 180 -> 26.0
    else -> 26.0 + calcularHorasExtra(minutosTotales)
}
Validación con Rangos (in .. / !in ..)En lugar de construir condiciones lógicas complejas (hora < 0 || hora > 23), se emplean rangos legibles:Kotlin// Verificar si los valores ingresados son válidos para un reloj de 24 horas
if (hEntrada !in 0..23 || mEntrada !in 0..59) {
    Toast.makeText(this, "Rango de hora o minutos inválido", Toast.LENGTH_SHORT).show()
    return
}
8. Funciones Lambda para Eventos de ClicKotlin elimina las clases anónimas complejas requeridas en Java. La asignación de eventos se realiza pasando directamente un bloque de código entre llaves { }:Kotlin// Sintaxis simplificada
btnCalcular.setOnClickListener {
    // Código que se ejecutará al presionar el botón
    calcularTarifa()
}
