package T1.N2.Factory;

import T1.N2.Address.Address;
import T1.N2.Address.SpainAddress;
import T1.N2.Phone.Phone;
import T1.N2.Phone.SpainPhone;

public class SpainFactory implements AbstractFactory {
    Phone phone;
    Address address;
    @Override
    public Phone createPhone(String number) {
        phone = new SpainPhone(number);
        return phone;
    }
    @Override
    public Address createAddress(String street, String number, String city) {
        address = new SpainAddress(street, number, city);
        return address;
    }
}
