package pra;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCard {

    static void display(List<?> list){
        for(Object value:list){
            System.out.println(value);
        }

    }
    public static void main(String[] args){
        List<String> names= Arrays.asList("java","string","sql");
        List<Integer> numbers=Arrays.asList(10,20,90);
        display(names);
        display(numbers);

    }
}
