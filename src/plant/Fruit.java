package plant;

import interfaces.Collectable;

public class Fruit implements Collectable {
    private String name;
    public Fruit(String name){
        this.name = name;
    }

    public String collect() {
        return name;
    }

    public String getName() {
        return name;
    }
}
