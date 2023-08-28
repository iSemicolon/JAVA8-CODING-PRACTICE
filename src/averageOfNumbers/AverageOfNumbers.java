package averageOfNumbers;

import java.util.ArrayList;
import java.util.List;

public class AverageOfNumbers {

        public static double avgFind(List<Integer> listElements){

            double sum=0;

            for(double item: listElements){

                sum=sum+item;
            }

            double avg= sum/listElements.size();

            return avg;
        }


        public static double averageCalculation(List<Integer> listElements){

            double avg= listElements.stream().mapToInt(item->item).average().getAsDouble();

            return avg;
        }

        public static void main(String args[]){

            List<Integer> listElements=new ArrayList<>();

            listElements.add(44);
            listElements.add(66);
            listElements.add(57);

            System.out.println("-----Old Approach-----");
            double result=avgFind(listElements);
            System.out.println("Average Of List Elements : "+result);

            System.out.println("-----New Approach-----");
            double average=averageCalculation(listElements);
            System.out.println("Average Of List Elements : "+average);


        }


}
