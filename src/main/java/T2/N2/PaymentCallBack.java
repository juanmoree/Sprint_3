package T2.N2;

public interface PaymentCallBack {
    void paymentSuccess();
    void paymentFailure(String reason);
}
