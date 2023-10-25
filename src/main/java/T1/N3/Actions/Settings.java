package T1.N3.Actions;

import T1.N3.Commands.*;
import T1.N3.Parking.*;

public class Settings {
    public static void settings(Actions actions){
        Vehicle bike = new Bike();
        Vehicle boat = new Boat();
        Vehicle car = new Car();
        Vehicle plane = new Plane();

        // Commands to define actions for each vehicle. Last one (Vehicle) is the one that will be executed.
        actions.setStart(new VehicleStart(bike));
        /*actions.setBrake(new VehicleBrake(bike));
        actions.setAccelerate(new VehicleAccelerate(bike));*/
        actions.setStart(new VehicleStart(boat));
        /*actions.setBrake(new VehicleBrake(boat));
        actions.setAccelerate(new VehicleAccelerate(boat));
        actions.setStart(new VehicleStart(car));*/
        actions.setBrake(new VehicleBrake(car));
        /*actions.setAccelerate(new VehicleAccelerate(car));
        actions.setStart(new VehicleStart(plane));
        actions.setBrake(new VehicleBrake(plane));*/
        actions.setAccelerate(new VehicleAccelerate(plane));
    }
}
