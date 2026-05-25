package recursion;


public class printNtimesName {

    public static void print(int n ){
        if(n == 0 ){
            return;
        }

        System.out.println("Rishi");
        n--;
        print(n);

    }

    public static void print1toNLinear(int  i ,  int n  ){
        if(i > n ){
            return;
        }

        System.out.println(i);
        print1toNLinear(i+1 , n);


    }

    public static  void printNto1Linear(int i ) {
        if(i < 1){
            return;
        }

        System.out.println(i);
        printNto1Linear(i-1);
    }




    public static void print1toNbacktracking(int i  , int n ){
        if(i < 1){
            return;
        }

        print1toNbacktracking(i - 1 , n );
        System.out.println(i);
    }


    public static void printNto1Backtracking(int i  , int n ){
        if(i > n){
            return;
        }

        printNto1Backtracking(i + 1 , n );
        System.out.println(i);
    }
    public static void main(String[] args) {
        printNto1Backtracking(1 , 5 );
    }
}
