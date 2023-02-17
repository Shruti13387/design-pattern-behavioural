import payments.PaymentByCreditCard;
import service.PaymentService;

public class StrategyPatternMain {

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService(203, true);
        paymentService.setStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    }
}
