package PayApp;

public class Payment {
    private String CustomerId;
    private String PaymentId;
    private String PaymentDate;
    private double amount;

    public Payment(String CustomerId){
        this.CustomerId = CustomerId;
        this.PaymentId = generateId();
        this.PaymentDate = generateDate();
    }

    public Payment(String CustomerId, double amount){
        this.CustomerId = CustomerId;
        this.amount = amount;
        this.PaymentId = generateId();
        this.PaymentDate = generateDate();
    }

    public Payment(String CustomerId, double amount, String PaymentId){
        this.CustomerId = CustomerId;
        this.amount = amount;
        this.PaymentId = PaymentId;
        this.PaymentDate = generateDate();
    }

    private String generateId(){
        return "111111";
    }

    private String generateDate(){
        return "2025-03-06";
    }

    public void pay(double amount){
        System.out.println("Transfering" + amount + "to the account");
    }

    public void printPaymentDetails(){
        System.out.println("Payment ID: " + PaymentId);
        System.out.println("Payment Date: " + PaymentDate);
        System.out.println("Amount: " + amount);
        System.out.println("Costumer ID: " + CustomerId);
    }    
}
