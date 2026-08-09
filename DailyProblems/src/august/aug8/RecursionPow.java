package august.aug8;

public class RecursionPow {

    public static void main(String[] args) {
         double ans = myPow(2.0000 , Integer.MIN_VALUE);

        System.out.println(ans);
    }

    static double myPow(double x, int n) {
        if(x == -1.0){
            if(n%2 == 0)
                return 1;
            else return -1;
        }
        if(x == 1.0){
            return 1 ;
        }
        if(n < 0 ){
            x = 1 / x;
            n = -n ;
        }
        double curr = x;
        return pow(1 ,curr , n);
    }


    static double pow(double ans , double curr ,  long n  ) {

        if(n == 0){
            return ans ;
        }
        if(n %2 == 1 ){
            ans = ans * curr;
        }
        curr = curr * curr;
        return pow( ans ,  curr , n /2);
    }
}
