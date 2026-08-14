package august.aug2FIleIOStreams;

import java.util.ArrayList;

public class PracticeProblems {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        changeList(list);
        Integer a= 100 ;
        Integer b = 200;
        swap(a , b );
        System.out.println(a + "  " + b );
        System.out.println(list);

    }

    public  static void swap(Integer a , Integer b ){
        int t = a ;
        a = b ;
        b = t;
    }

    public static  void changeList(ArrayList<Integer> list){

        list.set(0, 150);
        System.out.println(list.get(0));
        System.out.println(list);
    }
}
