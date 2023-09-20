package org.animals;

public class Delfino extends Animale implements Nuotante {

	@Override
	public void verso() {
		System.out.println("Iiii");
	}

	@Override
	public void mangia() {
		System.out.println("Pesce, molluschi, etc...");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}
}
