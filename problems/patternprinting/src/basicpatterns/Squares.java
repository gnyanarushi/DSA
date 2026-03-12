package basicpatterns;
public class Squares {
    public static void main(String[] args) {

        print1();
        System.out.println();
        System.out.println();
        print2();
        System.out.println();
        System.out.println();
        print3();
        System.out.println();
        System.out.println();
        print4();
        System.out.println();
        System.out.println();
        print5();
        System.out.println();
        System.out.println();
        print6();

    }

    private static void print1() {
        int n = 5 ;
        for(int i = 1 ;i <= n ; i++){
            for(int j = 1 ; j <= n ;j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }


    }


    public static void print2(){
        int n = 5 ;
        for(int i = 1 ; i  <=  n; i++){
            for(int j = 1 ; j  <= n ; j++ ){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    private static void print3() {
        int n = 5 ;
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= n ;j++ ){

                System.out.print((char) ('a' + (i - 1)));
            }
            System.out.println();
        }
    }


    private static void print4() {
        int n = 6 ;
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= n ;j++ ){

                System.out.print((char) ('a' + (j - 1)));
            }
            System.out.println();
        }
    }

    private static void print5() {
        int n = 6 ;
        int temp = 1;
        for(int i = 1 ; i <= n ; i++ ){
            for(int j = 1 ; j <= n ;j++ ){

                System.out.print((char) ('A' + (temp - 1)));
                temp++;

            }
            System.out.println();
        }
    }

    private  static  void print6(){
        int n = 5;
        int count = 1 ;
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                System.out.print(count + " ") ;
                count++;
            }
            System.out.println();
        }
    }
}
