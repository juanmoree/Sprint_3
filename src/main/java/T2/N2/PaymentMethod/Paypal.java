package T2.N2.PaymentMethod;

public class Paypal implements PaymentMethod {
    private String email;
    private double amount;

    public Paypal(String email, double amount) {
        this.email = email;
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Payment made by Paypal");
    }
}
