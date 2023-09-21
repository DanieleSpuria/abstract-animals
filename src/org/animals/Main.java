package org.animals;

public class Main {

	public static void main(String[] args) {
		
		Cane       can = new Cane();
		Passerotto pas = new Passerotto();
		Aquila     aqu = new Aquila();
		Delfino    del = new Delfino();
				
		Animale[]  ani = new Animale[4]; 
		ani[0] = can;
		ani[1] = pas;
		ani[2] = aqu;
		ani[3] = del;
		
		for (int i = 0; i < ani.length; i++) {	
			System.out.println("[ " + ani[i].getClass().getSimpleName() + " ]\n");
			ani[i].verso();
			ani[i].mangia();
			ani[i].dormi();
			
			if (ani[i] instanceof Volante)
				faiVolare((Volante) ani[i]);
			else	
				faiNuotare((Nuotante) ani[i]);
				
			System.out.println("\n---------------------------------\n");
		}
	}
	
	static void faiVolare(Volante animale) {
		animale.vola();
	}	
	
	static void faiNuotare(Nuotante animale) {
		animale.nuota();
	}
}
