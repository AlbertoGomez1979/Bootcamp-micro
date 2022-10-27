package ejemplo6.ejemplo6WebFlux;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonController {
	
	//EJEMPLO 6
		@GetMapping("/person-list1")
		public Flux<Person> personList1(){
			
			//PERSONA CON DELAY EN APARECER, ALBERTO TARDA 2 SEGUNDOS EN APAREVER EN LOCALHOST
			Flux<Person> flux = Flux.just(new Person("Alberto", "tete", 44)).delayElements(Duration.ofSeconds(2));
			return flux;
		}
		@GetMapping("/person-list2")
		public Flux<Person> personList2(){
			
			//PEPE TARDA 4 SEGUNDOS EN APARECER EN NAVEGADOR
			Flux<Person> flux = Flux.just(new Person("Pepe", "Garrido", 40)).delayElements(Duration.ofSeconds(4));
			return flux;
			
		}
		@GetMapping("/person-list3")
		public Flux<Person> personList3(){
			
			Flux<Person> flux = Flux.just(new Person("Manolo", "Perez", 24)).delayElements(Duration.ofSeconds(2));
			return flux;
			
		}
		@GetMapping("/person-list4")
		public Flux<Person> personList4(){
			
			Flux<Person> flux = Flux.just(new Person("Andres", "Cruz", 19)).delayElements(Duration.ofSeconds(1));
			return flux;
			
		}

}
