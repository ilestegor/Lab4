package place;

import interfaces.Fallable;

public class Breakage extends Place implements Fallable {
    public Breakage(String name){
        super(name);
    }
    public void fall() {
        System.out.println(" упала с обрыва");
    }

}
