package Builder;

public class carbuilder implements Builder {
	
	private String matricula;
	private int ruedas;
	private int puertas;

	@Override
	public void setMatricula() {
		this.matricula = matricula;
		
	}

	@Override
	public void setRuedas() {
		this.ruedas = ruedas;
		
	}

	@Override
	public void setPuertas() {
		this.puertas = puertas;
		
	}
	
	public coche getCar() {
		return new coche(matricula, ruedas, puertas);
	}

}
