package person;
import java.util.Objects;

import bubble.Bubble;
import bubble.BubbleStat;
import bubble.Side;
import emotion.*;
import interfaces.*;

public class Baby extends SmallPerson implements Playable, AbleToClimb, AbleToCover, Dreamable, Wishable {

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
    public Emotion getCurrentEmotion() {
        System.out.println("У малышей" + currentEmotion);
        return currentEmotion;
    }
    public String play(){
        return getName();
    }

    public void climb(Climbable climbable, Bubble bubble) {
        if (bubble.getBubbleSize() == BubbleStat.BIG){
            climbable.climb();
        }
    }

    public void cover(Coverable coverable){
        System.out.printf(getName() + " ");
        coverable.cover(Side.BOTTOM);
    }
    public String dream(String object){
        System.out.println(object);
        return object;
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

    public String wish(String wish) {
        System.out.println(getName() + wish);
        return wish;

    }

}
