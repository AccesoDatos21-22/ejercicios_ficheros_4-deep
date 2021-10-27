package modelo.CityInfo;

import java.io.Serializable;

public class Coord implements Serializable {
	/**
	 * @author Oscar Gonzalez
	 */
	private static final long serialVersionUID = 1L;
	private String lon,lat;

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
	
	public Coord() {
		
	}

}