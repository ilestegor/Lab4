import emotion.*;
import event.*;
import person.*;
import place.*;
import plant.*;


public class Main {
    public static void main(String[] args) {
        Place place = new Place("Город", WeatherType.SUNNY);

        Event event1 = new Event("Затея");
        event1.resultEvent(" всем понравилась");

        Emotion shortPersonEmotion = new Emotion("");
        ShortPerson shortPerson = new ShortPerson("Коротышки", shortPersonEmotion);
        shortPerson.setCurrentEmotion(place);
        shortPerson.doStuff(shortPerson.getName(), " не летали", " на воздушном шаре");

        Emotion babyEmotion = new Emotion("");
        Baby baby = new Baby("Малыши", babyEmotion);
        baby.setCurrentEmotion(place);
        baby.getCurrentEmotion();
        baby.doStuff(baby.getName(), " интерсовались", " полётом на воздущном шаре");

        Event event2 = new Event("Как делать воздушный шар");
        event2.resultEvent(" не знали");

        Emotion humanEmotion = new Emotion("");
        Human human = new Human("Знайка", humanEmotion, true);
        human.setCurrentEmotion(place);
        System.out.println(human.say(human.getName(), " сказал") + " что" + human.think(" он", " обдумает", "") + " и " + human.explain("он", " объяснит"));
        System.out.println(human.think(human.getName(), " думал", " три дня и три ночи"));
        System.out.println(human.think(human.getName(), " придумал", "") + " " + event2.getEventName());
        shortPerson.doStuff(shortPerson.getName(), " умели ", "добывать резину");

        PlantJuice plantJuice = new PlantJuice("Белый", Density.LOW);
        Plant plant = new Plant("Цветы", plantJuice);
        System.out.println(plant.getName() + " росли в " + place.getName() + "e");
        plant.lookAlike(plant, "фикусы");
        human.modifyStuff(plant);
    }
}