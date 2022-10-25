package Builder;

public class coche{
	
	private String matricula;
	private int ruedas;
	private int puertas;
	
	
	public coche(String matricula, int ruedas, int puertas) {
		
		this.matricula = matricula;
		this.ruedas = ruedas;
		this.puertas = puertas;
	}
	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	

}
