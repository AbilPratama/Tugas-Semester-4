package PayApp;

public class PaymentXendit extends Payment {
    private String paymentMethod;
    private String secretToken;
    private String projectId;

    public PaymentXendit(String paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void pay(double amount){
        if (this.paymentMethod == "transfer"){
            this.bankTransfer();
        }
        else if (this.paymentMethod == "VA"){
            this.virtualAccount();
        }
    }

    private void bankTransfer(){
        System.out.println("Sending money by transfer");
    }
    private void virtualAccount(){
        System.out.println("Sendong money by VA");
    }
    
}
