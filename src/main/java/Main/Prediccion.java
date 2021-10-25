package Main;

import modelo.Tiempo.Weatherdata;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Prediccion {
    public void leer(String ruta){
        try {
            JAXBContext jaxbContext=JAXBContext.newInstance(Weatherdata.class);
            Unmarshaller unmarshaller= jaxbContext.createUnmarshaller();
            Weatherdata weatherdata= (Weatherdata) unmarshaller.unmarshal(new FileInputStream(ruta));
            System.out.println(weatherdata.toString().replace("null",""));
            //Dado que aparecen varios nulls a lo largo del archivo, haremos un replace para eliminar esos elementos inutiles
        } catch (FileNotFoundException e) {
            System.err.println("Error al leer el archivo");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
