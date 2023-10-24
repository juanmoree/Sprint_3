package T1.N2;

import T1.N2.Address.Address;
import T1.N2.Factory.AbstractFactory;
import T1.N2.Phone.Phone;

public class Agenda {
    public AbstractFactory abstractFactory;
    private Phone phone;
    private Address address;

    public Agenda (AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }
}
