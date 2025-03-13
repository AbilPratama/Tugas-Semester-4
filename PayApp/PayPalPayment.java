package PayApp;

public class PayPalPayment extends Payment {
    private String paypalToken;
    private String paypalId;

    PayPalPayment(String paypalToken,String paypalId, String CustomerId){
        super(CustomerId);
        this.paypalToken = paypalToken;
        this.paypalId = paypalId;
    }

    public void pay(double amount){
        System.out.println("Using paypal API to transfer " + amount + "to the account");
    }
    
}
