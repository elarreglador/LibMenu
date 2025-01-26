# Librería Menu

`Menu` es una librería en Java para crear menús interactivos en la consola de manera simple y efectiva. Esta librería permite al usuario seleccionar opciones de un menú definido, gestionando la entrada de datos y errores comunes como entradas no válidas.

## Versiones

20250126 - ✨ El menu es funcional

## Ejemplo de uso

Encontraras ejemplos de uso en main(), el resultado suele ser similar a esto:

Cabecera del enunciado:

   1) Opcion A
   2) Opcion B
   3) Opcion C

: 2

## Funcionamiento de la clase Menu

La clase Menu incluye los siguientes métodos:

Método menu(String[] opciones, Scanner teclado)

### Parámetros:

String[] opciones: Un array de String donde el primer elemento es la cabecera del menú y los siguientes son las opciones.
Scanner teclado: Un objeto Scanner para leer la entrada del usuario. Esto evita problemas al cerrar Scanner, se recomienda un unico Scanner para toda la app.

## Descripción:

Muestra un menú con la cabecera y opciones proporcionadas.
Valida la entrada del usuario y permite seleccionar una opción dentro de un rango específico.
Devuelve la opción seleccionada como un entero, permitiendo al desarrollador gestionar el flujo del programa.

## Características

Fácil de usar: Integra rápidamente un menú interactivo en cualquier aplicación de consola.

Gestión de errores: Detecta y gestiona entradas no válidas sin interrumpir el flujo del programa.

Versatilidad: Permite personalizar el encabezado y las opciones del menú, haciendo que se adapte a distintos casos de uso.

## Requisitos
Java 8 o superior.

## Ejecución
Para ejecutar el ejemplo de uso, compila y ejecuta el archivo en un entorno compatible con Java. Asegúrate de tener la clase Menu y el Scanner correctamente configurados.

## Contribuciones
Si deseas contribuir al desarrollo de esta librería, siéntete libre de realizar un fork y enviar un pull request.