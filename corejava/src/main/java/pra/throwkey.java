package pra;

public class throwkey {
    public static void main(String[] args){

        int age=19;

        if(age<18){ throw new ArithmeticException("Not eligibele");
        }
        System.out.println("eligible");
    }
}
