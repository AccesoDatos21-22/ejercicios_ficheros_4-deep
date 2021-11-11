package Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Pressure {

    @XmlAttribute(name = "unit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;
    @XmlAttribute(name = "value", required = true)
    protected String value;

    public String getUnit() {
        if (unit == null) {
            return "hPa";
        } else {
            return unit;
        }
    }

    public void setUnit(String value) {
        this.unit = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pressure{" +
                "unit='" + unit + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
