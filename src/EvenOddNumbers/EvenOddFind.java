package EvenOddNumbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddFind {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(9,7,0,2,6,3,5,4);

        List<Integer> even=list.stream().filter(num->num%2==0).collect(Collectors.toList());

        List<Integer> odd=list.stream().filter(i->i%2!=0).collect(Collectors.toList());

        System.out.println("Even Numbers "+even);
        System.out.println("Odd Numbers "+odd);
    }
}
