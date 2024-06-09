package characterOccurance;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CharacterOccurence {

    public static void foo(Object o) {
        System.out.println("Object argument");
    }
    public static void foo(String s) {
        System.out.println("String argument");
    }

    public static void main(String[] args) {

        String s="Hi I am Palash";

        String[] str= s.split("");

          Arrays.stream(str).map(String::toLowerCase).collect(Collectors.groupingBy(n->n, LinkedHashMap::new, Collectors.counting())).forEach((key, value)->System.out.println(key+"-"+value));


            foo(null);


    }
}
