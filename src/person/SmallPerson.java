package person;
import emotion.Emotion;
import place.Town;

public abstract class SmallPerson {
    private String name;
    protected Emotion currentEmotion;

    protected SmallPerson(String name, Emotion currentEmotion){
        this.name = name;
        this.currentEmotion = currentEmotion;
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
    public abstract void doStuff(String name, String ability, String target);

    public String getName(){
        return name;
    }

    public Emotion getCurrentEmotion() {
        System.out.println(currentEmotion);
        return currentEmotion;
    }


}
