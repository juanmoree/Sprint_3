package T2.N1.Ex1;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyMarketDown();
    void notifyMarketUp();
}
