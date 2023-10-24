package T1.N2.Factory;

import T1.N2.Address.Address;
import T1.N2.Address.UKAddress;
import T1.N2.Phone.Phone;
import T1.N2.Phone.UKPhone;

public class UKFactory implements AbstractFactory {
    private Phone phone;
    private Address address;
    @Override
    public Phone createPhone(String number) {
        phone = new UKPhone(number);
        return phone;
    }
    @Override
    public Address createAddress(String street, String number, String city) {
        return new UKAddress(street, number, city);
    }
}
