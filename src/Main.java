import car.Car;
import car.TankLevel;
import dream.Dream;
import emotion.*;
import event.*;
import food.Drink;
import person.*;
import place.*;
import plant.*;
import bubble.*;


public class Main {
    public static void main(String[] args) {
        Town town = new Town("Город", WeatherType.SUNNY);
        Emotion humanEmotion = new Emotion("");
        Emotion shortPersonEmotion = new Emotion("");
        Arbour arbour = new Arbour("Будка", false);

        ShortPerson syropchick = new ShortPerson("Сиропчик", shortPersonEmotion, Math.floor(Math.random() * 100), 20, Mood.SAD);
        syropchick.setCurrentEmotion(town);
        syropchick.doStuff(syropchick.getName(), " любил кататься ", "на машине и пить газировку");
        Drink sprklingWater = new Drink(" Газированная вода с сиропом");
        syropchick.drink(sprklingWater, 6, syropchick);

        Human neznaika = new Human("Незнайка", humanEmotion, false, false, true, false, false, Math.floor(Math.random() * 100), true);
        neznaika.setCurrentEmotion(town);
        neznaika.doTo(neznaika.getName(), " тоже любил", " кататься на машине");

        Human toropyjka = new Human("Торопыжка", humanEmotion, true, false, true, false, false, Math.floor(Math.random() * 100), true);
        toropyjka.transport(neznaika, " на машине", neznaika);

        neznaika.wish(" захотел научится управлять автомобилем");
        neznaika.ask(toropyjka, neznaika);
        Car car = new Car("Машина", arbour, false, TankLevel.HALF);
        Car.Lever lever = car.new Lever("Рычаг", true);
        Car.Pedal pedal = car.new Pedal("Педаль", true);
        Car.SteeringWheel steeringWheel = car. new SteeringWheel("Руль", true);
        lever.isPulled(neznaika);
        pedal.isPressed(neznaika);
        car.setInMotion(lever, pedal, neznaika);
        neznaika.tankLevel(car);


        ShortPerson shortPerson = new ShortPerson("Коротышки", shortPersonEmotion, Math.floor(Math.random() * 100), 2, Mood.AMAZING);
        shortPerson.drive(car, neznaika);
        Breakage breakage = new Breakage("Обрыв");
        ShortPerson gunka = new ShortPerson("Гунька", shortPersonEmotion, Math.floor(Math.random() * 100), 10, Mood.SAD);
        Human znaika = new Human("Знайка", humanEmotion, true, false, true, false, true, Math.floor(Math.random() * 100), true);
        Emotion babyEmotion = new Emotion("");
        Baby baby = new Baby("Малыши", babyEmotion, Mood.HAPPY);
        if (car.isInMotion()){
            shortPerson.see(" увидели, как машина пришла в движение", "");
            shortPerson.run(" выбежали из дома");


            car.destruct(arbour);
            neznaika.setInjured(arbour);
            neznaika.grab(steeringWheel);
            neznaika.shout(" стал кричать во все горло", car, shortPerson, neznaika);
            System.out.println(neznaika.getName() + "выехал со двора");
            car.roll(" подъехала к ", breakage);
            car.fall(breakage);
            neznaika.doTo(neznaika.getName(), " вывалился", " из машины");
            shortPerson.grab(neznaika, shortPerson, neznaika);
            if (neznaika.isAlive()){
                neznaika.setAtHome();
                neznaika.setEyesOpened(neznaika.isEyesOpened());
                Human doctor = new Human ("Доктор", humanEmotion, false, false, true, false, false, Math.floor(Math.random() * 100), true){
                    public Human check(Human human){
                        neznaika.check(neznaika);
                        return human;
                    }

                }.check(neznaika);
                neznaika.run(" вскочил и побежал к " + gunka.getName().substring(0, gunka.getName().length() - 1) + "е");
            }
        }
        znaika.doTo(znaika.getName(), " любил", " читать книги о путешествиях");
        Event znaikaStory = new Event(" истории Знайки");
        baby.doStuff(baby.getName(), " любили", znaikaStory.getEventName());
        Dream dream = new Dream("Малыши мечтали отправиться в путешествие", 0.0, false);
        baby.dream(dream);



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
        ShortPerson shpuntik = new ShortPerson("Шпунтик", shortPersonEmotion, Math.floor(Math.random() * 100), 4, Mood.AMAZING);
        Pump pump = new Pump("Насос", true, neznaika);
        Bubble bubble = new Bubble("Пузырь", plantJuice, BubbleStat.SMALL, BubbleStat.SMALL, 3, false);
        shpuntik.bring(pump, znaika);
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

            Human.Squad squad1 = new Human.Squad("Отряд 1", neznaika.getName());
            Human.Squad squad2 = new Human.Squad("Отряд 2", neznaika.getName());
            Fruit fruit = new Fruit("Шелкоивичные коконы", false);
            squad1.collect(fruit);
            if (fruit.isCollected()){
                System.out.println(fruit.getName() + " уже собран, нужно найти другое растение");
            } else {
                squad1.doTo(squad1.getName(), " делает нити из ", fruit.getName());
                squad2.doTo(squad2.getName(), " делает корзину из ", " коры дерева");

                Event allPeopleInTown = new Event("Жители города смотрели на шар");
                allPeopleInTown.getEventName();
                System.out.println(shortPerson.getName() + " и " + baby.getName() + " хотели потрогать или поднять " + bubble.getName());
                System.out.println(znaika.explain(znaika.getName(), " ничего не объяснил  Малышам"));
                shortPerson.ask(znaika, toropyjka);
            }
        }

    }

}