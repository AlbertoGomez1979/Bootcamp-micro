package ntt.data.bootcamp.pruebasStarter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

//BORRAR Y CREAR ENDPOINTS
@Endpoint(id="estados")
public class ActuatorEstadoController {
	
	private List<String> listado = new ArrayList<>();
	
	@ReadOperation
	public List<String> estados(){
		return listado;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String estadonuevo) {
		listado.add(estadonuevo);
	}
	
	@DeleteOperation
	public void deleteOperation(@Selector String estadoBorrar) {
		listado.remove(estadoBorrar);
	}
	

}
