package com.java.core;

interface Payments{
    void pay();

}

class CardPayment implements Payments{

    @Override
  public void pay(){
        System.out.println("card paymet");
    }
}
public class Interface {

    public static void main(String[] args){

    Payments payment=new CardPayment();
    payment.pay();
    }
    }

