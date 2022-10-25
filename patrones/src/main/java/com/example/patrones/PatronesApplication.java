package com.example.patrones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.prototype.Person;
import com.example.singleton.persona;
import com.example.singleton.personaSingleton;
import com.example.singleton.personaSingletoneager;

import Builder.carbuilder;
import Builder.coche;
import Builder.director;

@SpringBootApplication
public class PatronesApplication implements CommandLineRunner{

	//CLASE IMPORTADA DE SPRING PARA USAR LA CLASE CONFIG
	//DE CONFIGURACION.
	@Autowired
	private ApplicationContext context;
	
	
	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		//PATRON SINGLETONE
		/*persona person = new persona();
		persona person2 = new persona("asd",40);
		
		personaSingleton personS = new personaSingleton();
		person.getInstance();
		
		personaSingletoneager.INSTANCE.setName("Alberto");
		personaSingletoneager.INSTANCE.setAge(40);
		
		System.out.println(personaSingletoneager.INSTANCE.getName());*/
	
	   //PATRON BUILD
	/*	director director = new director();
		carbuilder carbuilder = new carbuilder();
		director.createsupercar(carbuilder);
		coche supercar = carbuilder.build();
		
		System.out.println(supercar.toString());*/
		
		
		System.out.println("pROTOTYPE name "+ ((Person)context.getBean("personPrototype")).getName());
		System.out.println("pROTOTYPE id "+ context.getBean("personPrototype").hashCode());
		System.out.println("pROTOTYPE id "+ context.getBean("personPrototype").hashCode());
		System.out.println("pROTOTYPE id "+ context.getBean("personPrototype").hashCode());
		System.out.println("pROTOTYPE name2 "+ ((Person)context.getBean("personPrototype")).getName());
	}

}
