import car.Car;
import car.TankLevel;
import emotion.*;
import event.*;
import person.*;
import place.*;
import plant.*;
import bubble.*;


public class Main {
    public static void main(String[] args) {
        Town town = new Town("Город", WeatherType.SUNNY);
        Emotion humanEmotion = new Emotion("");

        Syropchick syropchick = new Syropchick("Сиропчик", humanEmotion);
        syropchick.doTo(syropchick.getName(), " любил кататься ", "на машине и пить газировку");

        Neznaika neznaika = new Neznaika("Незнайка", humanEmotion, false, false, false, true);
        neznaika.doTo(neznaika.getName(), " тоже любил ", "кататься на машине");

        Toropyjka toropyjka = new Toropyjka("Торопыжка", humanEmotion);
        toropyjka.transport(neznaika," на машине");

        neznaika.wish(" захотел научится управлять автомобилем");
        neznaika.ask(toropyjka);
        Car car = new Car("Машина", "двор", false, TankLevel.HALF);
        Car.Lever lever = car.new Lever("Рычаг", true);
        Car.Pedal pedal = car.new Pedal("Педаль", true);
        Car.SteeringWheel steeringWheel = car. new SteeringWheel("Руль", true);
        lever.isPulled(neznaika);
        pedal.isPressed(neznaika);
        car.setInMotion(lever, pedal, neznaika);
        neznaika.tankLevel(car);

        Emotion shortPersonEmotion = new Emotion("");
        ShortPerson shortPerson = new ShortPerson("Коротышки", shortPersonEmotion);
        Breakage breakage = new Breakage("Обрыв");
        Gunka gunka = new Gunka("Гунька", humanEmotion);
        Znaika znaika = new Znaika("Знайка", humanEmotion, true);
        Emotion babyEmotion = new Emotion("");
        Baby baby = new Baby("Малыши", babyEmotion);
        if (car.isInMotion()){
            shortPerson.see(" увидели, как машина пришла в движение", "");
            shortPerson.run(" выбежали из дома");

            Arbour arbour = new Arbour("Будка", false);
            car.destruct(arbour);
            neznaika.setInjured(arbour);
            neznaika.grab(steeringWheel);
            neznaika.shout(" стал кричать во все горло");
            System.out.println(neznaika.getName() + "выехал со двора");
            shortPerson.run(" бежали за " + neznaika.getName().substring(0, neznaika.getName().length() - 1) + "ой");
            car.roll(" подъехала к ", breakage.getName() + "у");
            car.fall(breakage);
            neznaika.doTo(neznaika.getName(), " вывалился", " из машины");
            shortPerson.grab(neznaika);
            neznaika.setAtHome();
            neznaika.setEyesOpened(neznaika.isEyesOpened());
            Human doctor = new Human ("Доктор", humanEmotion){
                         public person.Human check(Neznaika neznaika){
                            neznaika.check();
                             return null;
                         }

            }.check(neznaika);
            neznaika.run(" вскочил и побежал к " + gunka.getName().substring(0, gunka.getName().length() - 1) + "е");
        }
        znaika.doTo(znaika.getName(), " любил", " читать книги о путешествиях");
        Event znaikaStory = new Event(" истории Знайки");
        baby.doStuff(baby.getName(), " любили", znaikaStory.getEventName());
        baby.wish(" мечтали отправится в путешествие");




        Event event1 = new Event("Затея");
        event1.resultEvent(" всем понравилась");
        shortPerson.setCurrentEmotion(town);
        shortPerson.doStuff(shortPerson.getName(), " не летали", " на воздушном шаре");


        baby.setCurrentEmotion(town);
        baby.getCurrentEmotion();
        baby.doStuff(baby.getName(), " интерсовались", " полётом на воздущном шаре");

        Event event2 = new Event("Как делать воздушный шар");
        event2.resultEvent(" не знали");



        znaika.setCurrentEmotion(town);
        System.out.println(znaika.say(znaika.getName(), " сказал") + " что" + znaika.think(" он", " обдумает", "") + " и " + znaika.explain("он", " объяснит"));
        System.out.println(znaika.think(znaika.getName(), " думал", " три дня и три ночи"));
        System.out.println(znaika.think(znaika.getName(), " придумал", "") + " " + event2.getEventName());
        shortPerson.doStuff(shortPerson.getName(), " умели ", "добывать резину");

        PlantJuice plantJuice = new PlantJuice("Белый", Density.LOW);
        Plant plant = new Plant("Цветы", plantJuice);
        System.out.println(plant.getName() + " росли в " + town.getName() + "e");
        plant.lookAlike(plant, "фикусы");
        znaika.modifyStuff(plant);

        Event neznaikaCollectJuice = new Event("Незнайка тоже собирал резиновый сок");
        System.out.println(neznaikaCollectJuice.getEventName());

        neznaika.encounter(gunka);
        gunka.play(baby, " в прыгалки");
        shortPerson.see("Мушка и Кнопочка",  " поглядывали на Незнайку", " с опаской");
        gunka.punch(neznaika);
        neznaika.checkIfPunched(shortPerson);
        Shpuntik shpuntik = new Shpuntik("Шпунтик", humanEmotion);
        Pump pump = new Pump("Насос", true);
        Bubble bubble = new Bubble("Пузырь", plantJuice, BubbleStat.SMALL, BubbleStat.SMALL, 3, false);
        shpuntik.bring(pump);
        pump.attachTo();
        shpuntik.workOfPump(bubble, pump);
        PlantJuice wlanutJuice = new PlantJuice("light brown", Density.MEDIUM);
        Plant walnutBush = new Plant("Ореховый куст", wlanutJuice);
        if (pump.isInWork()){
            shpuntik.pump(bubble);
            bubble.setCoverageArea(bubble);
            znaika.cover(bubble);
            baby.cover(bubble);
            bubble.becomeBigger(bubble);
            bubble.becomeBigger(bubble);
            baby.climb(walnutBush, bubble);
            bubble.getTimeToPump();
            znaika.tightStuff(bubble);

            Znaika.Squad squad1 = new Znaika.Squad("Отряд 1", neznaika.getName());
            Znaika.Squad squad2 = new Znaika.Squad("Отряд 2", neznaika.getName());
            Fruit fruit = new Fruit("Шелкоивичные коконы");
            squad1.collect(fruit);
            squad1.doTo(squad1.getName(), " делает нити из ", fruit.getName());
            squad2.doTo(squad2.getName(), " делает корзину из ", " коры дерева");

            Event allPeopleInTown = new Event("Жители города смотрели на шар");
            allPeopleInTown.getEventName();
            System.out.println(shortPerson.getName() + " и " + baby.getName() + " хотели потрогать или поднять " + bubble.getName());
            System.out.println(znaika.explain(znaika.getName(), " ничего не объяснил  Малышам"));
            shortPerson.ask(znaika);
        }

    }
}