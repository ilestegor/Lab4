package plant;

import java.util.Objects;

import interfaces.Climbable;
import interfaces.Modifiable;
public class Plant implements Modifiable, Climbable {
    private String name;
    private PlantJuice plantJuice;

    public Plant(String name, PlantJuice plantJuice){
        this.name = name;
        this.plantJuice = plantJuice;
    }
    public void lookAlike(Plant plant, String object){
        System.out.println(plant.name + " похожи на" + object);;
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Plant plant)) return false;
        return name.equals(plant.name) && plantJuice.equals(plant.plantJuice);
    }

    public void climb() {
        System.out.println("Малыши взбираются на" + " " + name + " , чтобы обмазать шар");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, plantJuice);
    }

    @Override
    public String toString() {
        return "plant.Plant{" +
                "name='" + name + '\'' +
                ", plantJuice=" + plantJuice +
                '}';
    }

    public void modify() {
       plantJuice.flow();
       plantJuice.thicken();
       plantJuice.transformationIntoRubber();
    }
}
