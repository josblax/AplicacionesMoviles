# Manual Esencial de Kotlin para Desarrollo en Android

---

## 1. Declaración de Variables: `val` vs `var`

A diferencia de Java, donde primero se define el tipo de dato y luego el nombre (`int total = 10;`), en Kotlin la sintaxis comienza por definir la mutabilidad de la variable. Tampoco es obligatorio el uso de punto y coma (`;`).

```kotlin
// Sintaxis general:
// [val|var] nombreVariable: TipoDato = valorInicial

val tarifaFija: Double = 26.0   // Inmutable (Solo lectura)
var minutosEstancia: Int = 45   // Mutable (Puede reasignarse)
