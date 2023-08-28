package sumOfNumbers;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {

    public static int sumFind(List<Integer> listElements){

        int sum=0;

        for(int item: listElements){

            sum=sum+item;
        }

        return sum;
    }


    public static int sumCalculation(List<Integer> listElements){

       int sum= listElements.stream().reduce(0,(subTotal,num)-> subTotal+num);

        return sum;
    }

    public static void main(String args[]){

        List<Integer> listElements=new ArrayList<>();

        listElements.add(44);
        listElements.add(66);
        listElements.add(57);

        System.out.println("-----Old Approach-----");
        int result=sumFind(listElements);
        System.out.println("Sum Of List Elements : "+result);

        System.out.println("-----New Approach-----");
        int total=sumCalculation(listElements);
        System.out.println("Sum Of List Elements : "+total);


    }
}
