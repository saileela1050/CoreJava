package pra;

interface Payme {

    interface Pays {
        void pay();
    }
}
public class Cardpays implements Payme.Pays {

    public void pay(){
        System.out.println("Nested interface inside another interface");
    }

    public static void main(String[] args){

    Payme.Pays paym=new Cardpays();

    paym.pay();
    }
}
