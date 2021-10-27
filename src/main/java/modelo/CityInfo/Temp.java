package modelo.CityInfo;

import java.io.Serializable;

public class Temp implements Serializable{
	/**
	 * @author Oscar Gonzalez
	 */
	private static final long serialVersionUID = 1L;
	private String day,min,max,night,eve,morn;
	
	public Temp() {
		
	}
	

	@Override
	public String toString() {
		return "Temp [day=" + day + ", min=" + min + ", max=" + max + ", night=" + night + ", eve=" + eve + ", morn="
				+ morn + "]";
	}


	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
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