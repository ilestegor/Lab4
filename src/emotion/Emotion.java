package emotion;

import places.Place;
import places.WeatherType;

import java.util.Objects;

public class Emotion {
    private String typeOfEmotion;
    public Emotion(String typeOfEmotion){
       this.typeOfEmotion = typeOfEmotion;
    }



    public void setTypeOfEmotion(Place place) {
       if (WeatherType.SUNNY == place.getWeatherType()){
           this.typeOfEmotion = "Веселое";
       } else if (WeatherType.FOGGY == place.getWeatherType()){
           this.typeOfEmotion = "Грустное";
       } else if (WeatherType.RAINY == place.getWeatherType()){
           this.typeOfEmotion = "Мрачное";
       }  else if (WeatherType.SNOWY == place.getWeatherType()){
           this.typeOfEmotion = "Зимнее";
       } else if (WeatherType.WINDY == place.getWeatherType()){
           this.typeOfEmotion = "Ужасное";
       }
    }

    public String getTypeOfEmotion(){
        return typeOfEmotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emotion emotion)) return false;
        return Objects.equals(getTypeOfEmotion(), emotion.getTypeOfEmotion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeOfEmotion());
    }

    @Override
    public String toString() {
        return "Настроение" + typeOfEmotion;
    }
}
