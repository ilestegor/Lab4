package person;

import bubble.Bubble;
import bubble.Pump;
import emotion.Emotion;
import exception.BubbleCreationException;
import interfaces.AbleToBring;
import interfaces.AbleToPump;
import interfaces.Bringable;
import interfaces.Pumpable;

public class Shpuntik extends Human implements AbleToPump, AbleToBring {
    public Shpuntik(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }


    public void bring(Bringable bringable) {
        System.out.println(name + bringable.bring());
    }

    public void workOfPump(Bubble bubble, Pump pump){
        try {
            bubble.validateBubbleCreation(pump);
        } catch (BubbleCreationException bubbleCreationException){
            System.err.println(bubbleCreationException.getMessage());

        }
    }

    public void pump(Pumpable pumpable) {
        System.out.println(name + pumpable.pump());
    }
}
