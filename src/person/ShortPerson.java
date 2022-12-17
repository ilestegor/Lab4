package person;
import emotion.*;
import place.Place;


public class ShortPerson extends SmallPerson {

    public ShortPerson(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }
    public void doStuff(String name, String ability, String target){
        System.out.println(getName() + ability + target);
    }

    @Override
    public String toString() {
        return "ShortPerson{}";
    }
}
