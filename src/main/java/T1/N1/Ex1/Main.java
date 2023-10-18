package T1.N1.Ex1;

public class Main {
    public static void main(String[] args) {
        // No se puede instanciar la clase
        // T1.N1.Ex1.Undo undo = new T1.N1.Ex1.Undo();
        // No se puede clonar la clase

        Undo comando = Undo.getInstance();

        comando.push("Comando 1");
        comando.push("Comando 2");
        comando.push("Comando 3");
        comando.push("Comando 4");


        comando.history();
        comando.pull();
        comando.push("Comando 5");
        comando.history();
    }
}