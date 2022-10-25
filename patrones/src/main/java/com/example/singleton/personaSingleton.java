package com.example.singleton;

public final class personaSingleton {

	private static personaSingleton personainstance;
	private String name;
	private int age;

	private personaSingleton() {
	
	}
	   
public static personaSingleton getInstance() {
	if(personainstance == null) {
		personainstance = new personaSingleton();
	}
	return personainstance;
    }
public void singletonOperation() {
	System.out.println("Soy persona");
	System.out.printf("Me llamo %s y mi edad es %d%n", name, age);

	  
	    }

}
