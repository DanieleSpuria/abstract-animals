package org.animals;

public class Passerotto extends Animale {

	@Override
	public void verso() {
		System.out.println("Chirp");
	}

	@Override
	public void mangia() {
		System.out.println("Insetti, semi, frutta, etc...");
	}

}
