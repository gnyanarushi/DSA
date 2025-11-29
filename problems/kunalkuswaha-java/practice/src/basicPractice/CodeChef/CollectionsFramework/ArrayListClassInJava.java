package basicPractice.CodeChef.CollectionsFramework;
import java.util.ArrayList;
public class ArrayListClassInJava {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Day1.rishi");
        arr.add("ganesh");
        arr.add("yaswanth");
        arr.add(1 , "karthik");

        System.out.println(arr);
        ArrayList<String> newArr = new ArrayList<>();
        newArr.add("ganesh");
        newArr.add("Day1.rishi");
        arr.removeAll(newArr);

        System.out.println(arr);



    }
}
