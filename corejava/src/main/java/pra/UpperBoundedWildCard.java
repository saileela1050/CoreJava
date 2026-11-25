package pra;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedWildCard {

    static void display(List<? extends Number> list){
        for(Number n:list){
            System.out.println(n);
        }
    }
    public static void main(String[] args){

        List<Integer> list= Arrays.asList(1,20,20);
        List<Double> list1=Arrays.asList(10.0,20.9);
        display(list);
        display(list1);
    }
}
