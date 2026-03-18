## 🔴 Reto 2: Sistema de Becas Socioeconómicas CUSur (Nivel Avanzado)

**Estructuras a practicar:** Condicional Doble Anidada y Operadores Lógicos (`&&`, `||`).

El Centro Universitario del Sur (CUSur) evalúa de forma integral la necesidad económica de los alumnos para asignar becas, emitiendo un diagnóstico exacto de por qué un alumno fue aceptado o rechazado.

### 📝 Descripción del Problema

Desarrolla un programa en Java que solicite al usuario tres datos:

1. Su **promedio general** (ej. `88.5`).

2. Su **ingreso familiar mensual** en pesos (ej. `12500.00`).

3. Su **distancia al campus** en kilómetros (ej. `45`).

**Reglas del negocio (Lógica a programar):**

* Para que la beca sea **Aprobada**, el alumno debe cumplir **ambas** condiciones principales: Tener un promedio de `85.0` o superior, **Y** tener un ingreso familiar mensual menor o igual a `$10,000.00`.

* **Excepción:** Si el alumno vive a **más de 50 km** del campus, el límite de ingresos se ignora (se le perdona el requisito económico) y se le aprueba la beca solo con tener el promedio de `85.0` o más.

* **Diagnóstico de Rechazo:** Si la beca es **Rechazada**, el sistema debe usar un bloque `if-else` anidado (adentro del `else` principal de rechazo) para imprimir el motivo exacto:

  * "Motivo: Promedio insuficiente."

  * "Motivo: Ingresos exceden el límite y no aplica excepción por distancia."

  * "Motivo: No cumple con ningún requisito."

### 📤 Salidas Esperadas

* **Ejemplo Entrada (`Promedio: 92.0, Ingreso: 15000, Distancia: 60`):**
  `¡Beca Aprobada! Aplica excepción por residencia lejana al CUSur.`

* **Ejemplo Entrada (`Promedio: 80.0, Ingreso: 8000, Distancia: 10`):**
  `Beca Rechazada. Motivo: Promedio insuficiente.`

> 💡 **Tip de programación:** Necesitarás agrupar condiciones con paréntesis para que Java evalúe correctamente la jerarquía de las decisiones. Ejemplo: `if (promedio >= 85.0 && (ingreso <= 10000 || distancia > 50))`.
