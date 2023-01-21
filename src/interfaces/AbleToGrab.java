package interfaces;

import person.Human;
import person.ShortPerson;

public interface AbleToGrab {
    void grab(Grabable grabable, ShortPerson shortPerson, Human human);
}
