package place;

import java.util.Objects;

public class Town {
    private String name;
    private WeatherType weatherType;

    public Town(String name, WeatherType weatherType){
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
        if (!(object instanceof Town town)) return false;
        return Objects.equals(name, town.name) && weatherType == town.weatherType;
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
