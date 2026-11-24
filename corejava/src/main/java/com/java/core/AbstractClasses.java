package com.java.core;

abstract class Payment{
    abstract void pay();

    void payments(){
        System.out.println("apy using upi");
    }
}

class UpiPayment extends Payment{

    @Override
    void pay(){
        System.out.println("payments upi");
    }
}
public class AbstractClasses {

    public static void main(String[] args){

UpiPayment upipay=new UpiPayment();
upipay.pay();
upipay.payments();
    }
}
