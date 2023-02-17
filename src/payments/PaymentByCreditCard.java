package payments;

public class PaymentByCreditCard implements PaymentStrategy{
 //   private CreditCard card;

    public void pay(int amount){
      //  card = new CreditCard("cardNumber", "expiryDate", "cvv");
        System.out.println("Paying "+ amount + " using credit card");
    }
}
