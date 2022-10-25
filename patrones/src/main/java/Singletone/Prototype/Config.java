package Singletone.Prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.prototype.Person;

//USAR SINGLETON Y PROTOTYPE CON SPRINGBOOT, LOS 2 JUNTOS.
//EN TODA LA APLICACION.
@Configuration
public class Config {
	
	@Bean(name ="personPrototype")
	@Scope("prototype")
	
	public Person personPrototype() {
		return new Person("Alfonso", 23);
	}
	
	@Bean(name = "personSingleton")
	//@Scope("Singleton")
	public Person personSingleton() {
		return new Person("Alfonso", 23);
	}
	

}
