package pra;

class NestedInterface{

    interface PaymentType{
        void pay();
    }
}
public class UpiPay implements NestedInterface.PaymentType{

    public void pay(){
        System.out.println("Nested interface inside class");
    }
    public static void main(String[] args){

NestedInterface.PaymentType pays=new UpiPay();
pays.pay();

    }
}
