package person;

import emotion.Emotion;
import interfaces.AbleToDrive;
import interfaces.Doable;
import interfaces.Drinkable;
import interfaces.Driveable;

public class Syropchick extends Human implements Doable, AbleToDrive, Drinkable {
    public Syropchick(String name, Emotion currentEmotion){
        super(name, currentEmotion);
    }


    public void drive(Driveable driveable) {
        System.out.println("true");
    }


    public void drink(String object, String amount) {
        System.out.println(getName() + object + amount);
    }
}
