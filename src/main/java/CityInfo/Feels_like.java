package CityInfo;

import java.io.Serializable;

public class Feels_like  implements Serializable{
	private String daty,night,eve,morn;
	public Feels_like() {
		
	}

	public String getDaty() {
		return daty;
	}

	public void setDaty(String daty) {
		this.daty = daty;
	}

	public String getNight() {
		return night;
	}

	public void setNight(String night) {
		this.night = night;
	}

	public String getEve() {
		return eve;
	}

	public void setEve(String eve) {
		this.eve = eve;
	}

	public String getMorn() {
		return morn;
	}

	public void setMorn(String morn) {
		this.morn = morn;
	}
	
}
