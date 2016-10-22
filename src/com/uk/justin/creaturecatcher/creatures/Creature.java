package com.uk.justin.creaturecatcher.creatures;

public class Creature {

	private Species species;
	private int level;

	public Creature(Species species, int level) {
		this.species = species;
		this.level = level;
	}
	
	public Species getSpecies() {
		return species;
	}
	
	public int getLevel() {
		return level;
	}
}
