package pra;

 class Interfac implements InterfaceExample {


    @Override
    public void pay() {
        System.out.println("Payment");
    }

    public static void main(String[] args){

       Interfac inter=new Interfac();
       inter.pay();


    }
}
