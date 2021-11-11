package Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class WindDirection {
    @Override
    public String toString() {
        return "WindDirection{" +
                "deg='" + deg + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @XmlAttribute(name = "deg", required = true)
    protected String deg;
    @XmlAttribute(name = "code", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;

    public String getDeg() {
        return deg;
    }

    public void setDeg(String value) {
        this.deg = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        this.code = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

}