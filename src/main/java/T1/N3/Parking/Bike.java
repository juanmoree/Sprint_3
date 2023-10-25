package T1.N3.Parking;

public class Bike implements Vehicle{
    public void start() {
        System.out.println("Bike started");
    }
    public void accelerate() {
        System.out.println("Bike accelerated");
    }
    public void brake() {
        System.out.println("Bike braked");
    }
    @Override
    public String toString() {
        return "Bike";
    }
}
