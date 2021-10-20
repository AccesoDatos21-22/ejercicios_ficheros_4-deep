package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import modelo.Farmacia;
import modelo.Medicamento;

public class FarmaciaXSTREAM implements FarmaciaDAO {

	final static String rutaFarmcia = "farmaciaX.xml"; // localizacion del fichero XML

	@Override
	public Farmacia leer() {
		File file = new File(rutaFarmcia);
		XStream xstream = new XStream();
		Farmacia farmacia;
		try {
			Class<?>[] classes = new Class[] { Farmacia.class, Medicamento.class };
			xstream.allowTypes(classes); // Dejamos que xstream use estas clases para que no nos salte
											// ForbiddenClassException
			xstream.alias("farmacia", Farmacia.class);
			xstream.alias("medicamento", Medicamento.class);// definimos el nombre del atributo, para no ver .class
			xstream.addImplicitCollection(Farmacia.class, "medicamentos");

			farmacia = (Farmacia) xstream.fromXML(new FileInputStream(file)); // guardamos en objeto farmacia
		} catch (FileNotFoundException e) {
			System.err.println("El archivo no existe.");
			return null;
		}

		return farmacia;
	}

	@Override
	public boolean guardar(Farmacia farmacia) {
		File file = new File(rutaFarmcia);
		try {
			file.createNewFile();

			XStream xstream = new XStream(new DomDriver());
			// definimos el nombre del atributo, para no ver .class
			xstream.alias("farmacia", Farmacia.class);
			xstream.alias("medicamento", Medicamento.class);
			xstream.addImplicitCollection(Farmacia.class, "medicamentos"); // definimos la lista
			xstream.toXML(farmacia, new FileOutputStream(file));
			return true;
		} catch (IOException e) {
			System.err.println("Error al crear el archivo");
			return false;
		}
	}

}
