package com.example.singleton;

public class persona {
	
	public String name;
	public int age;
	public int telefono;
	public String direccion;
	
	
	public persona(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public persona() {
		
	}
	//constructor para clonar.PROTOTYPE.
	public persona(persona person) {
		this.name = person.getName();
		this.age = person.getAge();
		
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

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "persona [name=" + name + ", age=" + age + "]";
	}
	
	//metodo para clonar personas. PROTOTYPE.
	public persona clone() {
		return new persona(this);
		
		//metodo normal de clonacion, sin constructor
		/*persona person = new persona();
		person.setName(this.name);
		person.setAge(this.age);
		return person;*/
	}

}
