# ForoHub
ForoHub es una aplicación web construida con Spring Boot que permite a los usuarios registrarse, iniciar sesión y participar en discusiones en un foro. 
Utiliza JWT para la autenticación y MySQL como base de datos.

## Descripción
Uno de los pasos más importantes al participar en un proceso de selección es resolver un desafío propuesto por la empresa, y generalmente esto debe estar descrito en el README. 
Este proyecto es un desafío que consiste en crear un foro donde los usuarios pueden interactuar y compartir información.

## Características
- Registro de usuarios
- Inicio de sesión con autenticación JWT
- Acceso a endpoints protegidos
- Interacción con la base de datos MySQL
- Migraciones de base de datos con Flyway

## Requisitos
- Java 17 o superior
- MySQL
- Maven

## Instalación

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/tu_usuario/foro-hub.git
   cd foro-hub

2. Configura la base de datos:

Crea una base de datos en MySQL llamada forohub.
Asegúrate de tener un usuario con los permisos adecuados.

3.Configura las credenciales:

Abre el archivo src/main/resources/application.properties y configura las credenciales de la base de datos:
	spring.datasource.url=jdbc:mysql://localhost:3306/forohub
	spring.datasource.username=${DB_USERNAME}
	spring.datasource.password=${DB_PASSWORD}

4.Configura las variables de entorno (opcional):

Puedes definir las credenciales como variables de entorno en tu sistema operativo para mayor seguridad.

Compila y ejecuta la aplicación:
	-mvn clean install
	-mvn spring-boot:run


Contribuciones
	Las contribuciones son bienvenidas. Si deseas contribuir, por favor sigue estos pasos:

-Haz un fork del proyecto.
-Crea una nueva rama (git checkout -b feature/nueva-caracteristica).
-Realiza tus cambios y haz commit (git commit -m 'Agregué una nueva característica').
-Haz push a la rama (git push origin feature/nueva-caracteristica).
-Abre un Pull Request.

Licencia
	Este proyecto está bajo la Licencia MIT. 

Contacto
Si tienes alguna pregunta o sugerencia, no dudes en contactarme:

GitHub: https://github.com/HectorSotoDiaz

