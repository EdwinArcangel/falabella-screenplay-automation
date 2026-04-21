# Falabella Automation 

Este proyecto es un framework de automatización de pruebas de interfaz de usuario (UI) para la plataforma de E-commerce **Falabella.com**, desarrollado con **Java**, **Serenity BDD** y el patrón de diseño **Screenplay**.

## Características del Proyecto

* **Patrón Screenplay:** Implementación de alta escalabilidad y mantenibilidad, separando las responsabilidades en Actores, Tareas, Interacciones y Preguntas.
* **Serenity BDD:** Generación de reportes vivos y detallados de la ejecución de las pruebas.
* **Cucumber:** Definición de escenarios en lenguaje natural (Gherkin) para facilitar la comunicación entre perfiles técnicos y de negocio.

---

## Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework de Automatización:** Serenity BDD
* **Gestor de Dependencias:** Maven
* **BDD Tool:** Cucumber
* **Driver:** Selenium WebDriver (Chrome)

---
## Alcance de las Pruebas

El objetivo de esta  pruebas es validar el flujo de búsqueda y navegación en el portal Falabella.com 

escenarios:

* **Búsqueda Exitosa:** Validación de la capacidad del motor de búsqueda para retornar resultados relevantes ante términos válidos.
* **Navegación al Detalle:** Verificación de que el sistema permite transicionar correctamente desde la lista de resultados hacia la ficha técnica de un producto específico.
* **Búsqueda sin Resultados:** Validación del manejo de excepciones cuando el usuario ingresa un producto inexistente o caracteres especiales, asegurando que el sistema responda con el mensaje informativo correcto: *"Lo sentimos, no encontramos resultados"*.

## Estructura del Proyecto

El proyecto sigue la estructura estándar de Screenplay dentro de `src/test/java/com/bootcamp/screenplay`:

* **features:** Archivos `.feature` con los escenarios en Gherkin.
* **stepdefinitions:** Clases que mapean los pasos de Gherkin .
* **tasks:** Acciones  realizadas por el actor (ej: `BuscarProducto`).
* **pages:** Mapeo de localizadores y elementos de la web.
* **questions:** Validaciones y aserciones de la prueba.

---

##  Configuración y Ejecución

### Requisitos Previos:
1.  JDK 17 o superior.
2.  Apache Maven instalado.
3.  Google Chrome actualizado.

### Ejecución de Pruebas:
Para ejecutar todos los escenarios y generar el reporte de Serenity, utiliza el siguiente comando en la terminal:

```bash
mvn clean test -Dtest=OpenFalabellaRunner serenity:aggregate
