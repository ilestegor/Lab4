package person;

import emotion.Emotion;
import interfaces.*;

public class Gunka extends Human implements AbleToPlay, Wishable, AbleToPunch, Encounterable {
    public Gunka(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }

    public void play(Playable playable, String nameOfGame) {
        System.out.println(name + " играл с " + playable.play() + nameOfGame);
    }

    public String wish(String wish) {
        System.out.println(wish);
        return wish;
    }


    public void punch(Punchable punchable) {
        System.out.println(name + " ударил " + punchable.punch().substring(0, punchable.punch().length() - 1) + "y" + " в лоб");
    }
    public String encounter(){
        return name.substring(0, name.length() - 1) + "y";
    }

}
