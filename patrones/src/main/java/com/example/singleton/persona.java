package com.example.singleton;

public class persona {
	
	public String name;
	public int age;
	
	
	public persona(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "persona [name=" + name + ", age=" + age + "]";
	}

}
