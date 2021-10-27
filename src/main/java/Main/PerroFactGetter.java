package Main;

import com.google.common.io.Files;
import com.google.gson.Gson;

import modelo.Fact.Fact;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

public class PerroFactGetter implements Serializable {

	/**
	 * @author Oscar Gonzalez
	 **/
	private static final long serialVersionUID = 1L;
	private static final String web = "https://dog-facts-api.herokuapp.com/api/v1/resources/dogs?index=";

	// Devuelve una cita sobre Perros de manera aleatoria

	public PerroFactGetter() {

	}

	public void load() {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(web + getRandom()).build();
		try (Response response = client.newCall(request).execute()) {

			String data = response.body().string();
			Gson gson = new Gson();
			Fact[] perroFact = gson.fromJson(data, Fact[].class);
			System.out.println("Dato: " + perroFact[0].getFact());
		} catch (IOException e) {
			System.err.println("Erro al leer api");
		}
	}

	public static String getRandom() {
		Random ran = new Random();
		String num = String.valueOf(ran.nextInt(300));
		return num;
	}

}