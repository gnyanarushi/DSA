package Day3.rishi;

public class PrintTriangle {
    public  static void main(String[] args){
        printCrone();
    }



    public static void printCrone(){
        int n = 5 ;

        for(int i = 1 ; i <= n ; i++ ){


            for(int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }

            for(int j = 1 ; j <= 2*(n-i) ; j++){
                System.out.print("  ");
            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }

            System.out.println();



        }
    }


    public static void printLeftRightAngleTriangle() {

        int n = 5 ;

        for(int i = 1; i <= n ; i++ ){
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
        }
    }


    public static void printRightrRightAngleTriangle() {
        int n = 5 ;

        for(int i = 1 ; i <= n; i++ ) {


            for(int j = 1 ; j <= (n-i) ; j++ ){
                System.out.print("  ");
            }

            for (int j = 1; j <= i  ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void  printSquare() {
        int n = 5 ;
        for(int i  = 1 ; i <= n ; i++ ) {
            for(int j = 1 ; j <= n ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
