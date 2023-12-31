# Proyecto Avril Ramos

Este proyecto hecho en Java permite la creacion y visualizacion de Productos mediante la consola. Guardandolos en un archivo `productos.csv` para ersistirlo entre sesiones.


## Estructura del Proyecto


```plaintext
raíz-del-proyecto/
  ├── src/          # Código fuente Java
  ├── bin/          # Clases Java compiladas
  ├── html/         # Documentación Javadoc
  ├── makefile      # Makefile para compilación y documentación
  ├── manifest      # Archivo manifest
  ├── LICENSE       # Licencia APACHE 2.0
  ├── proyecto.jar  # Archivo JAR generado
  ├── UML.pdf       # Diagramas de clase
  └── README.md     # Este archivo README
```

## Compilación del Proyecto
Para construir y compilar tu proyecto, puedes utilizar el Makefile proporcionado. Aquí tienes los objetivos Make disponibles:

### Clonar
Para clonar el repositorio 

```
git clone https://github.com/AvrilRamos/proyecto-ramos.git
```
Esto le creara una carpeta en su directorio local con el proyecto

### Limpieza
Para limpiar el proyecto y eliminar archivos compilados y archivos JAR, utiliza:

```
make limpiar
```
Esto eliminará el directorio bin/, el directorio html/ y cualquier archivo JAR autogenerado.

### Compilación
Para compilar el proyecto, ejecuta:

```
make compilar
```
Este objetivo primero limpia el proyecto y luego compila el código fuente Java, colocando las clases compiladas en el directorio bin/.

### Creación de un JAR
Para crear un archivo JAR a partir de las clases compiladas, ejecuta:

```
make jar
```
Este objetivo compila el código si aún no está compilado y genera un archivo JAR llamado proyecto.jar con la clase principal especificada en el manifiesto.

### Generación de Javadoc
Para generar la documentación Javadoc para tu código, utiliza:

```
make javadoc
```
Esto creará la documentación en HTML en el directorio html/.


## Ejecucion

Luego de generar el .jar (`proyecto.jar`) debera correr 
```

java -jar proyecto.jar
```
para ejecutar el programa mediante la consola




![class diagram](https://github.com/AvrilRamos/proyecto-ramos/assets/146078646/3dbac417-800f-418e-a5c9-2d6a0baa69a8)

