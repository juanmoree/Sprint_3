package T1.N2.Phone;

public class SpainPhone implements Phone{
    private String number;

    public SpainPhone(String number) {
        this.number = "+34 " + number;
    }

    @Override
    public String getNumber() {
        return number;
    }
}
