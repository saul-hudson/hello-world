package com.uk.justin.creaturecatcher.creatures;

public enum Species {

	RAT("Rat"),
	BIRD("Bird"),
	FROG("Frog");
	
	private String name;
	
	private Species(String name) {
		this.name = name;
	}
}
