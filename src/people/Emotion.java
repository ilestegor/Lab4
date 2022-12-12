package people;

public class Emotion {
    private String typeOfEmotion;
    public Emotion(String typeOfEmotion){
       this.typeOfEmotion = typeOfEmotion;
    }

    public String getTypeOfEmotion(){
        return typeOfEmotion;
    }

    public void setTypeOfEmotion(String typeOfEmotion) {
        this.typeOfEmotion = typeOfEmotion;
    }
}
