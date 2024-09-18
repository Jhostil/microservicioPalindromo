# Microservicio Procesar Palíndromos

Este proyecto desarrolla un microservicio que procesa frases para determinar si son palíndromos, calcula la longitud de la frase y cuenta el número de caracteres especiales.

## Funcionalidad

El servicio realiza lo siguiente:

1. Recibe una frase como entrada.
2. Verifica si la frase es un palíndromo.
3. Calcula la longitud de la frase.
4. Cuenta el número de caracteres especiales en la frase.

## Requisitos

- Java Development Kit (JDK) 17+

## Instalación

1. **Clona el repositorio:**

    ```bash
    git clone https://github.com/Jhostil/microservicioPalindromo.git
    ```

2. **Navega al directorio del proyecto:**

    ```bash
    cd microservicioPalindromo
    ```

3. **Descarga las dependencias:**

    ```bash
    mvn dependency:purge-local-repository
    ```

4. **Compila y ejecuta el proyecto:**

    ```bash
    mvn spring-boot:run
    ```

## Uso

1. Una vez ejecutado el servicio, puedes enviar solicitudes POST a la URL:

    ```
    http://localhost:8080/api/processPhrase
    ```

2. **Ejemplo de solicitud:**

   **Solicitud (Request Body):**

    ```json
    {
      "palindromo": "Anita lava la tina"
    }
    ```

3. **Respuesta esperada:**

    ```json
    {
      "isPalindromo": true,
      "lengthCadena": 15,
      "lengthCaracteresExpeciales": 5
    }
    ```

    - `isPalindromo`: Booleano indicando si la frase es un palíndromo.
    - `lengthCadena`: Entero con la longitud de la frase.
    - `lengthCaracteresExpeciales`: Entero con el número de caracteres especiales.

## Documentación

Puedes acceder a la documentación de la API en:

http://localhost:8080/swagger-ui.html


Esta página mostrará una interfaz de usuario para interactuar con la API y ver la documentación detallada.

## Pruebas Unitarias

El proyecto incluye pruebas unitarias en el archivo `PalindromeTest.java`. Estas pruebas pueden ejecutarse usando JUnit 5.

Para ejecutar las pruebas, usa el siguiente comando:

```bash
mvn test

