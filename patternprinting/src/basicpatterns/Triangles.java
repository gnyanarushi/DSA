package basicpatterns;

public class Triangles {


    public static void main(String[] args ){

//        print1();
//        System.out.println();
//        System.out.println();
//        print2();
//        System.out.println();
//        System.out.println();
//        print3();
//        System.out.println();
//        System.out.println();
//        print4();
//        System.out.println();
//        System.out.println();
//        print5();
//        System.out.println();
//        System.out.println();
//        print6();
//        System.out.println();
//        System.out.println();
//        print7();
//        System.out.println();
//        System.out.println();
//        print8();
//        System.out.println();
//        System.out.println();
//        print9();

    }



    public static void print1() {
        int n  = 5 ;

        for(int i = 1; i <= n; i++ ) {
            for(int j = 1; j <= i ; j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    public static void print2() {
        int n = 5;

        for(int i = 1 ; i <= n ; i++ ){
            for(int  j = 1 ; j <= (n-i) ; j++ ){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void print3(){
        int n  = 5 ;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i  = n -1; i >= 1 ; i-- ){
            for(int j = 1; j <= i ; j++  ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void print4(){
        int n = 5;

        for(int i = 1 ;i <= n;i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for(int j = 1; j<= 2 * (n-i) ; j++){
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static  void print5( ){
        int n = 5 ;
        for(int i = 1 ;i <= n ;i++ ){
            for (int j = 1; j <=  i ; j++) {
                System.out.print(j + "  ") ;
            }
            System.out.println();
        }
    }

    private static  void print6( ){
        int n = 5 ;
        for(int i = 1 ;i <= n ;i++ ){
            for (int j = 1; j <=  i ; j++) {
                System.out.print(i + "  ") ;
            }
            System.out.println();
        }
    }

    private static void print7() {
        int n = 5 ;
         for(int i = 1 ; i <= n ;i++){

             for(int j = i; j >= 1 ;j--) {
                 System.out.print(j + " ");
             }
             System.out.println();
         }
    }


    private static void print8 (){
        int n = 5 ;
        for(int i = 1 ;i <= n ;i++ ){
            for(int j = 1; j <= i ; j++ ){
                System.out.print((char)('a' +(i-1)));
            }
            System.out.println();
        }
    }
    private static void print9 (){
        int n = 5 ;
        for(int i = 1 ;i <= n ;i++ ){
            for(int j = 1; j <= i ; j++ ){
                System.out.print((char)('a' +(j-1)));
            }
            System.out.println();
        }
    }

}
