package person;
import bubble.Side;
import car.Car;
import emotion.*;
import exception.TankLevelException;
import interfaces.*;
import interfaces.Runnable;
import place.Arbour;
import place.Town;

import java.util.Objects;

public class Human implements Wishable, AbleToGrab, Transportable, Checkable, AbleToSee, Punchable, Grabable, Runnable, AbleToEncounter, Explainable, Sayable, Thinkable, AbleToModify, Doable,  AbleToCover, AbleToTight, AbleToAsk, Askable, AbleToTransport {
    protected String name;
    protected Emotion currentEmotion;
    private boolean isInCar;
    private boolean isInjured;
    private boolean eyesOpened;
    private boolean isAtHome;
    private boolean modifiedPlant;
    private double weightOfHuman;
    private boolean isAlive;

    public Human(String name, Emotion currentEmotion, boolean isInCar, boolean isInjured, boolean eyesOpened, boolean isAtHome, boolean modifiedPlant, double weightOfHuman, boolean isAlive){
        this.name = name;
        this.currentEmotion = currentEmotion;
        this.isInCar = isInCar;
        this.isInjured = isInjured;
        this.eyesOpened = eyesOpened;
        this.isAtHome = isAtHome;
        this.modifiedPlant = modifiedPlant;
        this.weightOfHuman = weightOfHuman;
        this.isAlive = isAlive;
    }
    public void setCurrentEmotion(Town town) {
        switch (town.getWeatherType()){
            case SUNNY -> {
                currentEmotion.setTypeOfEmotion("Веселое");
            }
            case FOGGY -> {
                currentEmotion.setTypeOfEmotion(" Згадочное:)");
            }
            case RAINY -> {
                currentEmotion.setTypeOfEmotion("Мрачное");
            }
            case SNOWY -> {
                currentEmotion.setTypeOfEmotion("Зимнее");
            }
            case WINDY -> {
                currentEmotion.setTypeOfEmotion("Ужасное");
            }

        }
    }

    public  String getName() {
        return name;
    }
    public String doTo(String name, String action, String target) {
        System.out.println(name + action + target);
        return name + action + target;
    }


    public String wish(String wish){
        System.out.println(name + wish);
        return wish;
    }
    public void grab(Grabable grabable, ShortPerson shortPerson, Human human){
        grabable.grab();
    }
    public void grab(Grabable grabable){
        grabable.grab();
    }
    public void setInCar(boolean inCar) {
        isInCar = inCar;
    }

    public String shout(String phrase, Car car, ShortPerson shortPerson, Human human){
        if (car.isInMotion()){
            System.out.println(name + phrase);
            shortPerson.run(" бежали за " + human.getName().substring(0, human.getName().length() - 1) + "ой");
        }
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
            car.validateTankLevel();
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
    public String transport(Human human){
        this.isInCar = true;
        return "часто катал " + name + "у";
    }

    public void transport(Transportable transportable, String methodOfTransportation, Human human) {
        System.out.println(getName() + " " + transportable.transport(human)+ methodOfTransportation);
        human.isAtHome = true;
    }

    public Human check(Human human){
        System.out.println(human.getName() + " проверяет Незнайку");
        return human;
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





    public String explain(String name, String action) {
        return name + action;
    }

    public String say(String name, String action) {
        return name + action;
    }

    public String think(String name, String action, String durationOfThinking) {
        return name + action + durationOfThinking;
    }

    public void cover(Coverable coverable){
        System.out.printf(name + " ");
        coverable.cover(Side.TOP);
    }

    public void modifyStuff(Modifiable modifiable) {
        if (modifiedPlant) {
            modifiable.modify();
        }
    }
    public void ask(Askable askable, Human human){
        askable.ask(" Поступил вопрос от ", human.getName());
    }

    public void tightStuff(Tightable tightable){
        tightable.tight();
    }

    public static class Squad implements AbleToCollect, Doable{
        private String name;
        private String bossName;
        public Squad(String name, String bossName){
            this.name = name;
            this.bossName = bossName;
        }

        public String getName() {
            return name;
        }


        public void collect(Collectable collectable) {
            System.out.println(bossName + " сказал " + name +  " собирать " + collectable.collect());

        }

        public String doTo(String name, String action, String target) {
            System.out.println(name + action + target);
            return null;
        }
    }


    public void ask(String question, String name) {
        System.out.println(question);
    }


    public double getWeightOfHuman() {
        return weightOfHuman;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isAlive() {
        return isAlive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;
        return Objects.equals(getName(), human.getName()) && Objects.equals(currentEmotion, human.currentEmotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, currentEmotion);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", currentEmotion=" + currentEmotion +
                ", modifiedPlant=" +
                '}';
    }
}
