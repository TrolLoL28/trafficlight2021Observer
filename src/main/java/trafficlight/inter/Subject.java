package trafficlight.inter;
import trafficlight.states.State;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> list = new ArrayList<>();

    public void addObserver(Observer observer) {
        list.add(observer);
    }

    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    public void notifyObservers(State state) {
        for (Observer observer: list) {
            observer.update(state);
        }
    }
}
