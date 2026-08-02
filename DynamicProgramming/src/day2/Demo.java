package day2;

public class Demo {


    public static void main(String[] args) {
        System.out.println("hello main ");

        main("rishi");
        main(7);
        main(7.00d);
        main(5, 6);

    }


    public static void main(double duble) {
        System.out.println(duble);
    }

    public static void main(int integer) {
        System.out.println(integer);
    }


    public static void main(int a, int b) {
        System.out.println(a + " " + b);
    }

    public static void main(String string) {
        System.out.println(string);
    }
}
