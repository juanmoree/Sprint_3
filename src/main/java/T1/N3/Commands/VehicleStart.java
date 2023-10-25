package T1.N3.Commands;

import T1.N3.Parking.Vehicle;

public class VehicleStart implements Command{
    Vehicle vehicle;
    public VehicleStart(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        System.out.println(vehicle + " Started");
    }
}
