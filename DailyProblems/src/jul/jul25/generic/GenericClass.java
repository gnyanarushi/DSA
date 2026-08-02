package jul.jul25.generic;

import jul.jul25.GenericProgramming;

import java.util.Arrays;

public class GenericClass<T> {
    T[] t;

    public GenericClass(T[] t) {
        this.t = t;
    }

    public void print() {
        System.out.println(Arrays.toString(t));
    }

    public void reverse(){
        int  i = 0 , j = t.length -1 ;
        while(i <= j ){
            T temp = t[i];
            t[i] = t[j];
            t[j] = temp;
            i++; j--;
        }
    }

}


class Student{
    int id;
    String name;
    Student(int id , String name ){
        this.id = id ;
        this.name = name;
    }

    @Override
    public String toString(){
        return "{id = " + this.id  + ", name =  " + this.name + "} " ;
    }
}

