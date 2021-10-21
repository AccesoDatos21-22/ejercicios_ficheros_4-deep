package Main;

class Main {

	private static final String web = "";

	public static void main(String[] args) {
		WeatherGetter wg = new WeatherGetter();
		wg.getInfo();
		wg.getData();
	}
}