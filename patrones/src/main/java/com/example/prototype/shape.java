package com.example.prototype;

//Metodo normal para hacer clonado.PROTOTYPE.
public abstract class shape implements IClonable{
	
	protected int x;
	
	protected int y;
	
	public shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	//metodo de IClonable
	@Override
	public Object clone() {
		return null;
	}

}
