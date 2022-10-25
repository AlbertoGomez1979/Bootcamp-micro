package Builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

//Aqui está la clase PersonBuilder

public class PersonPatternBuilder {
	
	private String name;
	
	private int age;
	
	
	//Constructor para persona
	public PersonPatternBuilder(PersonPatternBuilder person) {
		super();
		this.name = person.name;
		this.age = person.age;
	}
	
	//Constructor para personBuilder PRIVADO
	private PersonPatternBuilder(PersonBuilder personBuilder) {
		super();
		this.name = personBuilder.name;
		this.age = personBuilder.age;
	}


	@Override
	public String toString() {
		return "PersonPatternBuilder [name=" + name + ", age=" + age + "]";
	}



	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	
	public static class PersonBuilder{
		private String name;
		private int age;
		
		
		public PersonBuilder name(String name) {			
			this.name = name;
			return this;
		}
		
		public PersonBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		
		public PersonPatternBuilder build() {
			return new PersonPatternBuilder(this);
		}
		
		
		
	}

}
