package Main;

import com.google.gson.Gson;

import CityInfo.General;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class WeatherGetter {
	private General general;
	private String web="https://api.openweathermap.org/data/2.5/forecast/daily?q=Collado%20Villalba&units=metric&appid=479092b77bcf850403cb2aeb1a302425";

	public WeatherGetter() {

	}

	public void getInfo() {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder().url(web).build();
		try (Response response = client.newCall(request).execute()) {

			String data = response.body().string();
			Gson gson = new Gson();
			General g = (General) gson.fromJson(data, General.class);
			general= g;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void getData() {
		System.out.println("El tiempo en "+ general.getCity().getName() );
	}
}
