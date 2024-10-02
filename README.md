# CRUD Veterinaria

Este proyecto es un CRUD (Crear, Leer, Actualizar, Eliminar) sencillo y básico desarrollado en Java con Spring Boot 3.3.4 y MySQL 9.0. El sistema gestiona una base de datos llamada **veterinaria**, que contiene una tabla denominada **perros**.

## Requisitos

- Java 17
- Spring Boot 3.3.4
- MySQL 9.0

## Estructura de la Base de Datos

### Base de Datos: veterinaria

- **Tabla: perros**
  - `id`: Long (PK)
  - `nombre`: String
  - `raza`: String
  - `edad`: int
  - `fecha_registro`: LocalDate

## Funcionalidades

El CRUD permite las siguientes operaciones:

1. **Crear un perro**: Agregar un nuevo registro de perro a la base de datos.
2. **Leer todos los perros**: Obtener la lista de todos los perros registrados.
3. **Leer un perro por ID**: Obtener los detalles de un perro específico usando su ID.
4. **Actualizar un perro**: Modificar la información de un perro existente.
5. **Eliminar un perro**: Eliminar un registro de perro de la base de datos.

## Uso 
Puedes usar Postman para interactuar con el CRUD. Aquí hay algunos ejemplos de las solicitudes que puedes hacer:

GET /perros: Obtener todos los perros.
GET /perros/{id}: Obtener un perro por su ID.
POST /perros: Crear un nuevo perro (proporciona un JSON con los datos del perro).
PUT /perros/{id}: Actualizar un perro existente.
DELETE /perros/{id}: Eliminar un perro por su ID.
