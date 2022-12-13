package people;

public abstract class SmallPerson {
    private String name;
    private String ability;

    public SmallPerson(String name){
        this.name = name;
    }

    public abstract void doStuff(String name, String ability, String target);

    public String getName(){
        return name;
    }

    public String getAbility(){
        return ability;
    }
}
