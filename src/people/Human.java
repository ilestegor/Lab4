package people;
import emotion.*;
import interfaces.*;
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


}
