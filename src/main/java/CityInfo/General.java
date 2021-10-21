package CityInfo;

import java.io.Serializable;

public class General implements Serializable {
	private City city;
	private int cod;
	private String message;
	private String cnt;
	private DataObject[]list;
	
	
	public General() {
		
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public DataObject[] getList() {
		return list;
	}
	public void setList(DataObject[] list) {
		this.list = list;
	}
	
	

}
