package pra;

public class TryCatch
 {
    public static int getValue() {
        try {
            System.out.println("Inside try");
            return 10;
        } finally {
            System.out.println("Inside finally");
        }
    }

    public static void main(String[] args) {
     //   int result = getValue();
        System.out.println("Returned Value: " + getValue());
    }
}
