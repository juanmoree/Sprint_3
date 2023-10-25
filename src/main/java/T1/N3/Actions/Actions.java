package T1.N3.Actions;

import T1.N3.Commands.Command;

public class Actions {
    private Command accelerate;
    private Command brake;
    private Command start;

    public void accelerate(){
        accelerate.execute();
    }
    public void brake(){
        brake.execute();
    }
    public void start(){
        start.execute();
    }

    public Command getAccelerate() {
        return accelerate;
    }

    public void setAccelerate(Command accelerate) {
        this.accelerate = accelerate;
    }

    public Command getBrake() {
        return brake;
    }

    public void setBrake(Command brake) {
        this.brake = brake;
    }

    public Command getStart() {
        return start;
    }

    public void setStart(Command start) {
        this.start = start;
    }
}
