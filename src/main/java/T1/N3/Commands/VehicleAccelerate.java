package T1.N3.Commands;

import T1.N3.Parking.Vehicle;

public class VehicleAccelerate implements Command{
    Vehicle vehicle;
    public VehicleAccelerate(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        System.out.println(vehicle + " Accelerated");
    }
}
