package pra;

import java.io.IOException;

class Paren{
    void display() throws IOException {
        System.out.println("parent method");
    }
}

class Chil extends Paren{

    @Override
    void display() throws IOException {
        System.out.println("child method");
    }
}
public class OverridingExceptions {


    public static void main(String[] args) throws IOException{

     Chil child=new Chil();
     child.display();
    }
}
