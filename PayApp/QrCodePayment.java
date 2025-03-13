package PayApp;

public class QrCodePayment extends Payment{
    private String qrCode;

    public QrCodePayment(String qrCode, String customerId){
        super(customerId);
        this.qrCode = qrCode;

    }

    public void pay(double amount){
        System.out.println("Costumer use QR Code and pay" + amount + "cash");
    }
    
}