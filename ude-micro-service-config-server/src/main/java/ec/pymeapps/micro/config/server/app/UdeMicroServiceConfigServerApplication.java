package ec.pymeapps.micro.config.server.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * 
 *  El Server de Configuracion obtiene los servicios que va a administrar 
 *  de los archivos properties de un repositorio Git. En esta Server se usa:
 *  
 *  	https://github.com/gaboegui/spring-cloud-config-git.git
 *  
 *  Para que la configuracion de estos .properties se sobreescriba a la del 
 *  aplication.properties del servicio a administrar, se debera crear un archivo
 *  bootstrap.properties en el servicio con una estructura similar a la siguiente:
 *  
 *  	spring.application.name=pymeapps.servicio.item
 *  	# Configuracion de Ambiente activo
 *  	spring.profiles.active=dev
 *  	# Configuracion de Spring Boot Config Server
 *  	spring.cloud.config.uri=http://localhost:8888
 *  
 *  
 *  Para ver los archivos del servidor se puede ejecutar:
 *  
 *  	http://localhost:8888/pymeapps.servicio.item/prod
 *  
 *  donde los archivos en el repositorio GIT estaran almacenados asi:
 *  	pymeapps.servicio.item.properties (default)
 *  	pymeapps.servicio.item-dev.properties
 *  	pymeapps.servicio.item-prod.properties
 *      
 *        NOMBRE DEL SERVICIO-AMBIENTE.properties
 * 
 * @author Gabriel Eguiguren P.
 *
 */
@EnableConfigServer
@SpringBootApplication
public class UdeMicroServiceConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UdeMicroServiceConfigServerApplication.class, args);
	}

}
