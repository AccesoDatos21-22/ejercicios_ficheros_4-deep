package modelo;

import com.google.common.io.Files;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class GetFacts implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String web = "https://dog-facts-api.herokuapp.com/api/v1/resources/dogs?index=";
	private Abilitites abilities;
	private int base_experience, height, id, weight;
	private String name;
	private Moves moves;

	public GetFacts() {
	}

	public boolean load(String name, String urlArchivo) {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(web + name).build();
		try (Response response = client.newCall(request).execute()) {

			String data = response.body().string();
			Gson gson = new Gson();
			PerroFacts[] perroFact = gson.fromJson(data, PerroFacts[].class);
			System.out.println("Dato: " + perroFact[0].getFact());
			return true;
		} catch (IOException e) {
			System.err.println("Erro al leer api");
			return false;
		}
	}

}
