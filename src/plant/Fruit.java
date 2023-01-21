package plant;

import interfaces.Collectable;

public class Fruit implements Collectable {
    private String name;
    private boolean isCollected;
    public Fruit(String name, boolean isCollected){
        this.name = name;
        this.isCollected = isCollected;
    }

    public String collect() {
        if (Math.floor(Math.random() * 100) > 40.0){
            this.isCollected = true;
        }
        return name;
    }

    public String getName() {
        return name;
    }

    public boolean isCollected() {
        return isCollected;
    }
}
