package event;

import java.util.Objects;

public class Event {
    private String eventName;
    private String emotion;

    public Event(String name){
        this.eventName = name;
    }
    public void resultEvent(String emotion){
        System.out.println(getEventName() + emotion);
    }

    public String getEmotion() {
        return emotion;
    }

    public String getEventName() {
        return eventName;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Event event)) return false;
        return Objects.equals(getEventName(), event.getEventName()) && Objects.equals(getEmotion(), event.getEmotion());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventName(), getEmotion());
    }

    @Override
    public String toString() {
        return "event.Event{" +
                "eventName='" + eventName + '\'' +
                ", emotion='" + emotion + '\'' +
                '}';
    }
}
