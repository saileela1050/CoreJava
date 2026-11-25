package pra;

class Datas<T>{
    T value;

    void setValue(T value){
        this.value=value;
    }
    T getValue(){
        return value;
    }
}
public class Generics {
    public static void main(String[] args){

        Datas<String> data=new Datas<>();
        data.setValue("java");
        System.out.println(data.getValue());

        Datas<Integer> data1=new Datas<>();
        data1.setValue(1090);
        System.out.println(data1.getValue());
    }
}
