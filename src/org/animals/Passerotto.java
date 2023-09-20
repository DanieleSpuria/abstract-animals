package org.animals;

public class Passerotto extends Animale implements Volante {

	@Override
	public void verso() {
		System.out.println("Chirp");
	}

	@Override
	public void mangia() {
		System.out.println("Insetti, semi, frutta, etc...");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");	
	}
}
