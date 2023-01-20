package person;

import car.Car;
import emotion.Emotion;
import exception.TankLevelException;
import interfaces.*;
import interfaces.Runnable;
import place.Arbour;

public class Neznaika extends Human implements Wishable, AbleToAsk, AbleToGrab, Transportable, Checkable, AbleToSee, Doable, Punchable, Grabable, Runnable, AbleToEncounter {
    private boolean isInCar;
    private boolean isInjured;
    private boolean eyesOpened;
    private boolean isAtHome;
    public Neznaika(String name, Emotion currentEmotion, boolean isInCar, boolean isInjured, boolean isAtHome, boolean eyesOpened){
        super(name, currentEmotion);
        this.isInCar = isInCar;
        this.isInjured = isInjured;
        this.isAtHome = isAtHome;
        this.eyesOpened = eyesOpened;
    }
    public String wish(String wish){
        System.out.println(name + wish);
        return wish;
    }
    public void ask(Askable askable){
        askable.ask(" попросил ");
        System.out.println(" " + name + " научить водить машину");
    }
    public void grab(Grabable grabable){
        grabable.grab();
    }

    public void setInCar(boolean inCar) {
        isInCar = inCar;
    }

    public String shout(String phrase){
        System.out.println(name + phrase);
        return phrase;
    }

    public void setEyesOpened(boolean isAtHome) {
        if (isAtHome){
            this.eyesOpened = true;
        } else {
            this.eyesOpened = false;
        }
    }

    public void tankLevel(Car car){
        try {
            car.validateTankLevel(car.getFuelInTank());
        } catch (TankLevelException tankLevelException){
            System.out.println(tankLevelException.getMessage());
        }
    }
    public void setInjured(Arbour arbour) {
        if (arbour.isDestructed){
            this.isInjured = true;
            System.out.println(name + " получил ранение от разрушенной беседки");
        }
    }
    public String transport(){
        return "часто катал " + name + "у";
    }
    public void check(){
        System.out.println("Доктор проверяет Незнайку");
    }
    public void checkIfPunched(ShortPerson shortPerson){
        if (isInjured) shortPerson.run(" убежали");
    }
    public String see(String direction, String mood){
        System.out.println(direction + mood);
        return direction + mood;
    }

    public String punch() {
        return name;
    }

    public void grab() {
        System.out.println(" понесли в дом " + name.substring(0, name.length() - 1) + "y");
    }

    public void run(String direction) {
        System.out.println(name + direction);
    }
    public void encounter(Encounterable encounterable){
        System.out.println(name + " встретил " + encounterable.encounter());
    }

    public boolean isEyesOpened() {
        return eyesOpened;
    }

    public void setAtHome() {
        if (isInjured) this.isAtHome = true;
    }
}
