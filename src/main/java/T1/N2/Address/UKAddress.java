package T1.N2.Address;

public class UKAddress implements Address{
    private String street;
    private String number;
    private String city;

    public UKAddress(String street, String number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public String getCity() {
        if (city.equalsIgnoreCase("london"))
            return "LONDON";
        if (city.equalsIgnoreCase("liverpool"))
            return "LIVERPOOL";
        if (city.equalsIgnoreCase("manchester"))
            return "MANCHESTER";
        else
        return city + " not found";
    }
}
