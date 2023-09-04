package averageOfSquareOfNumbers;

import java.util.Arrays;
import java.util.List;

public class AverageOfEvenOfSquareNumbers {

    public static double avgFind(List<Integer> listElements){

       int sum=0;
       int j=0;

       for (int i: listElements){
           int squ= i*i;

           if(squ%2==0){
               j++;

               sum=sum+squ;

           }
       }

       double avg=sum/j;

       return avg;
    }


    public static double averageCalculation(List<Integer> listElements){

        double avg= listElements.stream().map(sqr-> sqr*sqr).filter(even->even%2==0).mapToInt(e->e).average().getAsDouble();

        return avg;
    }


    public static void main(String[] args) {

        List<Integer> listElements= Arrays.asList(5,10,15,20,25);

        System.out.println("-----Old Approach-----");
        double result=avgFind(listElements);
        System.out.println("Average Of List Elements : "+result);

        System.out.println("-----New Approach-----");
        double average=averageCalculation(listElements);
        System.out.println("Average Of List Elements : "+average);
    }
}
