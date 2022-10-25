package Builder;

public class carbuilder implements Builder {
	
	private coche coche;
	
	public carbuilder() {
		this.reset();
	}

	@Override
	public void setMatricula(String matricula) {
		this.coche.setMatricula(matricula);
		
	}

	@Override
	public void setRuedas(int ruedas) {
		this.coche.setRuedas(ruedas);
		
	}

	@Override
	public void setPuertas(int puertas) {
		this.coche.setPuertas(puertas);
		
	}
	

	@Override
	public void reset() {
		this.reset();
		
	}
	
	public coche build() {
		coche product = this.coche;
		this.reset();
		return product;
	}



}
