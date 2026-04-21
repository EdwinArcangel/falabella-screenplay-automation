# 🛒 Falabella Automation - Screenplay Pattern

Este proyecto es un framework de automatización de pruebas de interfaz de usuario (UI) para la plataforma de E-commerce **Falabella.com**, desarrollado con **Java**, **Serenity BDD** y el patrón de diseño **Screenplay**.

## Características del Proyecto

* **Patrón Screenplay:** Implementación de alta escalabilidad y mantenibilidad, separando las responsabilidades en Actores, Tareas, Interacciones y Preguntas.
* **Serenity BDD:** Generación de reportes vivos y detallados de la ejecución de las pruebas.
* **Cucumber:** Definición de escenarios en lenguaje natural (Gherkin) para facilitar la comunicación entre perfiles técnicos y de negocio.

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework de Automatización:** Serenity BDD
* **Gestor de Dependencias:** Maven
* **BDD Tool:** Cucumber
* **Driver:** Selenium WebDriver (Chrome)

---

## Estructura del Proyecto

El proyecto sigue la estructura estándar de Screenplay dentro de `src/test/java/com/bootcamp/screenplay`:

* **features:** Archivos `.feature` con los escenarios en Gherkin.
* **stepdefinitions:** Clases que mapean los pasos de Gherkin a código Java.
* **tasks:** Acciones de alto nivel realizadas por el actor (ej: `BuscarProducto`).
* **pages:** Repositorio de localizadores (Targets) y elementos web.
* **questions:** (En progreso) Validaciones y aserciones de la prueba.

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
