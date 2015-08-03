package example.reactive;

import java.util.function.BiFunction;

/**
 * Created by Rohit Sachan on 11/30/2014.
 */
public class FirstClassCitizenVariableIllustration {
    public static void main(String[] args) {

        BiFunction<String, String, String> concatFunction = (s,t) -> "function Saying "+s+t + " !";
        System.out.println( concatFunction.apply("Hello ", "Rohit"));

        BiFunction<String, String, String> concat2 =  FirstClassCitizenVariableIllustration::concatString;
        System.out.println( concat2.apply("Hello ", "Rohit"));

        FirstClassCitizenVariableIllustration instance = new FirstClassCitizenVariableIllustration();
        BiFunction<String, String, String> conca3=  instance::concatString3;
        System.out.println( conca3.apply("Hello ", "Rohit"));
    }

    public static String concatString(String s , String t){
        return "Static function Saying "+s+t + " !";
    }


    public String concatString3(String s , String t){
        return "Instance function Saying "+s+t + " !";
    }
}
