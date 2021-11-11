package Tiempo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Precipitation {

    @XmlAttribute(name = "probability", required = true)
    protected String probability;

    public String getProbability() {
        if (probability == null) {
            return new String("0");
        } else {
            return probability;
        }
    }

    public void setProbability(String value) {
        this.probability = value;
    }

    @Override
    public String toString() {
        return "Precipitation{" +
                "probability='" + probability + '\'' +
                '}';
    }
}