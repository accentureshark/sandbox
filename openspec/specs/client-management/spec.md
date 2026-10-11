# Client Management Specification

## Purpose

Describir el comportamiento observable actual del CRUD de clientes del proyecto Sandbox.
Esta especificación representa el **baseline existente**. Los cambios del workshop deben
modelarse primero bajo `openspec/changes/` y no modificar esta spec directamente mientras
están en elaboración.

## Requirements

### Requirement: Listar clientes

El sistema SHALL permitir consultar todos los clientes persistidos.

#### Scenario: Listado general

- **WHEN** se invoca `GET /api/clientes`
- **THEN** el sistema devuelve la colección de clientes persistidos

### Requirement: Consultar cliente por identificador

El sistema SHALL permitir consultar un cliente por su identificador.

#### Scenario: Cliente existente

- **GIVEN** un cliente existente
- **WHEN** se invoca `GET /api/clientes/{id}` con su identificador
- **THEN** el sistema devuelve HTTP 200 con el cliente

#### Scenario: Cliente inexistente

- **GIVEN** un identificador inexistente
- **WHEN** se invoca `GET /api/clientes/{id}`
- **THEN** el sistema devuelve HTTP 404

### Requirement: Crear cliente

El sistema SHALL permitir persistir un cliente recibido por `POST /api/clientes`.

#### Scenario: Alta con el comportamiento actual

- **WHEN** se envía un cliente a `POST /api/clientes`
- **THEN** el sistema persiste los valores recibidos
- **AND** devuelve el cliente persistido

> Baseline: el código actual no define reglas explícitas de validación de nombre, email,
> normalización o unicidad. Esas reglas no forman parte del comportamiento especificado
> hasta que un cambio las incorpore.

### Requirement: Actualizar cliente

El sistema SHALL permitir modificar nombre, email y teléfono de un cliente existente.

#### Scenario: Actualización de cliente existente

- **GIVEN** un cliente existente
- **WHEN** se invoca `PUT /api/clientes/{id}`
- **THEN** el sistema actualiza nombre, email y teléfono
- **AND** devuelve HTTP 200 con el cliente actualizado

#### Scenario: Actualización de cliente inexistente

- **GIVEN** un identificador inexistente
- **WHEN** se invoca `PUT /api/clientes/{id}`
- **THEN** el sistema devuelve HTTP 404

### Requirement: Eliminar cliente

El sistema SHALL permitir eliminar un cliente existente.

#### Scenario: Eliminación exitosa

- **GIVEN** un cliente existente
- **WHEN** se invoca `DELETE /api/clientes/{id}`
- **THEN** el cliente es eliminado
- **AND** el sistema devuelve HTTP 204

#### Scenario: Cliente inexistente

- **GIVEN** un identificador inexistente
- **WHEN** se invoca `DELETE /api/clientes/{id}`
- **THEN** el sistema devuelve HTTP 404

### Requirement: Buscar clientes

El sistema SHALL permitir buscar clientes mediante los parámetros opcionales `id`,
`nombre`, `email` y `telefono` en `GET /api/clientes/buscar`.

#### Scenario: Prioridad actual de filtros

- **GIVEN** una request con uno o más parámetros
- **WHEN** se ejecuta la búsqueda
- **THEN** el comportamiento actual prioriza `id`, luego `nombre`, luego `email` y luego `telefono`
- **AND** sólo se aplica el primer criterio disponible según ese orden

#### Scenario: Búsqueda sin filtros

- **WHEN** se invoca `/api/clientes/buscar` sin parámetros
- **THEN** el sistema devuelve todos los clientes
