package places;


import people.Emotion;

import java.util.Objects;

public class Place {
    private String name;
    private WeatherType weatherType;

    public Place(String name, WeatherType weatherType){
        this.name = name;
        this.weatherType = weatherType;
    }

    public String changeEmotion(WeatherType weatherType){
        if (WeatherType.FOGGY == weatherType){
           return "Sad";
        } else if (WeatherType.SUNNY == weatherType){
            return "Happy";
        }
        return "";
    }

    public String getName(){
        return name;
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
        return "Place{" +
                "name='" + name + '\'' +
                ", weatherType=" + weatherType +
                '}';
    }

}
