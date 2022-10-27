package ejemplo6.ejemplo6WebFlux;

public class Person {
	
	private String Firstname;
	private String Lastname;
	private int Age;
	
	
	public Person(String name, String apellido, int edad) {
		
		this.Firstname = name;
		this.Lastname = apellido;
		this.Age = edad;
		
		
	}
	public String getName() {
		return Firstname;
	}
	public void setName(String name) {
		this.Firstname = name;
	}
	public String getApellido() {
		return Lastname;
	}
	public void setApellido(String apellido) {
		this.Lastname = apellido;
	}
	public int getEdad() {
		return Age;
	}
	public void setEdad(int edad) {
		this.Age = edad;
	}
	@Override
	public String toString() {
		return "Person [name=" + Firstname + ", apellido=" + Lastname + ", edad=" + Age + "]";
	}

}
