package people;

import java.util.Objects;
import emotion.*;

public class ShortPerson extends SmallPerson {
    private Emotion currentEmotion;
    public ShortPerson(String name, Emotion currentEmotion){
        super(name);
        this.currentEmotion = currentEmotion;
    }



    public void doStuff(String name, String ability, String target){
        System.out.println(getName() + ability + target);
    }

    public Emotion getCurrentEmotion() {
        return currentEmotion;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ShortPerson that)) return false;
        return currentEmotion.equals(that.currentEmotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentEmotion);
    }

    @Override
    public String toString() {
        return "people.ShortPerson{" +
                "currentEmotion=" + currentEmotion +
                '}';
    }
}
