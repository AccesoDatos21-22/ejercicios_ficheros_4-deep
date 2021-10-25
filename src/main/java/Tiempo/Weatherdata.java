package Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "location",
        "credit",
        "meta",
        "sun",
        "forecast"
})
@XmlRootElement(name = "weatherdata")
public class Weatherdata {
    @XmlElement(required = true)
    protected Location location;
    @XmlElement(required = true)
    protected Object credit;
    @XmlElement(required = true)
    protected Meta meta;
    @XmlElement(required = true)
    protected Sun sun;
    @XmlElement(required = true)
    protected Forecast forecast;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location value) {
        this.location = value;
    }

    public Object getCredit() {
        return credit;
    }

    public void setCredit(Object value) {
        this.credit = value;
    }

    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return "Weatherdata{" +
                "location=" + location +
                ", credit=" + credit +
                ", meta=" + meta +
                ", sun=" + sun +
                ", forecast=" + forecast +
                '}'+"\n";
    }

    public void setMeta(Meta value) {
        this.meta = value;
    }

    public Sun getSun() {
        return sun;
    }

    public void setSun(Sun value) {
        this.sun = value;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public void setForecast(Forecast value) {
        this.forecast = value;
    }

}
