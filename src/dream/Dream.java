package dream;

public class Dream {
    private String dreamDescription;
    private double dreamProbability;
    private boolean willHappen;

    public Dream(String dreamDescription, double dreamProbability, boolean willHappen){
        this.dreamDescription = dreamDescription;
        this.dreamProbability = dreamProbability;
        this.willHappen = willHappen;
    }

    public double setDreamProbability() {
        this.dreamProbability = Math.floor(Math.random() * 100);
        return dreamProbability;
    }

    public String getDreamDescription() {
        return dreamDescription;
    }

    public void setWillHappen(boolean willHappen) {
        this.willHappen = willHappen;
    }
}
