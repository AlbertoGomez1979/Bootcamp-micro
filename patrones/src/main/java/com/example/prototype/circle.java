package com.example.prototype;

//clase circle extiende de shape e implementa metodo clone
public class circle extends shape{

	public circle(int x, int y) {
		super(x, y);
		
	}
	
	public circle(circle circle) {
		super(circle.x, circle.y);
	}
	
	@Override
	public shape clone() {
		return new circle(this);
	}

}
