package T2.N1;

public class Agency implements Observer {

    String name;
    public Agency(String name) {
        this.name = name;
    }
    @Override
    public void marketDown() {
        System.out.println(name + " market down notified");
    }

    @Override
    public void marketUp() {
        System.out.println(name + " market up notified");
    }
}
