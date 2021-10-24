package Tiempo;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "time"
})
public class Forecast {

    @XmlElement(required = true)
    protected List<Time> time;

    public List<Time> getTime() {
        if (time == null) {
            time = new ArrayList<Time>();
        }
        return this.time;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "time=" + time +
                '}';
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "sun",
            "symbol",
            "precipitation",
            "windDirection",
            "windSpeed",
            "windGust",
            "temperature",
            "feelsLike",
            "pressure",
            "humidity",
            "clouds"
    })
    public static class Time {

        @XmlElement(required = true)
        protected Sun sun;
        @XmlElement(required = true)
        protected Symbol symbol;
        @XmlElement(required = true)
        protected Precipitation precipitation;
        @XmlElement(required = true)
        protected WindDirection windDirection;
        @XmlElement(required = true)
        protected WindSpeed windSpeed;
        @XmlElement(required = true)
        protected WindGust windGust;
        @XmlElement(required = true)
        protected Temperature temperature;
        @XmlElement(name = "feels_like", required = true)
        protected FeelsLike feelsLike;
        @XmlElement(required = true)
        protected Pressure pressure;
        @XmlElement(required = true)
        protected Humidity humidity;
        @XmlElement(required = true)
        protected Clouds clouds;
        @XmlAttribute(name = "day", required = true)
        @XmlSchemaType(name = "date")
        protected String day;

        @Override
        public String toString() {
            return "Time{" +
                    "sun=" + sun +
                    ", symbol=" + symbol +
                    ", precipitation=" + precipitation +
                    ", windDirection=" + windDirection +
                    ", windSpeed=" + windSpeed +
                    ", windGust=" + windGust +
                    ", temperature=" + temperature +
                    ", feelsLike=" + feelsLike +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", clouds=" + clouds +
                    ", day='" + day + '\'' +
                    '}';
        }

        public Sun getSun() {
            return sun;
        }

        public void setSun(Sun value) {
            this.sun = value;
        }

        public Symbol getSymbol() {
            return symbol;
        }

        public void setSymbol(Symbol value) {
            this.symbol = value;
        }

        public Precipitation getPrecipitation() {
            return precipitation;
        }

        public void setPrecipitation(Precipitation value) {
            this.precipitation = value;
        }

        public WindDirection getWindDirection() {
            return windDirection;
        }

        public void setWindDirection(WindDirection value) {
            this.windDirection = value;
        }

        public WindSpeed getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(WindSpeed value) {
            this.windSpeed = value;
        }

        public WindGust getWindGust() {
            return windGust;
        }

        public void setWindGust(WindGust value) {
            this.windGust = value;
        }

        public Temperature getTemperature() {
            return temperature;
        }

        public void setTemperature(Temperature value) {
            this.temperature = value;
        }

        public FeelsLike getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLike value) {
            this.feelsLike = value;
        }

        public Pressure getPressure() {
            return pressure;
        }

        public void setPressure(Pressure value) {
            this.pressure = value;
        }

        public Humidity getHumidity() {
            return humidity;
        }

        public void setHumidity(Humidity value) {
            this.humidity = value;
        }

        public Clouds getClouds() {
            return clouds;
        }

        public void setClouds(Clouds value) {
            this.clouds = value;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String value) {
            this.day = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Sun {
            @Override
            public String toString() {
                return "Sun{" +
                        "rise='" + rise + '\'' +
                        ", set='" + set + '\'' +
                        '}';
            }

            @XmlAttribute(name = "rise", required = true)
            @XmlSchemaType(name = "dateTime")
            protected String rise;
            @XmlAttribute(name = "set", required = true)
            @XmlSchemaType(name = "dateTime")
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

        }


    }

}