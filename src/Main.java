import emotion.Emotion;
import event.Event;
import people.Baby;
import people.Human;
import people.ShortPerson;
import places.Place;
import places.WeatherType;
import plant.Density;
import plant.Plant;
import plant.PlantJuice;

public class Main {
    public static void main(String[] args) {
        Emotion currentEmotion = new Emotion("");
        Place place = new Place("Город", WeatherType.FOGGY);
        currentEmotion.setTypeOfEmotion(place);

        Event event1 = new Event("Затея");
        event1.resultEvent(" всем понравилась");


        ShortPerson shortPerson = new ShortPerson("Коротышки", currentEmotion);
        shortPerson.doStuff(shortPerson.getName(), " не летали", " на воздушном шаре");


        Baby baby = new Baby("Малыши", currentEmotion);
        baby.doStuff(baby.getName(), " интерсовались", " полётом на воздущном шаре");

        Event event2 = new Event("Как делать воздушный шар");
        event2.resultEvent(" не знали");

        Human human = new Human("Знайка", currentEmotion, true);
        System.out.println(human.say(human.getName(), " сказал") + " что" + human.think(" он", " обдумает", "") + " и " + human.explain("он", " объяснит"));
        System.out.println(human.think(human.getName(), " думал", " три дня и три ночи"));
        System.out.println(human.think(human.getName(), " придумал", "") + " " + event2.getEventName());
        shortPerson.doStuff(shortPerson.getName(), " умели ", "добывать резину");

        PlantJuice plantJuice = new PlantJuice("Белый", Density.HIGH);
        Plant plant = new Plant("Цветы", plantJuice);
        System.out.println(plant.getName() + " росли в " + place.getName() + "e");
        plant.lookAlike(plant, "фикусы");
        human.modifyStuff(plant);
    }
}