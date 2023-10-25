package T2.N1;

public class Main {
    public static void main(String[] args) {

        Agent agent = new Agent();
        Agency wallSt = new Agency("WallSt");
        Agency nasdaq = new Agency("Nasdaq");
        Agency agency = new Agency("Agency");
        agent.addObserver(wallSt);
        agent.addObserver(nasdaq);
        agent.notifyMarketDown();
        System.out.println("***** Agencies notified *****");
        agent.addObserver(agency);
        agent.notifyMarketUp();
        System.out.println("***** Agencies notified *****");
        agent.removeObserver(wallSt);
        agent.notifyMarketDown();
    }
}
