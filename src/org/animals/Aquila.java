package org.animals;

public class Aquila extends Animale implements Volante {

	@Override
	public void verso() {
		System.out.println("Skreee");
	}

	@Override
	public void mangia() {
		System.out.println("Carne, pesce, etc...");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");	
	}
}
