package pra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherRegex {

    public static void main(String[] args){

        String text="my account no's are 12376 and 456";
        Pattern pattern=Pattern.compile("\\D+");
       // Pattern pattern=Pattern.compile("\\d+");

        Matcher matcher=pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
