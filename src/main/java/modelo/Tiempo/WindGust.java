package modelo.Tiempo;

import jakarta.xml.bind.annotation.*;

import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class WindGust {

    @XmlAttribute(name = "gust", required = true)
    protected String gust;
    @XmlAttribute(name = "unit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;

    public String getGust() {
        return gust;
    }

    @Override
    public String toString() {
        return "WindGust{" +
                "gust='" + gust + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }

    public void setGust(String value) {
        this.gust = value;
    }

    public String getUnit() {
        if (unit == null) {
            return "m/s";
        } else {
            return unit;
        }
    }

    public void setUnit(String value) {
        this.unit = value;
    }

}