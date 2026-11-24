package pra;

public class Exceptions {

    public static void main(String[] args){

        try {
            int i = 0;
            int j = 19 / i;

            System.out.println(j);
        } catch (ArithmeticException e) {
               System.out.println("cannot divid by zero"+e);
        }

        System.out.println("Programs continue");
    }
}
