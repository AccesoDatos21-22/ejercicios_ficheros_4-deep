package Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Humidity {

    @XmlAttribute(name = "value", required = true)
    protected String value;
    @XmlAttribute(name = "unit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        if (unit == null) {
            return "%";
        } else {
            return unit;
        }
    }

    public void setUnit(String value) {
        this.unit = value;
    }

    @Override
    public String toString() {
        return "Humidity{" +
                "value='" + value + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}