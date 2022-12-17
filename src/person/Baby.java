package person;

import java.util.Objects;
import emotion.*;
import place.Place;

public class Baby extends SmallPerson {

    public Baby(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }
    public void doStuff(String name, String ability, String target){
        if (target.isEmpty()){
            System.out.println(getName() + ability);
        } else{
            System.out.println(getName() + ability + target);
        }

    }
    public void setCurrentEmotion(Place place) {
        switch (place.getWeatherType()){
            case SUNNY -> {
                currentEmotion.setTypeOfEmotion(" Веселое");
            }
            case FOGGY -> {
                currentEmotion.setTypeOfEmotion(" Мрачное");
            }
            case RAINY -> {
                currentEmotion.setTypeOfEmotion(" Радостное");
            }
            case SNOWY -> {
                currentEmotion.setTypeOfEmotion(" Зимнее");
            }
            case WINDY -> {
                currentEmotion.setTypeOfEmotion(" Ужасное");
            }

        }
    }

    public Emotion getCurrentEmotion() {
        System.out.println("У малышей" + currentEmotion);
        return currentEmotion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Baby baby = (Baby) object;
        return currentEmotion.equals(baby.currentEmotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentEmotion);
    }

    @Override
    public String toString() {
        return "people.Baby." +
                "currentEmotion=" + currentEmotion;
    }
}
