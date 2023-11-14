package T2.N2;

import T2.N2.PaymentMethod.BankAccount;
import T2.N2.PaymentMethod.CreditCard;
import T2.N2.PaymentMethod.Paypal;

import java.util.Scanner;

public class ShoesStore implements PaymentCallBack {
    static Scanner sc = new Scanner(System.in);

    public void makePayment() {
        PaymentGateway pG = new PaymentGateway();

        /*CreditCard creditCard = new CreditCard("1234-5678-9012-3456", "Juan Moreno", 1000);
        pG.makePayment(creditCard, this);
        Paypal paypal = new Paypal("email@email.com", 100);
        pG.makePayment(paypal, this);
        BankAccount bankAccount = new BankAccount("1234-5678-9012-3456", 500);
        pG.makePayment(bankAccount, this);*/

        System.out.println("Choose your payment method:");
        System.out.println("1. Credit Card\n2. Paypal\n3. Bank Account");
        byte option = sc.nextByte();
        switch (option) {
            case 1 -> {
                System.out.println("Enter your credit card number:");
                String creditCardNumber = sc.next();
                System.out.println("Enter your name:");
                String name = sc.next();
                System.out.println("Enter your credit card balance:");
                Double balance = sc.nextDouble();
                CreditCard creditCard = new CreditCard(creditCardNumber, name, balance);
                pG.makePayment(creditCard, this);
            }
            case 2 -> {
                System.out.println("Enter your email:");
                String email = sc.next();
                System.out.println("Enter your paypal balance:");
                Double balance = sc.nextDouble();
                Paypal paypal = new Paypal(email, balance);
                pG.makePayment(paypal, this);
            }
            case 3 -> {
                System.out.println("Enter your bank account number:");
                String bankAccountNumber = sc.next();
                System.out.println("Enter your bank account balance:");
                Double balance = sc.nextDouble();
                BankAccount bankAccount = new BankAccount(bankAccountNumber, balance);
                pG.makePayment(bankAccount, this);
            }
        }
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
