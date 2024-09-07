# Resumen del Repositorio

Este repositorio contiene una solución desarrollada en Kotlin para calcular el monto de giro necesario en una transacción financiera. La solución está diseñada para determinar el monto `g` requerido para alcanzar un monto total específico `T`, teniendo en cuenta comisiones variables y un impuesto aplicado sobre el monto de giro.

## Descripción del Problema

El objetivo es calcular el monto de giro `g` necesario para alcanzar un monto total `T`, considerando:

- **Comisión Fija**: 5 unidades si `g` es menor o igual a 1000.
- **Comisión Variable**:
  - 0.5% si `g` está entre 1001 y 10000.
  - 1.5% si `g` excede 10000.
- **Impuesto sobre las Transacciones Financieras (ITF)**: 0.005% del monto de giro `g`.

## Contenidos del Repositorio

- **Código Fuente**: Implementación del algoritmo en Kotlin para calcular el monto de giro necesario, utilizando un modelo matemático y el método numérico de bisección para resolver la ecuación no lineal.

- **Informe**: Documento detallado que describe el problema abordado, la metodología empleada para desarrollar la solución, y los resultados obtenidos. Incluye pruebas diseñadas para validar la precisión del algoritmo en diferentes escenarios con diversos montos totales. Además, el informe presenta ejemplos de cálculos manuales para comparar con los resultados generados por el algoritmo.
