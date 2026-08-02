package jul.jul25.generic;

import java.util.Vector;

public class MainGenerics {
    public static void main(String[] args) {

        GenericClass<Integer> intArray = new GenericClass<>(new Integer[] { 1,2 ,3 , 4 , 5 });
        GenericClass<Double> doubleArray = new GenericClass<>(new Double[] { 1.0 , 2.0 ,3.0 , 4.0, 5.0});
        GenericClass<String> stringArray = new GenericClass<>(new String[] {"rishi" , "gnyana" , "venkata" , "rahul " , "kunal " , "kuswaha"});
        // user definded class Generics
        GenericClass<Student> studentArray = new GenericClass<>(new Student[] {new Student(1 , "rishi") , new Student(2 , "Gnyana " ) , new Student(3 , "rahul ")});



    }
}