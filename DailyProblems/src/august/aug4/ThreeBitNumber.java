package august.aug4;

public class ThreeBitNumber {

    private  static  void threeBitNumberGreaterThanTwo(String s , int n , int ones){

        // base condition
        if(s.length() == n ){
            if(ones >= 2 )
                System.out.println(s);
            return ;
        }
        threeBitNumberGreaterThanTwo(s + "0" , n , ones);
        threeBitNumberGreaterThanTwo(s+ "1" , n , ones + 1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the digits you want : " );
        int  n = new  java.util.Scanner(System.in).nextInt();
        threeBitNumberGreaterThanTwo("" , n , 0);
    }
}
