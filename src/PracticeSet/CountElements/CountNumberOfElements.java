package PracticeSet.CountElements;


import java.util.Arrays;
import java.util.List;

//Given a list of integers, find the total number of elements present in the list using Stream functions?
public class CountNumberOfElements {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Long count= myList.stream().count();

        System.out.println(count);
    }

}
