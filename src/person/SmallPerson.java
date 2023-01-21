package person;
import emotion.*;
import place.Town;
import food.*;
public abstract class SmallPerson {
    protected String name;
    protected Emotion currentEmotion;
    protected Mood currentMood;
    protected SmallPerson(String name, Emotion currentEmotion, Mood currentMood){
        this.name = name;
        this.currentEmotion = currentEmotion;
        this.currentMood = currentMood;
    }

    public void setCurrentEmotion(Town town) {
        switch (town.getWeatherType()){
            case SUNNY -> {
                currentEmotion.setTypeOfEmotion(" Веселое");
            }
            case FOGGY -> {
                currentEmotion.setTypeOfEmotion(" Грустное");
            }
            case RAINY -> {
                currentEmotion.setTypeOfEmotion(" Загадочное:)");
            }
            case SNOWY -> {
                currentEmotion.setTypeOfEmotion(" Зимнее");
            }
            case WINDY -> {
                currentEmotion.setTypeOfEmotion(" Ужасное");
            }
        }
    }
    public void setCurrentEmotion(Drink drink, ShortPerson shortPerson){
       if (shortPerson.getAmountOfDrank() > 5){
           currentMood = Mood.AMAZING;
       }

    }
    public abstract void doStuff(String name, String ability, String target);

    public String getName(){
        return name;
    }

    public Emotion getCurrentEmotion() {
        System.out.println(currentEmotion);
        return currentEmotion;
    }


}
