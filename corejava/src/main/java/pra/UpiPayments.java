package pra;

public class UpiPayments extends Payment{

    //@Override
    public void pay(){
        System.out.println("println");
    }

    public static void main(String[] args){

        UpiPayments upi=new UpiPayments();
        upi.pay();
        upi.display();
    }
}
