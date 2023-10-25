package T1.N3.Cliente;

import T1.N3.Actions.Actions;
import T1.N3.Actions.Settings;

public class Main {
    public static void main(String[] args) {
        Actions action = new Actions();
        Settings.settings(action);

        action.getAccelerate().execute();
        action.getBrake().execute();
        action.getStart().execute();
    }
}
