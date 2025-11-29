package basicPractice.CodeChef.googletechdevguides;



public class EvenlySpaced {
    public static int max(int a , int b ){
        return a > b ? a : b;
    }

    public static boolean evenlySpaced(int a , int b , int  c ){
        if (Math.abs(a-b) == Math.abs(b-c)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(evenlySpaced(10 , 9, 11 ));
    }
}
