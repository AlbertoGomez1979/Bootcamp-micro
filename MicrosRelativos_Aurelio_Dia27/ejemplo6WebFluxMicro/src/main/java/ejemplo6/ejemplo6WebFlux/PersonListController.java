package ejemplo6.ejemplo6WebFlux;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Flux;

@Controller
public class PersonListController {
	

	//EJEMPLO 7
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		final Flux<Person> personList = personService.allPerson();
		
		//DEVUELVE TODAS LAS PERSONAS
		model.addAttribute("personlist", personList);
		//LLAMA AL TEMPLATES
		return "personlist";
	}

}
