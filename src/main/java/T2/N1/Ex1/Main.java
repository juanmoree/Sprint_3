package T2.N1.Ex1;

public class Main {
    public static void main(String[] args) {

        Agent agent = new Agent();
        agent.addObserver(new WallSt());
        agent.addObserver(new Nasdaq());
        agent.notifyObservers();
    }
}
