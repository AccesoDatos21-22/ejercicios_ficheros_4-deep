package dao;

public class Temperatura {
    private Double temp;
    private Double tempMax;
    private Double tempMin;

    public Temperatura(Double temp, Double tempMax, Double tempMin) {
        this.temp = temp;
        this.tempMax = tempMax;
        this.tempMin = tempMin;
    }

    public Temperatura() {
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public void setTempMax(Double tempMax) {
        this.tempMax = tempMax;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public void setTempMin(Double tempMin) {
        this.tempMin = tempMin;
    }
}
