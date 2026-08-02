package august.aug1;

public class WildCardArguments {
    public static void main(String[] args) {

        Student<Integer> s1 = new Student<>(new Integer[]{23 , 45 , 56, 67 , 78});
//        Student<Integer> s2 = new Student<>(new Integer[]{23 , 54 , 56, 67 , 78});

        Student<Double> s2= new Student<>(new Double[]{23.0 , 45.0 , 56.0, 67.0 , 78.0});
        System.out.println(s1.compare(s2));
    }
}

class Student<T extends Number >{
    String name;
    T[] marks;

    public Student(T[] marks){
        this.marks = marks;
    }

    double total(){
        double sum =0 ;
        for(T sub : marks){
            sum += sub.doubleValue();
        }
        return sum;
    }

//    boolean compare(Student<T> other){
//        return (this.total() == other.total());
//    }

    boolean compare(Student<?> other){
        return (this.total() == other.total());
    }
}
