package ntt.data.bootcamp.pruebasStarter;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

//CONTROLADOR PERSONALIZADO DE ENDPOINT
//SE INSERTA DEPENDENCIA DE ACTUATOR PARA CONTROLAR LOS ENDPOINTS
@Component
@RestControllerEndpoint(id="customEndPoint")
public class ActuatorController {
	@GetMapping("/random")
	public ResponseEntity<String> CustomEndpoint(){
		 return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
	}


}
