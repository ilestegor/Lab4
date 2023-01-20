package plant;

import java.util.Objects;

public class PlantJuice {
    private String color;
    private Density levelOfDensity;

    public PlantJuice(String color, Density levelOfDensity){
        this.color = color;
        this.levelOfDensity = levelOfDensity;

    }
    public void flow(){
        switch (levelOfDensity){
            case LOW -> {
                System.out.println("Человек порезал растение и сок вытикает быстро");
            }
            case MEDIUM -> {
                System.out.println("Человек порезал растение и сок вытекает умеренно");
            }
            case HIGH -> {
                System.out.println("Человек порезал растение и сок вытекает медленно");
            }
        }
    }
    public void thicken(){
        System.out.println("Сок постепенно густеет");
    }
    public void transformationIntoRubber(){
        System.out.println("Сок превращается в резину, из которой можно делать мячи и колоши");
    }



    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PlantJuice that)) return false;
        return Objects.equals(color, that.color) && levelOfDensity == that.levelOfDensity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, levelOfDensity);
    }

    @Override
    public String toString() {
        return "plant.PlantJuice{" +
                "color='" + color + '\'' +
                ", levelOfDensity=" + levelOfDensity +
                '}';
    }
}
