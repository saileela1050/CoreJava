package pra;

interface MyMarker{

}
public class MarkerInterface implements MyMarker {

    void diplay(){
        System.out.println("my marker interface");
    }

    public static void main(String[] args){

        MarkerInterface emp=new MarkerInterface();
        if(emp instanceof MyMarker){
        emp.diplay();
    }
}
}
