package person;
import bubble.Bubble;
import bubble.Pump;
import emotion.*;
import exception.BubbleCreationException;
import interfaces.*;
import interfaces.Runnable;
import food.*;

public class ShortPerson extends SmallPerson implements Runnable, Hearable, AbleToSee, AbleToAsk, AbleToGrab, AbleToPlay, Wishable, AbleToPunch, Encounterable, AbleToPump, AbleToBring, Doable, AbleToDrive, Drinkable, AbleToTransport, Askable {
    private double weightOfShortPerson;
    private int amountOfDrank;
    public ShortPerson(String name, Emotion currentEmotion, double weightOfShortPerson, int amountOfDrank, Mood currentMood){
        super(name, currentEmotion, currentMood);
        this.weightOfShortPerson = weightOfShortPerson;
        this.amountOfDrank = amountOfDrank;
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
    public void ask(Askable askable, Human human) {
        askable.ask("Малыши начали сомневаться", human.getName());
    }

    public String doTo(String name, String action, String target) {
        System.out.println(name + action + target);
        return "Nothing";
    }


    public void play(Playable playable, String nameOfGame) {
        System.out.println(getName() + " играл с " + playable.play() + nameOfGame);
    }

    public String wish(String wish) {
        System.out.println(wish);
        return wish;
    }


    public void punch(Punchable punchable) {
        System.out.println(getName() + " ударил " + punchable.punch().substring(0, punchable.punch().length() - 1) + "y" + " в лоб");


    }
    public String encounter(){
        return getName().substring(0, getName().length() - 1) + "y";
    }



    public void bring(Bringable bringable, Human human) {
        System.out.println(getName() + bringable.bring(human));


    }

    public void workOfPump(Bubble bubble, Pump pump){
        try {
            bubble.validateBubbleCreation(pump);
        } catch (BubbleCreationException bubbleCreationException){
            System.err.println(bubbleCreationException.getMessage());

        }
    }

    public void pump(Pumpable pumpable) {
        System.out.println(getName() + pumpable.pump());
    }


    public void drive(Driveable driveable, Human human) {
        driveable.drive(human);
    }


    public void drink(Drink drink, int amount, ShortPerson shortPerson) {
        System.out.println(name + " пьет" + drink.getName());
        this.amountOfDrank = amount;
        if (amount > 5){
            shortPerson.setCurrentEmotion(drink, shortPerson);
        }
    }




    public void transport(Transportable transportable, String methodOfTransportation, Human human) {
        System.out.println(getName() + " " +transportable.transport(human)  + methodOfTransportation);
        human.setAtHome();
    }


    public void ask(String question, String name) {
        this.name = this.name.substring(0, this.name.length() - 1);
        this.name = this.name + "у";
        System.out.printf(this.name + question);
    }




    public void grab(Grabable grabable, ShortPerson shortPerson, Human human) {
        if (shortPerson.weightOfShortPerson > human.getWeightOfHuman()){
            System.out.printf(getName());
            grabable.grab();
            human.setAlive(true);
        } else {
            System.out.println(human.getName() + " не перевозим");
            human.setAlive(false);
            System.out.println(human.getName() + " не выжил");
        }

    }

    public int getAmountOfDrank() {
        return amountOfDrank;
    }

    @Override
    public String toString() {
        return "ShortPerson{}";
    }


}
