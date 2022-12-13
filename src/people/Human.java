package people;
import emotion.*;
import interfaces.*;

import java.util.Objects;

public class Human implements Explainable, Sayable, Thinkable, Doable, AbleToModify {
    private String name;
    private Emotion currentEmotion;
    private boolean modifiedPlant;

    public Human(String name, Emotion currentEmotion, boolean modifiedPlant){
        this.name = name;
        this.currentEmotion = currentEmotion;
        this.modifiedPlant = modifiedPlant;
    }



    public String explain(String name, String action){
        return name + action;
    }
    public String say(String name, String action){
        return name + action;
    }
    public String think(String name, String action, String durationOfThinking){
        return name + action + durationOfThinking;
    }
    public String doTo(String name, String action, String target){
        return name + action + target;
    }

    public void modifyStuff(Modifiable modifiable) {
        if (modifiedPlant){
            modifiable.modify();
        }

    }
    public String getName() {
        return name;
    }

    public Emotion getCurrentEmotion() {
        System.out.println(currentEmotion);
        return currentEmotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return modifiedPlant == human.modifiedPlant && Objects.equals(getName(), human.getName()) && Objects.equals(getCurrentEmotion(), human.getCurrentEmotion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCurrentEmotion(), modifiedPlant);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", currentEmotion=" + currentEmotion +
                ", modifiedPlant=" + modifiedPlant +
                '}';
    }
}
