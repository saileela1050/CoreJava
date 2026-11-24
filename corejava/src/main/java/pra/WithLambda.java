package pra;

public class WithLambda {

    public static void main(String[] args){

        Interfaces1 ints=()-> System.out.println("Pay method with lambda");
        ints.pay();

    }
}
