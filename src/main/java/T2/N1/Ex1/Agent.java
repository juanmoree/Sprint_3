package T2.N1.Ex1;

import java.util.HashSet;
import java.util.Set;

public class Agent implements Observable {
    Set<Observer> agencies = new HashSet<Observer>();

    public void addObserver(Observer observer) {
        agencies.add(observer);
    }

    public void removeObserver(Observer observer) {
        agencies.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : agencies) {
            observer.update();
        }
    }
}
