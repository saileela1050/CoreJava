package pra;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedWildCard {
    static void display(List<?super Integer> list){
        list.add(10);
        list.add(35);
    }

    public static void main(String[] args){

        List<Integer> numbers=new ArrayList<>();
        display(numbers);

        System.out.println(numbers);
    }
}
