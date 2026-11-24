package pra;

import java.io.IOException;
import java.sql.SQLException;

class Emp1{
   void display() throws IOException, SQLException {
         throw new IOException("File not found");
    }
}
public class ThrowsKeyword {

    public static void main(String[] args){
     Emp1 emp=new Emp1();
     try{
     emp.display();

    } catch (IOException e) {
         System.out.println(e.getMessage());
     } catch (SQLException e) {
         System.out.println(e.getSQLState());
     }
}
}
