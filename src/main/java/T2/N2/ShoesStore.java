package T2.N2;

import T2.N2.PaymentMethod.BankAccount;

public class ShoesStore implements PaymentCallBack {
    public void makePayment() {
        PaymentGateway pG = new PaymentGateway();

        // Simulate different payment methods *****

        /*CreditCard creditCard = new CreditCard("1234-5678-9012-3456", "Juan Moreno", 1000);
        pG.makePayment(creditCard, this);
        Paypal paypal = new Paypal("email@email.com", 100);
        pG.makePayment(paypal, this);*/
        BankAccount bankAccount = new BankAccount("1234-5678-9012-3456", 500);
        pG.makePayment(bankAccount, this);
    }

    @Override
    public void paymentSuccess() {
        System.out.println("Payment successful. Thanks for buying from Shoes Store!");
    }

    @Override
    public void paymentFailure(String reason) {
        System.out.println("Payment failed. Reason: " + reason);
    }
}
