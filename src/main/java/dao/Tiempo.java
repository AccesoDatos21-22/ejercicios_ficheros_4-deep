package dao;

public class Tiempo {
    private String fecha;
    private Sol sol;
    private Temperatura temperatura;
    private Double precipitaciones;
    private Double velViento;
    private int humedad;

    public Tiempo(String fecha, Sol sol, Temperatura temperatura, Double precipitaciones, Double velViento, int humedad) {
        this.fecha = fecha;
        this.sol = sol;
        this.temperatura = temperatura;
        this.precipitaciones = precipitaciones;
        this.velViento = velViento;
        this.humedad = humedad;
    }

    public Tiempo() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Sol getSol() {
        return sol;
    }

    public void setSol(Sol sol) {
        this.sol = sol;
    }

    public Temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public Double getPrecipitaciones() {
        return precipitaciones;
    }

    public void setPrecipitaciones(Double precipitaciones) {
        this.precipitaciones = precipitaciones;
    }

    public Double getVelViento() {
        return velViento;
    }

    public void setVelViento(Double velViento) {
        this.velViento = velViento;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }
}
