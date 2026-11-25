package pra;

import java.util.Optional;

public class NullChecksUsingOptional {
    public static void main(String[] args){

        String name="sai";

        Optional<String> optionalName=Optional.ofNullable(name);
        System.out.println(optionalName.orElse("Default Name"));
    }
}
