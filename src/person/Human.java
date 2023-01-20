package person;
import emotion.*;
import interfaces.Doable;
import interfaces.Encounterable;
import place.Town;

import java.util.Objects;

public abstract class Human implements Doable {
    protected String name;
    protected Emotion currentEmotion;


    public Human(String name, Emotion currentEmotion){
        this.name = name;
        this.currentEmotion = currentEmotion;
    }
    public void setCurrentEmotion(Town town) {
        switch (town.getWeatherType()){
            case SUNNY -> {
                currentEmotion.setTypeOfEmotion("Веселое");
            }
            case FOGGY -> {
                currentEmotion.setTypeOfEmotion(" Згадочное:)");
            }
            case RAINY -> {
                currentEmotion.setTypeOfEmotion("Мрачное");
            }
            case SNOWY -> {
                currentEmotion.setTypeOfEmotion("Зимнее");
            }
            case WINDY -> {
                currentEmotion.setTypeOfEmotion("Ужасное");
            }

        }
    }

    public  String getName() {
        return name;
    }
    public String doTo(String name, String action, String target) {
        System.out.println(name + action + target);
        return name + action + target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return Objects.equals(getName(), human.getName()) && Objects.equals(currentEmotion, human.currentEmotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentEmotion);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", currentEmotion=" + currentEmotion +
                ", modifiedPlant=" +
                '}';
    }
}
