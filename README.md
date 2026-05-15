# Evaluación: Ordenamiento de Películas

## Objetivo

Implementar `sortByTitle(Movie[] movies)` en `MovieController` para ordenar películas por título en orden ascendente.

## Qué debes editar

1. Edita solo `src/controllers/MovieController.java`.
2. Implementa `sortByTitle`.
3. No cambies tests, modelo ni validadores.

## Compilación y pruebas

### Compilar
```bash
javac -cp "lib/*" -d bin $(find src -name "*.java")
```

### Ejecutar pruebas
```bash
CLASSPATH="bin:lib/validadores-evaluacion-movie.jar:lib/junit-platform-console-standalone-1.7.0.jar:lib/junit-jupiter-api-5.7.0.jar:lib/hamcrest-core-1.3.jar:lib/apiguardian-api-1.1.0.jar"
java -cp "$CLASSPATH" org.junit.platform.console.ConsoleLauncher --scan-classpath --details tree
```

### Ejecutar App
```bash
java -cp "bin:lib/*" App
```

## Rúbrica (10 puntos)

| Componente | Descripción | Puntos |
| --- | --- | ---: |
| Desarrollo | Implementación correcta de `sortByTitle` y paso de pruebas | 9.0 |
| Evidencia en main | Impresión en consola de películas ordenadas desde `App` | 1.0 |
| **Total** |  | **10.0** |

## Ejemplo de salida esperada (5 películas)

Entrada de ejemplo:
```text
1. Inception (2010)
2. avatar (2009)
3. AVATAR (2022)
4. Avatar (2016)
5. The Matrix (1999)
```

Salida ordenada esperada:
```text
1. avatar (2009)
2. AVATAR (2022)
3. Avatar (2016)
4. Inception (2010)
5. The Matrix (1999)
```

Otro ejemplo:
```text
ANTES
1. dune (2021)
2. Dune (1984)
3. DUNE (2024)
4. Batman (2022)
5. avatar (2009)

DESPUÉS
1. avatar (2009)
2. Batman (2022)
3. dune (2021)
4. Dune (1984)
5. DUNE (2024)
```

## Configuración de estudiante

Actualiza `student.env`:
```text
STUDENT_NAME=Tu Nombre Completo
STUDENT_EMAIL=tu.email@universidad.edu
```

## Calificación automática

GitHub Actions ejecuta compilación y pruebas al hacer push en `main`.

- Puntaje automático por pruebas: hasta 9.0.
- El punto restante corresponde a la evidencia de salida ordenada en `App`.

¡Éxitos!
