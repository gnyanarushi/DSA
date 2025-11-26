package basicPractice.CodeChef.mathproblems;

import java.util.ArrayList;
import java.util.List;

public class MinMaxOfSumOfList {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(256741038 );
        arr.add(623958417 );
        arr.add(467905213 );
        arr.add(714532089 );
        arr.add(938071625);
        minMax(arr);

    }
    public  static void minMax(List<Integer> arr){
        List<Long>  sumList  = new ArrayList<>();
        List<Integer> minMax = new ArrayList<>();


        for (int i = 0; i < arr.size(); i++) {
            Long sum =Long.MIN_VALUE;
            for (int j = 0; j < arr.size(); j++) {
                if(i == j ) continue;
                else {
                    sum += arr.get(j);
                }
            }
            sumList.add(sum);

        }
        System.out.println(sumList);
        System.out.println(max(sumList)  + " " +  min(sumList));
    }



    public static Long max(List<Long> arr ){
        Long max = Long.MIN_VALUE ;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > max) max = arr.get(i);
        }

        return max;
    }

    public static  Long min(List<Long> arr){
        Long min = Long.MAX_VALUE;
        for (int i = 0; i < arr.size(); i++) {
                if(arr.get(i) < min) min = arr.get(i);
        }
        return min;
    }

}
