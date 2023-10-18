package T1.N1.Ex1;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private static ArrayList<String> Stack = new ArrayList();

    // Constructor privado para evitar instanciación
    private Undo() {}

    public static ArrayList<String> getStack() {
        return Stack;
    }
    public static void setStack(ArrayList<String> stack) {
        Stack = stack;
    }
    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    // Añadir un comando a la pila
    public static void push(String command) {
        Stack.add(command);
    }
    // Eliminar el último comando de la pila
    public static void pull() {
        Stack.remove(Stack.size() - 1);
    }

    public static void history() {
        System.out.println("History:");
        for (String command : Stack) {
            System.out.println(command);
        }
    }


    // Evitar duplicidad de instancias
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
