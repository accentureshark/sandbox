# Prework · Windows

El objetivo es llegar al workshop con el entorno listo. Durante la práctica se trabaja con
SDD; no se utiliza tiempo de clase para instalar herramientas.

## Requisitos

- Windows 10/11
- Git
- Java 17+
- Maven
- Node.js 20.19+
- IDE/editor de preferencia
- un coding agent operativo: OpenCode, Codex, GitHub Copilot, Claude Code, Cursor u otro
- OpenSpec

## Verificación

En PowerShell:

```powershell
java -version
mvn -version
git --version
node --version
npm --version
openspec --version
```

## Clonar el workshop

```powershell
git clone https://github.com/accentureshark/sandbox.git
cd sandbox
git checkout workshop/sdd-part1-base
mvn clean test
```

## Configurar OpenSpec para tu agente

Ejemplos:

```powershell
openspec init --tools opencode
```

```powershell
openspec init --tools codex
```

```powershell
openspec init --tools github-copilot
```

Después de `openspec init`, reiniciar el IDE/agente para que descubra skills/comandos.

## Ruta gratuita / open source recomendada

```text
OpenSpec + OpenCode + Ollama + modelo local
```

No es obligatorio utilizar el mismo IDE, agente o LLM que el instructor.
