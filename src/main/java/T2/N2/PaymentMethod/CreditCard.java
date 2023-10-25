package T2.N2.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private String number;
    private String owner;
    private double amount;

    public CreditCard(String number, String owner, double amount) {
        this.number = number;
        this.owner = owner;
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Payment made by Credit Card");
    }
}
