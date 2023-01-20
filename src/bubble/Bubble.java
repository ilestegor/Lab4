package bubble;

import exception.BubbleCreationException;
import interfaces.Coverable;
import interfaces.Pumpable;
import interfaces.Tightable;
import plant.PlantJuice;

public class Bubble implements Tightable, Coverable, Pumpable {
    private String name;
    private PlantJuice madeOf;
    private BubbleStat bubbleSize;
    private BubbleStat coverageArea;
    private int timeToPump;
    private boolean isTighten;
    public Bubble(String name, PlantJuice madeOf, BubbleStat bubbleSize, BubbleStat coverageArea, int timeToPump, boolean isTighten){
        this.name = name;
        this.madeOf = madeOf;
        this.bubbleSize = bubbleSize;
        this.coverageArea = coverageArea;
        this.timeToPump = timeToPump;
        this.isTighten = isTighten;
    }
    public void tight(){
        System.out.println("Шар перевязали веревкой");
    }


    public void cover(Side side) {
        switch(side){
            case TOP -> {
                System.out.println("Шар обмазывали сверху");
            }
            case BOTTOM -> {
                System.out.println("Шар обмазывали снизу");
            }
            case LEFT -> {
                System.out.println("Шар обмазывали слева");
            }
            case RIGHT -> {
                System.out.println("Шар обмазывали справа");
            }
        }
    }

    public void pop(Bubble bubble){
        if (bubble.bubbleSize == BubbleStat.BIG){
            System.out.println("Шар стал слишком большым и лопнул");
        }
    }

    public void setCoverageArea(Bubble bubble) {
        switch(bubbleSize){
            case BIG -> {
                this.coverageArea = BubbleStat.BIG;
            }
            case MEDIUM -> {
                this.coverageArea = BubbleStat.MEDIUM;
            }
            case SMALL -> {
                this.coverageArea = BubbleStat.SMALL;
            }
        }
    }


    public void becomeBigger(Bubble bubble){
        switch (bubbleSize){
            case SMALL -> {
                this.bubbleSize = BubbleStat.MEDIUM;
                System.out.println("Шар становится больше, размер шара = средний");
            }
            case MEDIUM -> {
                this.bubbleSize =  BubbleStat.BIG;
                System.out.println("Шар становится больше, размер шара = большой, размером с дом");
            }
            case BIG -> {
                bubble.pop(bubble);
            }
        }
    }
    public String pump() {
        return " начал накачивать пузырь";
    }
    public void validateBubbleCreation(Pump pump) throws BubbleCreationException{
        if (pump.validateWorkOfPump()){
            System.out.println("Насос работает и пзуырь начал надуваться");
        } else {
            throw new BubbleCreationException("Пузырь не надувается, так как насос не работает");
        }
    }

    public BubbleStat getBubbleSize() {
        return bubbleSize;
    }

    public int getTimeToPump() {
        System.out.println("Работа по надуванию шара длилась " + timeToPump + " дня");
        if (bubbleSize == BubbleStat.BIG){
            System.out.println("Работа прекратилась");
        }
        return timeToPump;
    }

    public String getName() {
        return name;
    }
}
