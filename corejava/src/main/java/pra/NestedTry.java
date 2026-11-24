package pra;

public class NestedTry {

    public static void main(String[] args) {

        try {
            try {

                    int i = 19 / 0;
                    System.out.println(i);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("array exception" + e);
            }
        } finally {
            System.out.println("excutes the programs wlaways");
        }
    }
}