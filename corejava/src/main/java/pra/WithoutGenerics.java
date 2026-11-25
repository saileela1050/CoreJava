package pra;

class Data {
    Object value;

    void setValue(Object value) {
        this.value = value;
    }

    Object getValue() {
        return value;
    }
}

public class WithoutGenerics {

    public static void main(String[] args){

        Data data=new Data();
        data.setValue("java");
        String result=(String) data.getValue();
        System.out.println(result);
    }
}
