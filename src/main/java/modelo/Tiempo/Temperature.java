package modelo.Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Temperature {
    @Override
    public String toString() {
        return "Temperature{" +
                "day='" + day + '\'' +
                ", min='" + min + '\'' +
                ", max='" + max + '\'' +
                ", night='" + night + '\'' +
                ", eve='" + eve + '\'' +
                ", morn='" + morn + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }

    @XmlAttribute(name = "day", required = true)
    protected String day;
    @XmlAttribute(name = "min", required = true)
    protected String min;
    @XmlAttribute(name = "max", required = true)
    protected String max;
    @XmlAttribute(name = "night", required = true)
    protected String night;
    @XmlAttribute(name = "eve", required = true)
    protected String eve;
    @XmlAttribute(name = "morn", required = true)
    protected String morn;
    @XmlAttribute(name = "unit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;

    public String getDay() {
        return day;
    }

    public void setDay(String value) {
        this.day = value;
    }

    public String getMin() {
        return min;
    }


    public void setMin(String value) {
        this.min = value;
    }

    public String getMax() {
        return max;
    }


    public void setMax(String value) {
        this.max = value;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String value) {
        this.night = value;
    }

    public String getEve() {
        return eve;
    }

    public void setEve(String value) {
        this.eve = value;
    }

    public String getMorn() {
        return morn;
    }

    public void setMorn(String value) {
        this.morn = value;
    }

    public String getUnit() {
        if (unit == null) {
            return "celsius";
        } else {
            return unit;
        }
    }

    public void setUnit(String value) {
        this.unit = value;
    }

}
