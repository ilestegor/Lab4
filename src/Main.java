import event.*;
import people.*;
import places.*;
import places.*;
import plants.*;


public class Main {
    public static void main(String[] args) {
        Event event1 = new Event("Затея");
        System.out.println(event1.getEventName() + event1.resultEvent(" всем ", " понравилась"));

        ShortPerson shortPerson = new ShortPerson("Коротышки", " никогда не летали ");
        System.out.println(shortPerson.doStuff(shortPerson.getName(), shortPerson.getAbility(), "на воздушном шаре"));

        Baby baby = new Baby("Малышам", " было", " интересно");
        System.out.println(baby.doStuff(baby.getName(),baby.getAbility(), baby.getCurrentEmotion()));

        Event event2 = new Event("Как делать воздушный шар");
        System.out.println(event2.getEventName() + event2.resultEvent(" никто", " не знал"));

        Place place = new Place("Город", WeatherType.SUNNY);
        Emotion currentEmotion = new Emotion(place.changeEmotion(WeatherType.SUNNY));
        Human human = new Human("Знайка", currentEmotion.getTypeOfEmotion());
        System.out.println(human.say(human.getName(), " сказал") + " что " + human.think("он", " обдумает", "") + " и " + human.explain("он", " объяснит"));
        System.out.println(human.think(human.getName(), " стал думать", ""));
        System.out.println(human.think(human.getName(), " думал", " три дня и три ночи"));
        System.out.println(human.think(human.getName(), " придумал", "") + " " + event2.getEventName());
        System.out.println(shortPerson.doStuff(shortPerson.getName(), " умели ", "добывать резину"));

        PlantJuice plantJuice = new PlantJuice("Белый", Density.MEDIUM);
        Plant plant = new Plant("Цветы", plantJuice);
        System.out.println(plant.getName() + " росли в " + place.getName() + "e");
        System.out.println(plant.lookAlike(plant, "фикусы"));
        System.out.println("hello");
    }
}