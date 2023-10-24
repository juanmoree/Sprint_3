package T1.N2.Factory;

import T1.N2.Address.Address;
import T1.N2.Phone.Phone;

public interface AbstractFactory {
    Phone createPhone(String number);
    Address createAddress(String street, String number, String city);
}
