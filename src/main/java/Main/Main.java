package Main;

import java.util.Random;

import modelo.GetFacts;

class Main {
	public final static String ruta = "facts.json";
	public static void main(String[] args) {
		Random ran = new Random();
		String num= String.valueOf(ran.nextInt(300));
		GetFacts perro = new GetFacts();
		perro.load(num,ruta);

	}

}