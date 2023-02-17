package payments;

public class PaymentByPayPal implements PaymentStrategy{

    private String email;
    private String password;

    public void pay(int amount){
        email="abc@qwe.com";
        password="****";
        System.out.println("Paying "+amount+ " using PayPal");
    }
}
