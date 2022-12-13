package emotion;

import places.Place;
import places.WeatherType;

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
    public String toString() {
        return "Настроение" + typeOfEmotion;
    }
}
