package dao;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import modelo.JCCPokemon;

import java.io.*;


public class JCCPokemonJAXB implements JCCPokemonDAO {
	private final String ruta="pokemon.xml";
	@Override
	public JCCPokemon leer() {
		JCCPokemon pokemon=null;
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(JCCPokemon.class);
			Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
			pokemon= (JCCPokemon) unmarshaller.unmarshal(new InputStreamReader(new FileInputStream(ruta)));
		}
		catch (JAXBException | FileNotFoundException e) {
			e.printStackTrace();
		}
		return pokemon;
	}

	@Override
	public boolean guardar(JCCPokemon pokemones) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JCCPokemon.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(pokemones, new OutputStreamWriter(new FileOutputStream(ruta)));
		} catch (JAXBException | IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}
