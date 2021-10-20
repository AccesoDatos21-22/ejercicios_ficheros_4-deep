package modelo;

import com.google.common.io.Files;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Pokemon implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String web = "https://pokeapi.co/api/v2/pokemon/";
	private Abilitites abilities;
	private int base_experience, height, id, weight;
	private String name;
	private Moves moves;

	public Pokemon(Abilitites abilities, int base_experience, int height, int id, int weight, String name,
			Moves moves) {
		super();
		this.abilities = abilities;
		this.base_experience = base_experience;
		this.height = height;
		this.id = id;
		this.weight = weight;
		this.name = name;
		this.moves = moves;
	}

	public boolean load(String name, String urlArchivo) {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(web + name).build();
		try (Response response = client.newCall(request).execute()) {

			File file = new File(urlArchivo);
			file.createNewFile();
			String data = response.body().string();
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(data);
			bw.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
