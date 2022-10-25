package com.example.patrones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

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
		//persona person = new persona();
		//persona person2 = new persona("asd",40);
		
		//personaSingletone person = new personaSingletone();
		//person.getInstance();
		
		/*personaSingletoneager.INSTANCE.setName("Alberto");
		personaSingletoneager.INSTANCE.setAge(40);
		
		System.out.println(personaSingletoneager.INSTANCE.getName());*/
	
	   //PATRON BUILD
		director director = new director();
		carbuilder builder = new carbuilder();
		director.createsupercar(builder);
		coche car = builder.getCar();
		System.out.println();
		 
	
	
	
	}

}
