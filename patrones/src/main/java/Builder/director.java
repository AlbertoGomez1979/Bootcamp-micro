package Builder;

public class director {
	
	
	//CONTRUCTOR
	public director(){
		
	}
	
	//TIPOS DE COCHE PARA CONSTRUIR
	public void createcar(Builder builder) {
		builder.setPuertas(4);
		builder.setMatricula("55444hjk");
		builder.setRuedas(4);
	}
	
	public void createsupercar(Builder builder) {
		builder.setMatricula("447722dgr");
		builder.setPuertas(2);
		builder.setRuedas(3);
	}

}
