package T2.N2.PaymentMethod;

public class BankAccount implements PaymentMethod {
    private String AccountNumber;
    private double amount;

    public BankAccount(String AcountNumber, double amount) {
        this.AccountNumber = AcountNumber;
        this.amount = amount;
    }

    public String getAcountNumber() {
        return AccountNumber;
    }

    public void setAcountNumber(String acountNumber) {
        AccountNumber = acountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public void makePayment() {
        System.out.println("Payment made by Bank Account");
    }
}
