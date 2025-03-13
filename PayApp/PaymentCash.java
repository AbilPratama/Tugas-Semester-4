package PayApp;

public class PaymentCash extends Payment{
    private String adminId;
    private String branchId;

    public PaymentCash(String adminId, String branchId, String CustomerId){
        super(CustomerId);
        this.adminId = adminId;
        this.branchId = branchId;
    }

    public void pay(double amount){
        System.out.println("Costumer to the branch and pay" + amount + "cash");
    }
    
}
