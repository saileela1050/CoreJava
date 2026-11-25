package pra;

public class Regex {

    public static void main(String[] args){

        String name="8977666660";
        System.out.println(name.matches("\\d{10}"));
        System.out.println("abc123".matches("[a-z]+\\d"));
    }
}
