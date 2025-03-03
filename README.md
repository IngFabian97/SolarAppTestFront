# SolarAppFrontTest

## Descripción

Este proyecto es una suite de automatización de pruebas para la página "Rayitos de Sol" utilizando Selenium y Cucumber. El objetivo es verificar el correcto funcionamiento de los servicios de "Contactenos" y "Calculadora" en la página web.

## Estructura del Proyecto
SolarAppFrontTest/
├── app/
│
├── build.gradle
│ ├── src/
│ │ ├── test/
│ │ │ ├── java/
│ │ │ │ ├── pages/
│ │ │ │ │ ├── BasePage.java
│ │ │ │ │ ├── RayitosContactenosPage.java
│ │ │ │ ├── runner/
│ │ │ │ │ └── runner.java
│ │ │ │ ├── steps/
│ │ │ │ │ ├── CommonSteps.java
│ │ │ │ │ ├── RayitoContactenosStep.java
│ │ │ │ │ ├── Hooks.java
│ │ │ ├── resources/
│ │ │ │ ├── features/
│ │ │ │ │ └── RayitoSol.feature
│ │ │ │ ├── extent.properties
├── settings.gradle

## Herramientas Utilizadas

- **Selenium**: Biblioteca para la automatización de navegadores web.
- **Cucumber**: Herramienta para la automatización de pruebas basada en BDD (Behavior Driven Development).
- **JUnit**: Framework para la ejecución de pruebas unitarias.
- **WebDriverManager**: Biblioteca para la gestión automática de los controladores de los navegadores.
- **ExtentReports**: Herramienta para la generación de reportes de pruebas.

## Instalación

1. Clona el repositorio:

```sh
git clone https://github.com/IngFabian97/SolarAppTestFront.git
```
2. Navega al directorio del proyecto:
```sh
cd SolarAppFrontTest
```
3. Instala las dependencias utilizando Gradle:
```sh
./gradlew build
```