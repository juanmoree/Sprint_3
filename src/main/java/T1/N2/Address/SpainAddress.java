package T1.N2.Address;

public class SpainAddress implements Address{
    private String street;
    private String number;
    private String city;

    public SpainAddress(String street, String number, String city) {
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
        if (city.equalsIgnoreCase("madrid")) {
            return "MADRID";
        }
        if (city.equalsIgnoreCase("barcelona")) {
            return "BARCELONA";
        }
        if (city.equalsIgnoreCase("valencia")) {
            return "VALENCIA";
        }
        else
            return city.toUpperCase() + " NOT FOUND, TRY ANOTHER ONE";
    }

    @Override
    public String toString() {
        return "SpainAddress{" +
                "street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
