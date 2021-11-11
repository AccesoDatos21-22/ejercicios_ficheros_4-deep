package Tiempo;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "type",
        "country",
        "timezone",
        "location"
})
public class Location {
    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", country='" + country + '\'' +
                ", timezone='" + timezone + '\'' +
                ", location=" + location +
                ", altitude='" + altitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", geobase='" + geobase + '\'' +
                ", geobaseid='" + geobaseid + '\'' +
                '}';
    }

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Object type;
    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String timezone;
    @XmlElement(required = true)
    protected Location location;
    @XmlAttribute(name = "altitude", required = true)
    protected String altitude;
    @XmlAttribute(name = "latitude", required = true)
    protected String latitude;
    @XmlAttribute(name = "longitude", required = true)
    protected String longitude;
    @XmlAttribute(name = "geobase", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String geobase;
    @XmlAttribute(name = "geobaseid", required = true)
    protected String geobaseid;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public Object getType() {
        return type;
    }

    public void setType(Object value) {
        this.type = value;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String value) {
        this.country = value;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String value) {
        this.timezone = value;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location value) {
        this.location = value;
    }

    public String getAltitude() {
        return altitude;
    }

    public void setAltitude(String value) {
        this.altitude = value;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String value) {
        this.latitude = value;
    }

    public String getLongitude() {
        return longitude;
    }


    public void setLongitude(String value) {
        this.longitude = value;
    }


    public String getGeobase() {
        return geobase;
    }


    public void setGeobase(String value) {
        this.geobase = value;
    }

    public String getGeobaseid() {
        return geobaseid;
    }


    public void setGeobaseid(String value) {
        this.geobaseid = value;
    }


}