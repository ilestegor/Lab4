package people;

public abstract class SmallPerson {
    private String name;
    private String ability;

    public SmallPerson(String name, String ability){
        this.name = name;
        this.ability = ability;
    }

    public abstract String doStuff(String name, String ability, String target);

    public String getName(){
        return name;
    }

    public String getAbility(){
        return ability;
    }
}
