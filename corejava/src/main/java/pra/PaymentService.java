package pra;

public class PaymentService implements UpiPayment,CardPayment{

    @Override
    public void payUsingCard(){
        System.out.println("card payment");
    }
    @Override
    public void payUsingUpi(){
        System.out.println("upi payment");
    }

    public static void main(String[] args){

        PaymentService pay=new PaymentService();
        pay.payUsingCard();
        pay.payUsingUpi();
    }

}
