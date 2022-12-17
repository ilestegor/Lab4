package emotion;
import java.util.Objects;

public class Emotion {
    private String typeOfEmotion;
    public Emotion(String typeOfEmotion){
       this.typeOfEmotion = typeOfEmotion;
    }

    public void setTypeOfEmotion(String typeOfEmotion) {
        this.typeOfEmotion = typeOfEmotion;
    }

    public String getTypeOfEmotion(){
        System.out.println(typeOfEmotion);
        return typeOfEmotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Emotion emotion)) return false;
        return Objects.equals(getTypeOfEmotion(), emotion.getTypeOfEmotion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeOfEmotion());
    }

    @Override
    public String toString() {
        return " настроение" +  typeOfEmotion;
    }
}
