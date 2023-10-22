package T1.N2;

import java.util.HashMap;
import java.util.Map;

public class TelefonoFactory {

    private final static Map<Pais, Prefijo> prefijos = new HashMap<>();

    public Prefijo getTelefono(Pais pais) {
        return switch (pais) {
            case ES -> new Prefijo() {
                public String getPrefijo() {
                    return "+34";
                }
            };
            case FR -> new Prefijo() {
                public String getPrefijo() {
                    return "+33";
                }
            };
            case UK -> new Prefijo() {
                public String getPrefijo() {
                    return "+44";
                }
            };
        };
    }
}
