package Tiempo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class Sun {

    @XmlAttribute(name = "rise", required = true)
    protected String rise;
    @XmlAttribute(name = "set", required = true)
    protected String set;

    public String getRise() {
        return rise;
    }

    public void setRise(String value) {
        this.rise = value;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String value) {
        this.set = value;
    }

    @Override
    public String toString() {
        return "Sun{" +
                "rise='" + rise + '\'' +
                ", set='" + set + '\'' +
                '}';
    }
}
