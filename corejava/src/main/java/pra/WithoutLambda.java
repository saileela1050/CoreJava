package pra;

public class WithoutLambda {

    public static void main(String[] args){

        Interfaces1 inter=new Interfaces1() {

            public void pay() {
              System.out.println("Pay method without lambda");
            }
        };
        inter.pay();
    }
}
