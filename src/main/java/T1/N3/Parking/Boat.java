package T1.N3.Parking;

public class Boat implements Vehicle{
    public void start() {
        System.out.println("Boat started");
    }
    public void accelerate() {
        System.out.println("Boat accelerated");
    }
    public void brake() {
        System.out.println("Boat braked");
    }
    @Override
    public String toString() {
        return "Boat";
    }
}
