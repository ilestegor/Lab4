package plants;

import java.util.Objects;

public class PlantJuice {
    private String color;
    private Density levelOfDensity;

    public PlantJuice(String color, Density levelOfDensity){
        this.color = color;
        this.levelOfDensity = levelOfDensity;

    }
    public String flow(PlantJuice plantJuice){
        if (Density.LOW == levelOfDensity){
            return  "Сок вытикает медленно";
        } else if (Density.MEDIUM == levelOfDensity){
            return "Сок вытекает умеренно";
        } else {
            return "Сок вытекает медленно";
        }
    }
    public String thicken(PlantJuice plantJuice){
        return "Сок густеет";
    }
    public String transformationIntoRubber(PlantJuice plantJuice){
        return "Сок превращается в резину";
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
        return "PlantJuice{" +
                "color='" + color + '\'' +
                ", levelOfDensity=" + levelOfDensity +
                '}';
    }
}
