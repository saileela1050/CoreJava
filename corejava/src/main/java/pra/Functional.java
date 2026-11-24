package pra;

public class Functional {

    public static void main(String[] args){
        FunctionalWithParams funct= (a,b) -> a+b;
        System.out.println(funct.add(10,20));


    }
}