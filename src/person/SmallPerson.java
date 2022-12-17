package person;
import emotion.Emotion;

public abstract class SmallPerson {
    private String name;
    private String ability;
    protected Emotion currentEmotion;

    public SmallPerson(String name, Emotion currentEmotion){
        this.name = name;
        this.currentEmotion = currentEmotion;
    }

    public abstract void doStuff(String name, String ability, String target);

    public String getName(){
        return name;
    }

    public Emotion getCurrentEmotion() {
        System.out.println(currentEmotion);
        return currentEmotion;
    }


    public String getAbility(){
        return ability;
    }
}
