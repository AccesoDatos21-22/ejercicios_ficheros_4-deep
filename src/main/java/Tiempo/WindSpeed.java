package Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class WindSpeed {
    @Override
    public String toString() {
        return "WindSpeed{" +
                "mps='" + mps + '\'' +
                ", unit='" + unit + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @XmlAttribute(name = "mps", required = true)
    protected String mps;
    @XmlAttribute(name = "unit", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String unit;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;


    public String getMps() {
        return mps;
    }

    public void setMps(String value) {
        this.mps = value;
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


    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}