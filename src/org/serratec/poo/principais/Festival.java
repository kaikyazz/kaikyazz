package org.serratec.poo.principais;

import org.serratec.poo.classes.Banda;
import org.serratec.poo.classes.Cantor;
import org.serratec.poo.classes.DJ;
import org.serratec.poo.classes.Genero;
import org.serratec.poo.classes.Artista;
import org.serratec.poo.classes.Palco;


public class Festival {

	public static void main(String[] args) {
		Cantor cantor1 = new Cantor("Iza", Genero.POP, 500);
		Palco palco1 = new Palco("sla", 20);
		System.out.println(cantor1);

		Banda banda1 = new Banda("Red Hot Chili Peppers", Genero.ROCK, 100000);
		System.out.println(banda1);

		Cantor cantor2 = new Cantor("Ludmila", Genero.FUNK, 60000);
		System.out.println(cantor2);

		Banda banda2 = new Banda("The Cure", Genero.ROCK, 80000);
		System.out.println(banda2);

		DJ dj1 = new DJ("DJ Pv", Genero.ELETRONICA, 70000);
		System.out.println(dj1);

		Banda banda3 = new Banda("Coletivo Candiero", Genero.MPB, 80000);
        System.out.println(banda3);
	}

}
