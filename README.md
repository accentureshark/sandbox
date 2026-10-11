# Sandbox · SDD Workshop

Proyecto Java/Spring Boot utilizado en el workshop de **Spec-Driven Development** de la
Tribu Java.

## Stack

- Java 17
- Spring Boot 3.2.5
- Maven
- Spring Web
- Spring Data JPA
- H2
- Lombok
- Springdoc / OpenAPI
- OpenSpec para el workshop SDD

## Baseline

El proyecto contiene un CRUD simple de clientes bajo:

```text
/api/clientes
```

La especificación del comportamiento actual vive en:

```text
openspec/specs/client-management/spec.md
```

## Material del workshop

- [Setup Windows](docs/workshop/setup-windows.md)
- [Parte 1 · Hands-on](docs/workshop/part-1.md)
- [Exercise Cards](docs/workshop/exercise-cards.md)

> Esta rama contiene únicamente el **estado inicial**. Los participantes deben crear los
> `openspec/changes/` durante la práctica; las respuestas no están precargadas.

## Baseline técnico

```bash
mvn clean test
```

Después configurá OpenSpec para tu coding agent, por ejemplo:

```bash
openspec init --tools opencode
```

El IDE, el agente y el LLM pueden cambiar. La especificación debe permanecer.
