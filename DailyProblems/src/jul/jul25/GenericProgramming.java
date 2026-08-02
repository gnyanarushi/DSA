package jul.jul25;

import java.util.Arrays;

public class GenericProgramming {
    public static <T> void swap(T a , T b  ){
      T temp = a ;
      a = b ;
      b = temp ;
    }
    public static void main(String[] args) {
        Integer a = 99;
        Integer b = 66 ;
        swap(a , b );

//        System.out.println(a + " " + b);
        String s = "rishi";
        String y = "rowdy";
        swap(s , y );
//        System.out.println(s + " " + y);


        // passing the Array elements to the array elements

        Integer[] arr = {1 , 2, 3, 4,5,6,7} ;
        messagePassing(arr);
    }



    public static <T> void messagePassing(T ...t ){
        for(int i = 0 ;i < t.length ; i++){
            System.out.print(t[i] + " ");
        }
    }
}