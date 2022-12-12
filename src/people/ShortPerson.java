package people;
import java.util.Objects;

public class ShortPerson extends SmallPerson{
    private Emotion currentEmotion;
    public ShortPerson(String name, String ability){
        super(name, ability);
    }



    public String doStuff(String name, String ability, String target){
        return name + ability + target;
    }

    public Emotion getCurrentEmotion() {
        return currentEmotion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ShortPerson that)) return false;
        return currentEmotion.equals(that.currentEmotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentEmotion);
    }

    @Override
    public String toString() {
        return "ShortPerson{" +
                "currentEmotion=" + currentEmotion +
                '}';
    }
}
