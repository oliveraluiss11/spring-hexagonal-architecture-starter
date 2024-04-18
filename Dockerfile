# Usa una imagen base de Java 17 de Corretto
FROM amazoncorretto:17-alpine

# Copia el archivo JAR de la aplicación al contenedor
COPY target/architecture-hexagonal-starter-0.0.1-SNAPSHOT.jar /app/architecture-hexagonal-starter.jar

# Establece el directorio de trabajo en /app
WORKDIR /app

# Ejecuta la aplicación al iniciar el contenedor
CMD ["java", "-jar", "architecture-hexagonal-starter.jar"]
