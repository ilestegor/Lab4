package person;
import emotion.*;
import place.Place;


public class ShortPerson extends SmallPerson {

    public ShortPerson(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }
    public void setCurrentEmotion(Place place) {
        switch (place.getWeatherType()){
            case SUNNY -> {
                currentEmotion.setTypeOfEmotion(" Веселое");
            }
            case FOGGY -> {
                currentEmotion.setTypeOfEmotion(" Грустное");
            }
            case RAINY -> {
                currentEmotion.setTypeOfEmotion(" Загадочное:)");
            }
            case SNOWY -> {
                currentEmotion.setTypeOfEmotion(" Зимнее");
            }
            case WINDY -> {
                currentEmotion.setTypeOfEmotion(" Ужасное");
            }
        }
    }


    public void doStuff(String name, String ability, String target){
        System.out.println(getName() + ability + target);
    }

    @Override
    public String toString() {
        return "ShortPerson{}";
    }
}
