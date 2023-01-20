package place;
import interfaces.Destructable;

public class Arbour extends Place implements Destructable {
    public boolean isDestructed;
    public Arbour(String name, boolean isDestructed){
        super(name);
        this.isDestructed = isDestructed;
    }


    public void destruct(){
        System.out.println("Беседка рассыпалась на кусочки");
        this.isDestructed = true;
    }
}
