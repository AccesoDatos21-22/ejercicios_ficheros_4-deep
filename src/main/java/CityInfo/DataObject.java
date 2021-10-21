package CityInfo;

import java.io.Serializable;
import java.util.Arrays;

public class DataObject implements Serializable {
	private String dt,sunrise,sunset;
	private Temp temp;
	private Feels_like feels_like;
	private String pressure,humidity;
	private WeatherType[] weather;
	private String speed,deg,gust,clouds,pop;
	
	public DataObject() {
		
	}
	
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public Temp getTemp() {
		return temp;
	}
	public void setTemp(Temp temp) {
		this.temp = temp;
	}
	public Feels_like getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(Feels_like feels_like) {
		this.feels_like = feels_like;
	}
	public String getPressure() {
		return pressure;
	}
	public void setPressure(String pressure) {
		this.pressure = pressure;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public WeatherType[] getWeather() {
		return weather;
	}
	public void setWeather(WeatherType[] weather) {
		this.weather = weather;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getDeg() {
		return deg;
	}
	public void setDeg(String deg) {
		this.deg = deg;
	}
	public String getGust() {
		return gust;
	}
	public void setGust(String gust) {
		this.gust = gust;
	}
	public String getClouds() {
		return clouds;
	}
	public void setClouds(String clouds) {
		this.clouds = clouds;
	}
	public String getPop() {
		return pop;
	}
	public void setPop(String pop) {
		this.pop = pop;
	}

	@Override
	public String toString() {
		return "[dt=" + dt + ", Amanecer=" + sunrise + ", Atardecer=" + sunset + ", Temperatura=" + temp+",\nPresion=" + pressure + ", Humedad=" + humidity + ", Tiempo="
				+ Arrays.toString(weather) + ", Velocidad=" + speed + ", deg=" + deg + ", gust=" + gust + ", Nubes="
				+ clouds + ", pop=" + pop + "]\n ******************\n";
	}
	
	
	
}
