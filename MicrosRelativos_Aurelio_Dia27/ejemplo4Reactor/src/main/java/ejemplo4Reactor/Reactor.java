package ejemplo4Reactor;

import reactor.core.publisher.Flux;

public class Reactor {

	public static void main(String[] args) {
		
		//METODO PUBLISHER CON 3 MENSAJES
		Flux<String> publisher = Flux.just("Mensaje1","Mensaje2","Mensaje3");
		
		publisher.subscribe(next -> System.out.println("Observador 1, recibido" + next)
				.error -> System.out.println("Observador 1, error" + e.getMessage)
				.completed -> System.out.println("Observador 1, completado")));
				
		

	}
}
