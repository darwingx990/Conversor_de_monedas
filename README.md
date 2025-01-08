# Conversor de Monedas

Es una aplicación en Java que permite convertir montos entre diferentes monedas utilizando tasas de cambio en tiempo real proporcionadas por una API externa.

## Características Principales

- Conversión entre múltiples monedas.
- Interfaz de línea de comandos interactiva.
- Integración con la API de ExchangeRate-API para obtener tasas de cambio actualizadas.
- Implementación de programación orientada a objetos para una estructura de código limpia y modular.

## Requisitos Previos

- Java Development Kit (JDK) 11 o superior.
- Dependencia de la librería Gson para el procesamiento de JSON.
- Conexión a internet para acceder a la API de tasas de cambio.

## Instalación y Ejecución

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/darwingx990/Conversor_de_monedas.git
   ```

2. **Navegar al directorio del proyecto**:
   ```bash
   cd Conversor_de_monedas
   ```

3. **Compilar el proyecto**:
   ```bash
   mvn compile
   ```

4. **Ejecutar la aplicación**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.darwing.CurrencyConverterApp"
   ```

## Uso de la Aplicación

1. Al iniciar, la aplicación solicitará:
   - Moneda de origen.
   - Moneda de destino.
   - Monto a convertir.

2. Ingresa los códigos de moneda en formato ISO 4217 (por ejemplo, USD para dólar estadounidense, EUR para euro).

3. La aplicación mostrará el monto convertido basado en las tasas de cambio actuales.

## Estructura del Proyecto

- `src/main/java/com/darwing/CurrencyConverterApp.java`: Clase principal que maneja la interacción con el usuario.
- `src/main/java/com/darwing/CurrencyConverter.java`: Clase que contiene la lógica de conversión de monedas.
- `pom.xml`: Archivo de configuración de Maven con las dependencias necesarias.

## Dependencias

- **Gson**:
  - Grupo: `com.google.code.gson`
  - Artefacto: `gson`
  - Versión: `2.10.1`

## API Utilizada

- **ExchangeRate-API**:
  - Sitio web: [https://www.exchangerate-api.com](https://www.exchangerate-api.com)
  - Nota: Se requiere una clave de API para acceder a los servicios.

## Ejemplo de Uso

Si se ingresan los siguientes valores:

- **Monto**: 100
- **Moneda de Origen**: USD
- **Moneda de Destino**: EUR

La salida será similar a:
```
100.00 USD equals to: 85.50 EUR
```

## Contribuciones

Las contribuciones son bienvenidas. Por favor, abre un "issue" para discutir cualquier cambio importante antes de realizar una "pull request".

## Contacto

- Autor: Darwing Mosquera
- Correo electrónico: darwingx990@gmail.com

## Recursos Adicionales

- [Documentación de Gson](https://github.com/google/gson)
- [Guía de ExchangeRate-API](https://www.exchangerate-api.com/docs)
