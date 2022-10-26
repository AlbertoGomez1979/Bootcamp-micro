package ntt.data.bootcamp.pruebasStarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

//CLASE PARA USAR PROMETHEUS

@RestController
public class TestController {
	
	private Counter counter;
	
	public TestController(MeterRegistry registry) {
		this.counter = Counter.builder("invocaciones.helloworld").description("Invocaciones totales").register(registry);
	}
	
	@GetMapping(path="/helloworld")
	public String helloworld() {
	counter.increment();
	return "hello world Forever";
	}
}
