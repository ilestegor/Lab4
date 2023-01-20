package person;

import emotion.Emotion;
import interfaces.AbleToTransport;
import interfaces.Askable;
import interfaces.Transportable;

public class Toropyjka extends Human implements AbleToTransport, Askable {

    public Toropyjka(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }


    public void transport(Transportable transportable, String methodOfTransportation) {
        System.out.println(name + " " +transportable.transport()  + methodOfTransportation);
    }


    public void ask(String question) {
        this.name = this.name.substring(0, name.length() - 1);
        this.name = this.name + "у";
        System.out.printf(name + question);
    }
}
