package PayApp;

public class App {
    public static void main(String[] args) throws Exception {
        PayPalPayment payX = new PayPalPayment("1234567890", "1234567890", "1234567890");

        Payment payY = new PayPalPayment("1234567890", "1234567890", "1234567890");

        Payment payZ = new Payment("1234567890");

        payX.pay(10000);
        payY.pay(10000);
        payZ.pay(10000);
        
    }
    
}
