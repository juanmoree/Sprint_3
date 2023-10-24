package T1.N2;

import T1.N2.Factory.AbstractFactory;
import T1.N2.Factory.SpainFactory;
import T1.N2.Factory.UKFactory;

public class Main {
    private static Agenda configureAgenda(String country) {
        Agenda agenda;
        AbstractFactory abstractFactory;
        if (country.equalsIgnoreCase("Spain")) {
            abstractFactory = new SpainFactory();
        } else if (country.equalsIgnoreCase("UK")) {
            abstractFactory = new UKFactory();
        } else {
            System.out.println("El país no está en la lista.");
            return null;
        }
        agenda = new Agenda(abstractFactory);
        return agenda;
    }

    public static void main(String[] args) {
        Agenda agendaSpain = configureAgenda("Spain");
        Agenda agendaUK = configureAgenda("UK");

        agendaSpain.abstractFactory.createPhone("123456789");
        agendaSpain.abstractFactory.createAddress("Calle", "1", "Madrid");
    }
}
