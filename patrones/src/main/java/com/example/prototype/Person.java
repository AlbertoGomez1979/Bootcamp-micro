package com.example.prototype;

import com.example.singleton.persona;

public class Person implements IClonable{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Person clone() {
		
		//ver clase persona
		//metodo normal de clonacion, sin constructor
		Person person = new Person();
		person.setName(this.name);
		person.setAge(this.age);
		return person;
	}

}
