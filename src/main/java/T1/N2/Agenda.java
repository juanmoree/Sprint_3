package T1.N2;

public class Agenda implements Direccion, Prefijo {
    private String direccion;
    private String telefono;

    public Agenda(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPrefijo() {
        return telefono;
    }
}
