package T1.N2.Phone;

public class UKPhone implements Phone{
    private String number;

    public UKPhone(String number) {
        this.number = "+44 " + number;
    }

    @Override
    public String getNumber() {
        return number;
    }
}
