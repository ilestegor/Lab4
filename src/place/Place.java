package place;

import java.util.Objects;

public class Place {
    private String name;
    private WeatherType weatherType;

    public Place(String name, WeatherType weatherType){
        this.name = name;
        this.weatherType = weatherType;
    }


    public String getName(){
        return name;
    }

    public WeatherType getWeatherType() {
        return weatherType;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Place place)) return false;
        return Objects.equals(name, place.name) && weatherType == place.weatherType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weatherType);
    }

    @Override
    public String toString() {
        return "places.Place{" +
                "name='" + name + '\'' +
                ", weatherType=" + weatherType +
                '}';
    }

}
