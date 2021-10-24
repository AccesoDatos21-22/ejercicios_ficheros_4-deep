package Tiempo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "lastupdate",
        "calctime",
        "nextupdate"
})
public class Meta {
    @Override
    public String toString() {
        return "Meta{" +
                "lastupdate=" + lastupdate +
                ", calctime='" + calctime + '\'' +
                ", nextupdate=" + nextupdate +
                '}';
    }

    @XmlElement(required = true)
    protected Object lastupdate;
    @XmlElement(required = true)
    protected String calctime;
    @XmlElement(required = true)
    protected Object nextupdate;

    public Object getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Object value) {
        this.lastupdate = value;
    }

    public String getCalctime() {
        return calctime;
    }

    public void setCalctime(String value) {
        this.calctime = value;
    }

    public Object getNextupdate() {
        return nextupdate;
    }


    public void setNextupdate(Object value) {
        this.nextupdate = value;
    }

}
