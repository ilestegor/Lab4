package plants;

import interfaces.Modifiable;

import java.util.Objects;

public class Plant implements Modifiable {
    private String name;
    private PlantJuice plantJuice;

    public Plant(String name, PlantJuice plantJuice){
        this.name = name;
        this.plantJuice = plantJuice;
    }
    public String lookAlike(Plant plant, String object){
        return plant.name + " похожи на "+ object;
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

    @Override
    public int hashCode() {
        return Objects.hash(name, plantJuice);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", plantJuice=" + plantJuice +
                '}';
    }

    public String modify() {
       return "Plant was modified";
    }
}
