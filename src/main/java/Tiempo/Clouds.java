package Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Clouds {
    @Override
    public String toString() {
        return "Clouds{" +
                "value='" + value + '\'' +
                ", all='" + all + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }

    @XmlAttribute(name = "value", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String value;
    @XmlAttribute(name = "all", required = true)
    protected String all;
    @XmlAttribute(name = "unit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAll() {
        return all;
    }

    public void setAll(String value) {
        this.all = value;
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

}
