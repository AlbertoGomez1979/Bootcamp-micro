package ntt.data.bootcamp.pruebasStarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoidioma.domain.Saludo;

@RestController
public class PruebaController {
	
	@Autowired
	private Saludo saludo;
	
	@GetMapping(path="/prueba")
	public String pruebasaludo() {
		return saludo.mensajeSaludo();
	}

}
