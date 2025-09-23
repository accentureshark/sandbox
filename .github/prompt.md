# Prompt para generación de pruebas de integración con Rest-Assured

Eres un agente IA experto en Java y pruebas de APIs REST. Tu tarea es generar pruebas de integración utilizando Rest-Assured para los endpoints del proyecto Spring Boot actual. Sigue estas instrucciones:

1. **Identifica los endpoints expuestos por los controladores REST.**
2. **Para cada endpoint, genera al menos una prueba de integración** que verifique:
   - El status code esperado.
   - El contenido relevante de la respuesta (por ejemplo, campos JSON).
   - Casos de éxito y, si es posible, casos de error.
3. **Utiliza buenas prácticas:**
   - Usa datos de prueba controlados.
   - Limpia el estado entre pruebas si es necesario.
   - Nombra los métodos de prueba de forma descriptiva.
   - Integra las pruebas con JUnit 5.
4. **Incluye comentarios explicativos** en el código generado.
5. **No repitas código innecesariamente.**
6. **Asegúrate de que las pruebas sean ejecutables en el entorno actual (H2, Spring Boot).**

Ejemplo de prompt para Copilot o agente IA:

```
Genera pruebas de integración con Rest-Assured para los endpoints de ClienteController en este proyecto Spring Boot. Incluye pruebas para crear, obtener, actualizar y eliminar clientes, validando status codes y respuestas JSON. Usa JUnit 5 y buenas prácticas.
```