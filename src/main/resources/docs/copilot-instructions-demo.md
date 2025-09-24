# Copilot Instructions: Un Salto Cuántico de Productividad
## Demo práctica con GitHub Copilot en proyectos Java/Spring Boot

---

## Slide 1: El Problema 🤔

### Sin contexto, Copilot es genérico:
- Sugiere código en cualquier lenguaje/framework
- No conoce nuestras convenciones de equipo
- Genera commits inconsistentes
- Repite explicaciones del stack tecnológico
- Los nuevos devs no siguen estándares

**¿Resultado?** Pérdida de tiempo y falta de consistencia

---

## Slide 2: La Solución 💡

### Copilot Instructions = Contexto persistente
Inspirado en el estándar **agents.md**, creamos archivos que funcionan como "README para la IA":

```
.github/
├── copilot-instructions.md     # Cómo escribir código
└── git-commit-instructions.md  # Cómo escribir commits
```

**El resultado:** Copilot pasa de asistente genérico a **colaborador con memoria**

---

## Slide 3: Demo Setup - Nuestro Proyecto 🏗️

### Sandbox CRUD Clientes
```
stack: Java 17 + Spring Boot 3.2.5 + H2 + Lombok + OpenAPI
arquitectura: MVC con Repository pattern
testing: JUnit 5 (por agregar)
```

**Sin Copilot Instructions:** Copilot no sabe nada de esto
**Con Copilot Instructions:** Copilot es un expert en nuestro stack

---

## Slide 4: Creando copilot-instructions.md 📝

### DEMO EN VIVO - Parte 1

Vamos a crear el archivo `.github/copilot-instructions.md`:

1. **Definir el stack tecnológico**
2. **Establecer convenciones de código**
3. **Guías de testing y documentación**
4. **Patrones arquitecturales**

**⏱️ Tiempo estimado: 3 minutos**

---

## Slide 5: copilot-instructions.md - Contenido

```markdown
# Copilot Instructions

This project is a CRUD service for client management, built with Java 17+, 
Spring Boot 3.x, and H2 database for development.

## Key technologies and tools
- Java 17+
- Spring Boot 3.2.5 (Web, JPA, Security)
- Maven
- H2 Database (development), MySQL (production)
- Lombok (reduce boilerplate)
- OpenAPI/Swagger (API documentation)
- JUnit 5 & MockMvc (testing)

## Coding guidelines
- Use English for all code comments and identifiers
- Follow Spring Boot best practices
- Use Lombok annotations to reduce boilerplate
- Repository pattern for data access
- DTOs for API responses
- Proper HTTP status codes
- Exception handling with @ControllerAdvice
```

---

## Slide 6: git-commit-instructions.md 📋

### DEMO EN VIVO - Parte 2

Crear `.github/git-commit-instructions.md`:

```markdown
# Git Commit Instructions

- Write all commit messages in English
- Use Conventional Commits format
- Include ticket reference when applicable

## Commit message format
<type>[optional scope]: <description>

### Types
- feat: new feature
- fix: bug fix  
- docs: documentation
- refactor: code refactoring
- test: adding tests
- chore: maintenance

### Examples
feat(api): add client CRUD endpoints
fix(database): correct H2 configuration
docs(readme): add setup instructions
```

**⏱️ Tiempo estimado: 2 minutos**

---

## Slide 7: DEMO - Antes vs Después 🎯

### Sin Copilot Instructions
**Prompt:** "Create a service class for clients"

**Copilot sugiere:** Código genérico, sin Lombok, sin convenciones

### Con Copilot Instructions  
**Prompt:** "Create a service class for clients"

**Copilot sugiere:** Código con nuestro stack, Lombok, patrones Spring Boot

**⏱️ Tiempo de demo: 5 minutos**

---

## Slide 8: DEMO - Testing Automático 🧪

### Generación de Tests
**Prompt:** "Generate tests for ClienteController"

**Copilot genera:**
- Tests con JUnit 5
- MockMvc para testing de controllers
- Sigue nuestras convenciones de naming
- Usa nuestro stack definido

**⏱️ Tiempo de demo: 3 minutos**

---

## Slide 9: DEMO - Commits Inteligentes 📝

### Generación de Commits
**Comando:** `git add .` → **Copilot Chat: "Generate commit message"**

**Resultado:**
```
feat(api): add cliente CRUD endpoints

- Implement ClienteController with GET, POST, PUT, DELETE
- Add ClienteService with business logic  
- Configure H2 database for cliente entity
- Add OpenAPI documentation
```

**⏱️ Tiempo de demo: 2 minutos**

---

## Slide 10: Beneficios Inmediatos ⚡

### 1. **Productividad x10**
- No más explicaciones repetitivas del stack
- Copilot genera código alineado desde el primer intento

### 2. **Consistencia automática**
- Todos los devs siguen las mismas reglas
- Nuevos miembros productivos desde día 1

### 3. **Menos fricción**
- PRs mejor documentados
- Commits estandarizados automáticamente
- Tests que siguen nuestros patrones

---

## Slide 11: Casos de Uso Reales 🏆

### En nuestro equipo vimos:
- **50% menos tiempo** en code reviews
- **90% de commits** siguiendo Conventional Commits  
- **Cero configuración** para nuevos desarrolladores
- **Tests automáticos** siguiendo nuestros estándares

### ¿El secreto?
**Contextualizar la IA es más importante que solo usarla**

---

## Slide 12: Próximos Pasos 🚀

### 1. **Implementa hoy mismo:**
```bash
mkdir .github
touch .github/copilot-instructions.md
touch .github/git-commit-instructions.md
```

### 2. **Extiende el concepto:**
- Agrega reglas de API design
- Define convenciones de documentación
- Incluye guidelines de performance

### 3. **Evoluciona constantemente:**
- Los archivos crecen con el proyecto
- El equipo refina las reglas
- Copilot se vuelve más inteligente

---

## Slide 13: Reflexión Final 🎯

> **"La IA es poderosa, pero la clave está en cómo le damos contexto"**

### Copilot Instructions no es solo sobre código:
- Es sobre **cultura de equipo**
- Es sobre **estándares sostenibles**  
- Es sobre **productividad colectiva**

**Escribir código con Copilot es una cosa.**
**Hacerlo con contexto, estilo y coherencia... es otra muy distinta.**

---

## Slide 14: Q&A + Demo Libre 🤝

### Preguntas frecuentes:
- ¿Funciona con otros IDEs?
- ¿Cómo mantenemos los archivos actualizados?
- ¿Se puede versionar por proyecto/equipo?

### **Demo abierto:**
¿Qué les gustaría ver en acción?

**⏱️ Tiempo restante: 5 minutos**

---

## Recursos 📚

### Links útiles:
- [Agents.md Standard](https://github.com/ai-agents-md/agents.md)
- [Conventional Commits](https://www.conventionalcommits.org/)
- [Copilot Documentation](https://docs.github.com/copilot)

### Código de ejemplo:
- GitHub: `accentureshark/sandbox` 
- Archivos: `.github/copilot-instructions.md`

**¡Gracias por su atención!** 🎉
