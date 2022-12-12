package people;

import interfaces.*;

public class Human implements Explainable, Sayable, Thinkable, Doable, AbleToModify {
    private String name;
    private String currentEmotion;

    public Human(String name, String currentEmotion){
        this.name = name;
        this.currentEmotion = currentEmotion;
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

    public String modifyPlant(Modifiable modifiable) {
        return "h";
    }

    public String getName() {
        return name;
    }

    public String getCurrentEmotion() {
        return currentEmotion;
    }
}
