package pra;

public class TryCatchBlocks {

    public static void main(String[] args){
        try {
            int i = 19 / 0;
            System.out.println(i);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array exception"+e);
        }
        catch(ArithmeticException e){
            System.out.println("arithematci exception"+e);
        }catch(NullPointerException e){
            System.out.println("null exception"+e);
        }catch(NumberFormatException e){
            System.out.println("arithematci exception"+e);
        }catch (Exception e){
            System.out.println("something wrong"+e);
        }

        finally {
            System.out.println("always exceutes whree xecpetion occurs or not");
        }
    }
}
