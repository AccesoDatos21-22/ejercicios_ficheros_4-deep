package modelo.CityInfo;

import java.io.Serializable;

public class WeatherType implements Serializable{
	/**
	 * @author Oscar Gonzalez
	 */
	private static final long serialVersionUID = 1L;
	private String id,main,description,icon;
	
	public WeatherType() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return "WeatherType [main=" + main + ", description=" + description + "]";
	}
	
	
	
}