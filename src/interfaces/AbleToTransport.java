package interfaces;

import person.Human;
import person.ShortPerson;

public interface AbleToTransport {
    void transport(Transportable transportable, String methodOfTransportation, Human human);
}
