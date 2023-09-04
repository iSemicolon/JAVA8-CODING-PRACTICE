package numberStartWith;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartsWith {

    //number starts with 2
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(2, 12, 22, 32, 444, 222, 26);

        List<Integer> elementList= list.stream()
                                       .map(e->String.valueOf(e))
                                       .filter(ele->ele.startsWith("2"))
                                       .map(Integer::valueOf)
                                       .collect(Collectors.toList());

        System.out.println("Number Start With 2 are: "+ elementList);

    }
}
