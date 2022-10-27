package ejemplo5WebFlux;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class Controller {

	// MAPEO PARA EN LA DIRECCION /NUMBERS
	@GetMapping(path = "/numbers", produces = "text/event-stream")
	public Flux<Integer> numbers() {

		// SUSCESION DE DATO CADA 1 SEGUNDO
		Flux<Integer> flux = Flux.range(1, 10).delayElements(Duration.ofSeconds(1));

		return flux;

	}

	// MAPEO EN DIRECCION /NUMBERS-WITH....
	@GetMapping(path = "/numbers-with-subscribers", produces = "text/event-stream")

	public Flux<Integer> numbersWithSubscribers() {

		// SUCESION DE SUSCRIPTORES CADA 1 SEGUNDO, EN CONSOLA Y EN WEB EL TOTAL
		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));

		// SUBCRIPTOR 1
		flux.subscribe(n -> Subscriber.print(n));
		
		// SUSCRIPTOR 2
		flux.subscribe(n -> System.out.println("Subscriber 2: " + n));

		return flux;

	}
}
