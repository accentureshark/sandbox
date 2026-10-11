# Parte 1 · Hands-on SDD

## Objetivo

Experimentar el ciclo:

```text
Intent
  -> Clarification
  -> Specification
  -> Design
  -> Tasks
  -> Switch de contexto/modelo
  -> Implementation
```

La práctica no busca aprender comandos de OpenSpec de memoria. Busca comprobar que el
conocimiento del cambio puede quedar materializado en artefactos versionados en lugar de
permanecer sólo en el historial del chat.

## Caso principal

La única necesidad inicial es:

> **Necesitamos mejorar el alta de clientes para evitar clientes duplicados y datos inválidos.**

No agregues supuestos. No implementes todavía.

## Paso 1 · Explore

Con el primer modelo/agente, pedir que inspeccione el repo y detecte ambigüedades.

Ejemplo conceptual:

```text
/opsx:explore
```

Instrucción:

> Analizá el requerimiento y el repositorio. No modifiques código ni diseñes todavía la
> solución. Identificá decisiones de negocio que necesitamos aclarar antes de especificar.

**Detenerse aquí y esperar las aclaraciones del instructor.**

## Paso 2 · Propose

Una vez recibidas las decisiones de negocio, generar el cambio OpenSpec.

Nombre esperado:

```text
harden-client-registration
```

Ejemplo conceptual:

```text
/opsx:propose <descripción consolidada del cambio>
```

No implementar código todavía.

## Paso 3 · Human Review

Revisar en este orden:

1. `proposal.md` — ¿estamos resolviendo el problema correcto?
2. `specs/.../spec.md` — ¿los comportamientos son verificables?
3. `design.md` — ¿el HOW quedó separado del WHAT?
4. `tasks.md` — ¿cada tarea corresponde al cambio especificado?

Corregir los artefactos antes de implementar.

## Paso 4 · Persistir contexto

Commit sugerido:

```bash
git add openspec
git commit -m "docs(sdd): define client registration change"
```

## Paso 5 · Switch

- cerrar el chat/sesión anterior
- abrir un contexto nuevo
- opcionalmente cambiar de LLM o de agente
- **no copiar el historial anterior**

El segundo contexto debe apoyarse únicamente en el repositorio y en los artefactos OpenSpec.

## Paso 6 · Apply

Ejemplo conceptual:

```text
/opsx:apply
```

Instrucción:

> Implementá el cambio utilizando los artefactos OpenSpec existentes como fuente de verdad.
> No agregues comportamiento que no esté especificado.

## Paso 7 · Evidencia mínima

```bash
mvn test
```

## Pregunta de cierre

> ¿Qué necesitó saber el segundo modelo que no estuviera escrito en el repositorio?

Si hubo que reexplicar decisiones relevantes, identificar qué información faltaba en los
artefactos.
