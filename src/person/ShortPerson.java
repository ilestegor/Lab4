package person;
import emotion.*;
import interfaces.*;
import interfaces.Runnable;


public class ShortPerson extends SmallPerson implements Runnable, Hearable, AbleToSee, AbleToAsk, Doable, AbleToGrab {

    public ShortPerson(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }
    public void doStuff(String name, String ability, String target){
        System.out.println(getName() + ability + target);
    }

    public void run(String direction) {
        System.out.println(getName() + direction);
    }
    public String hear(String sound){
        System.out.println(sound);
        return sound;
    }
    public String see(String direction, String mood){
        System.out.println(getName() + direction + mood);
        return direction + mood;
    }
    public String see(String name, String action, String mood){
        System.out.println(name + action + mood);
        return action;
    }
    public void ask(Askable askable) {
        askable.ask("Малыши начали сомневаться");
    }

    public String doTo(String name, String action, String target) {
        System.out.println(name + action + target);
        return "Nothing";
    }

    @Override
    public void grab(Grabable grabable) {
        System.out.printf(getName());
        grabable.grab();
    }

    @Override
    public String toString() {
        return "ShortPerson{}";
    }


}
