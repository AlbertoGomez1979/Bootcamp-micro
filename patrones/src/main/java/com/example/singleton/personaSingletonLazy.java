package com.example.singleton;

import java.util.Objects;

public class personaSingletonLazy {
	
	private static persona INSTANCE;
	
	//private personaSingletoneLazy() {super();}
	
	public static persona getInstance() {
		if(Objects.isNull(INSTANCE)) {
			INSTANCE = new persona();
		}
		return INSTANCE;
	}

}
