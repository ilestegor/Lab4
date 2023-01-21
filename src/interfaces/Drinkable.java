package interfaces;
import food.*;
import person.ShortPerson;

public interface Drinkable {
    void drink(Drink drink, int amount, ShortPerson shortPerson);
}
