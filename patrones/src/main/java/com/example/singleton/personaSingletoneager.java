package com.example.singleton;

public class personaSingletoneager {

	public static final persona INSTANCE = new persona();
	
	private personaSingletoneager() {super();}
}
