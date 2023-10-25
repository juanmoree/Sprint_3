package T1.N3.Parking;

public class Car implements Vehicle{
    public void start() {
        System.out.println("Car started");
    }
    public void accelerate() {
        System.out.println("Car accelerated");
    }
    public void brake() {
        System.out.println("Car braked");
    }
    @Override
    public String toString() {
        return "Car";
    }
}
