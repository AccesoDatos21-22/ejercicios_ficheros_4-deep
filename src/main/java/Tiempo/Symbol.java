package Tiempo;

import jakarta.xml.bind.annotation.*;

import java.math.BigInteger;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class Symbol {

    @XmlAttribute(name = "number", required = true)
    protected String number;
    @XmlAttribute(name = "name", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "var", required = true)
    protected String var;


    public String getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Symbol{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", var='" + var + '\'' +
                '}';
    }

    public void setNumber(String value) {
        this.number = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String value) {
        this.var = value;
    }

}
