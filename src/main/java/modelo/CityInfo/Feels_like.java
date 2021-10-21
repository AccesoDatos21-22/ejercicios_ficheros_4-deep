package modelo.CityInfo;

import java.io.Serializable;

public class Feels_like  implements Serializable{
	/**
	 * @author oscar Gonzalez
	 */
	private static final long serialVersionUID = 1L;
	private String daty,night,eve,morn;
	public Feels_like() {
		
	}
	

	@Override
	public String toString() {
		return "Feels_like [daty=" + daty + ", night=" + night + ", eve=" + eve + ", morn=" + morn + "]";
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