package pra;
class Cal{
    int id;
    String name;
}

public class MemoryManagementInJvm {

    public static void main(String[] args){

       Cal calcul=new Cal();
       Cal cal2=calcul;
        cal2.id=198;
       //calcul.id=10;
       calcul.name="saileela";

       System.out.println(calcul.id);
        System.out.println(cal2.id);
        System.out.println(calcul.name);

    }
}
