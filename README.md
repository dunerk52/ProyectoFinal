# 🩸 Sistema de Gestión de Banco de Sangre

## Descripción

Sistema desarrollado en Java para la administración de un Banco de Sangre utilizando Programación Orientada a Objetos (POO).

La aplicación permite registrar donantes, consultar información almacenada, buscar compatibilidad sanguínea y gestionar un inventario básico de tipos de sangre. Además, implementa persistencia de datos mediante archivos serializables, permitiendo conservar la información incluso después de cerrar el programa.

---

## Características

✅ Registro de donantes

✅ Consulta de donantes registrados

✅ Búsqueda de donantes por nombre

✅ Compatibilidad según grupo sanguíneo y factor RH

✅ Eliminación de registros

✅ Persistencia de datos mediante archivos .dat

✅ Menú interactivo en consola

✅ Aplicación de Programación Orientada a Objetos

---

## Tecnologías utilizadas

- Java
- Eclipse IDE
- Programación Orientada a Objetos
- Serializable
- ArrayList
- Manejo de archivos
- Git y GitHub

---

## Conceptos aplicados

### Herencia

La clase `Donante` hereda atributos y métodos de la clase abstracta `Persona`.

### Encapsulamiento

Los atributos se encuentran protegidos mediante modificadores de acceso y métodos de consulta.

### Polimorfismo

Se implementa mediante la sobrescritura de métodos como `mostrarRol()` y `toString()`.

### Abstracción

La clase `Persona` se declara como abstracta para servir como base de otras clases.

### Persistencia de datos

Los registros son almacenados utilizando serialización en archivos `.dat`.

---

## Estructura del proyecto

BancoSangre/

├── src/

│ └── bancodesangre/

│ ├── Persona.java

│ ├── Donante.java

│ ├── Administrador.java

│ ├── BancoSangre.java

│ └── Main.java

│

├── donantes.dat

└── README.md

---

## Funcionalidades

### Registrar donante

Permite almacenar:

- Nombre
- Dirección
- Teléfono
- Grupo sanguíneo
- Factor RH

### Buscar donante

Permite consultar información mediante el nombre.

### Mostrar donantes

Lista todos los donantes registrados.

### Compatibilidad sanguínea

Permite encontrar donantes compatibles según grupo sanguíneo y factor RH.

### Eliminar donante

Permite eliminar registros existentes.

### Persistencia

Toda la información se guarda automáticamente en el archivo:

donantes.dat

---

## Ejecución

1. Clonar el repositorio:

```bash
git clone URL_DEL_REPOSITORIO
