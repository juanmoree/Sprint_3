package T1.N3.Commands;

import T1.N3.Parking.Vehicle;

public class VehicleBrake implements Command{
    Vehicle vehicle;

    public VehicleBrake(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        System.out.println(vehicle + " Braked");
    }
}
