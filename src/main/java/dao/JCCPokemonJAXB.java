package dao;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import modelo.JCCPokemon;
import java.io.*;


/**
 * @author Radek Lekston
 **/
public class JCCPokemonJAXB implements JCCPokemonDAO {
	private final String ruta="pokemon.xml";
	@Override
	public JCCPokemon leer() {
		JCCPokemon pokemon=null;
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(JCCPokemon.class);
			Unmarshaller unmarshaller=jaxbContext.createUnmarshaller();
			pokemon= (JCCPokemon) unmarshaller.unmarshal(new File(ruta));
			System.out.println(pokemon);
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return pokemon;
	}

	@Override
	public boolean guardar(JCCPokemon pokemones) {
		File file=new File(ruta);
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(JCCPokemon.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
			marshaller.marshal(pokemones,file);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return true;
	}
}