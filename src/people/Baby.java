package people;

import java.util.Objects;

public class Baby extends SmallPerson{
    private String currentEmotion;
    public Baby(String name, String ability, String currentEmotion){
        super(name, ability);
        this.currentEmotion = currentEmotion;
    }
    public String doStuff(String name, String ability, String currentEmotion){
        return name + ability + currentEmotion;
    }

    public String getCurrentEmotion() {
        return currentEmotion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Baby baby = (Baby) object;
        return currentEmotion.equals(baby.currentEmotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentEmotion);
    }

    @Override
    public String toString() {
        return "Baby." +
                "currentEmotion=" + currentEmotion;
    }
}
