package T2.N2;

import T2.N2.PaymentMethod.PaymentMethod;

public class PaymentGateway {
    public void makePayment(PaymentMethod method, PaymentCallBack callBack) {
        // Process payment
        try {
            method.makePayment();
            callBack.paymentSuccess();
        } catch (Exception e) {
            callBack.paymentFailure(e.getMessage());
        }
    }
}

