package T1.N3.Parking;

public class Plane implements Vehicle{
    public void start() {
        System.out.println("Plane started");
    }
    public void accelerate() {
        System.out.println("Plane accelerated");
    }
    public void brake() {
        System.out.println("Plane braked");
    }
    @Override
    public String toString() {
        return "Plane";
    }
}
