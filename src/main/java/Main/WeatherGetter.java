package Main;

import com.google.gson.Gson;

import modelo.CityInfo.City;
import modelo.CityInfo.DataObject;
import modelo.CityInfo.General;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherGetter {
	private General general;
	private String web;

	public WeatherGetter(String ciudad) {
		// Creamos la url con la ciudad selecionada por el cliente
		web = "https://api.openweathermap.org/data/2.5/forecast/daily?q=" + ciudad
				+ "&units=metric&appid=479092b77bcf850403cb2aeb1a302425";
	}

	public void loadInfo() {
		//Creamos la conexion
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(web).build();
		try (Response response = client.newCall(request).execute()) {

			String data = response.body().string();
			Gson gson = new Gson();
			// Con GSon la guardamos en un objeto General, el cual contiene todos los datos que recoge el archivo JSON
			General g = (General) gson.fromJson(data, General.class);
			general = g;
		} catch (Exception e) {
			System.err.println("Error al guardar tiempo");
		}

	}

	public void showData() {
		if( general.getCod()!=200){
			System.err.println("La ciudad no existe o esta mal escrita.");
			return;
		}
		City city = general.getCity();
		DataObject[] datas = general.getList();
		System.out.println(
				"El tiempo en " + city.getName() + ", con id:" + city.getId() + ", STATUS:" + general.getCod());
		System.out.println("Cambios:\n\n");
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i].toString());
		}

	}
}