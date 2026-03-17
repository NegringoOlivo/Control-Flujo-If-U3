<div align="center">
<h1>🚦 Retos de Lógica Condicional en Java 🚦</h1>
<p><i>Práctica de Estructuras Selectivas (Simple y Múltiple)</i></p>
</div>

## 🛡️ Reto 1: El Guardián de la Montaña Rusa

**Tema principal:** Estructura Condicional Simple (`if`)

Un parque de diversiones está automatizando el acceso a su atracción más extrema: *"El Titán"*. Por regulaciones de seguridad internacionales, el sistema debe ser muy estricto con quién puede subir y quién no.

### 📝 Descripción del Problema

Desarrolla un programa que solicite al usuario su **edad** y su **estatura en centímetros**. El sistema debe evaluar estos datos en silencio y **solo emitir un mensaje** si la persona cumple con **ambos** requisitos de seguridad para subir a la atracción.

Si la persona no cumple los requisitos, el programa simplemente finalizará sin decir absolutamente nada (acceso denegado por defecto).

### 🎯 Requisitos de Seguridad (Condiciones a cumplir)

* La persona debe tener **14 años o más**.

* La persona debe medir **estrictamente más de 150 cm**.

### 📤 Salida Esperada

* **Si cumple:** `¡Acceso concedido! Disfruta tu viaje en El Titán.`

* **Si NO cumple:** *(La consola debe terminar sin imprimir nada).*

> 💡 **Nota para el alumno:** Recuerda que puedes evaluar múltiples condiciones simultáneamente utilizando operadores lógicos (`&&` o `||`). Piensa cuál es el adecuado para este caso.

## 🍔 Reto 2: El Kiosco de Comida Rápida

**Tema principal:** Estructura Selectiva Múltiple (`switch`)

Un restaurante de comida rápida necesita un programa para las pantallas táctiles de auto-servicio. El cliente debe poder seleccionar un combo numérico y el sistema debe imprimir el detalle de lo que incluye su orden.

### 📝 Descripción del Problema

Crea un programa que muestre un menú inicial con 4 números de combos. El sistema debe leer el número ingresado por el usuario y, dependiendo de su elección, mostrar la descripción exacta de los alimentos que se le entregarán. Si el cliente ingresa un número que no existe en el menú, el sistema debe notificar el error.

### 📋 Menú de Combos Disponibles

1. **Combo 1:** Hamburguesa sencilla, papas chicas y refresco.

2. **Combo 2:** Hamburguesa doble, papas grandes y refresco.

3. **Combo 3:** Nuggets de pollo (10 pz), papas medianas y jugo.

4. **Combo 4:** Ensalada César y agua mineral.

### 📤 Salidas Esperadas

* **Si elige `3`:** `Has seleccionado el Combo 3: Nuggets de pollo (10 pz), papas medianas y jugo.`

* **Si elige `7`:** `Error: El combo número 7 no existe en nuestro menú actual.`

> 💡 **Nota para el alumno:** Analiza la diferencia de rendimiento y legibilidad entre usar múltiples sentencias `if-else` encadenadas frente a utilizar una estructura de selección múltiple diseñada específicamente para evaluar un solo valor numérico.
