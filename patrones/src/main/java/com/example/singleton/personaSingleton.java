package com.example.singleton;

public final class personaSingleton {

	private static personaSingleton Instance;
	private String name;
	private int age;

	public personaSingleton() {
	
	}
	   
public static personaSingleton getInstance() {
	if(Instance == null) {
		Instance = new personaSingleton();
	}
	return Instance;
    }
public void singletonOperation() {
	System.out.println("Soy persona");
	System.out.printf("Me llamo %s y mi edad es %d%n", name, age);

	  
	    }

}
