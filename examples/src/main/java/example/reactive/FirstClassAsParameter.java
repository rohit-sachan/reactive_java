package example.reactive;

import java.util.function.Function;

/**
 * Created by Rohit Sachan on 11/30/2014.
 */
public class FirstClassAsParameter {
    public static void main(String[] args) {
        String result = addAndTransform("Helllo " , "Rohit", (s) -> {return s.toUpperCase();}    );
        System.out.println(result);
    }

    public static String addAndTransform(String s, String u , Function<String,String> func){
        return "Function pointer "+ func.apply(s)+func.apply(u);
    }
}
