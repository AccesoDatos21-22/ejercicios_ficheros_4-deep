package Main;

import dao.JCCPokemonJAXB;
import dao.MedicamentoAleatorio;
import modelo.JCCPokemon;
import modelo.Medicamento;
import modelo.Pokemon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Main {
	public final static String ruta = "medicamentosRandom.txt";

	private static final String TIEMPO_XML_RUTA="src/Tiempo.xml";

	public static void main(String[] args) throws InterruptedException {
		try {
			Files.deleteIfExists(Paths.get(ruta));
		} catch (IOException e1) {
			System.err.println("error");
		}

		MedicamentoAleatorio me = new MedicamentoAleatorio();
		Medicamento md1 = new Medicamento("Paracetamol", 340, 0, 45, 109, 1, 0);
		Medicamento md2 = new Medicamento("Ibruprofeno", 21, 1, 23, 140, 2, 1);
		Medicamento md3 = new Medicamento("Acelerator", 342, 2, 25, 137, 4, 20);
		Medicamento md4 = new Medicamento("abecedari", 23, 3, 5, 37, 4, 45);
		Medicamento md5 = new Medicamento("Altori", 34, 4, 5, 17, 5, 5);
		me.guardar(md1);
		me.guardar(md2);
		me.guardar(md3);
		me.guardar(md4);
		me.guardar(md5);
		System.out.println(me.actualizar(new Medicamento("Prueba02", 4, 4, 5, 17, 15, 5)));
		System.out.println(me.borrar(md4));
		System.out.println(me.buscar("Ibruprofeno").toString());
		me.leerTodos().forEach(System.out::println);

		ArrayList<Pokemon> pokemons = new ArrayList<>();
		pokemons.add(new Pokemon("pikachu", 10, 11, 12, 13, 14, 15));
		pokemons.add(new Pokemon("Blastoise", 20, 21, 22, 23, 24, 25));
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		JCCPokemon jccPokemon = new JCCPokemon(pokemons, date, 3);
		JCCPokemonJAXB j1 = new JCCPokemonJAXB();
		j1.guardar(jccPokemon);
		j1.leer();
		//Ejercicio7
		Prediccion prediccion=new Prediccion();
		prediccion.leer(TIEMPO_XML_RUTA);

		// Leer tiempo en una ciudad via JSON
		WeatherGetter wg = new WeatherGetter("Collado Villalba");
		wg.loadInfo();
		wg.showData();



		Thread.sleep(2000);
		PerroFactGetter perros = new PerroFactGetter();
		boolean quedarse = true;
		Scanner sc = new Scanner(System.in);
		String respuesta;
		System.err.println("Escribe 'mas' para sacar un nuevo dato, escribe otra cosa cuando quieras parar.");
		while (quedarse) {
			perros.load();
			respuesta = sc.next();
			if (!respuesta.equals("mas"))
				quedarse = false;
		}
		System.err.println("Saliendo");
		sc.close();

	}
}