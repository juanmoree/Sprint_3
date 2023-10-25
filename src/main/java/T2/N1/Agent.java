package T2.N1;

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

    public void notifyMarketDown() {
        for (Observer observer : agencies) {
            observer.marketDown();
        }
    }
    public void notifyMarketUp() {
        for (Observer observer : agencies) {
            observer.marketUp();
        }
    }
}
