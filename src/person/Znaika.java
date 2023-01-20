package person;

import bubble.Side;
import emotion.Emotion;
import interfaces.*;

public class Znaika extends Human implements Explainable, Sayable, Thinkable, AbleToModify, Doable,  AbleToCover, AbleToTight, AbleToAsk, Askable {
    protected boolean modifiedPlant;
    public Znaika(String name, Emotion currentEmotion, boolean modifiedPlant) {
        super(name, currentEmotion);
        this.modifiedPlant = modifiedPlant;
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
    public void ask(Askable askable){
        System.out.println("True");
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

        @Override
        public void collect(Collectable collectable) {
            System.out.println(bossName + " сказал " + name +  " собирать " + collectable.collect());
        }

        public String doTo(String name, String action, String target) {
            System.out.println(name + action + target);
            return null;
        }
    }


    public void ask(String question) {
        System.out.println(question);
    }
}
