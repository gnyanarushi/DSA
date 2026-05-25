package basicProblems;



public class ArmStrongNumber {

    public static void main(String[] args) {
        int n = 35;
        int duplicate = 0;
        int sum = 0 ;
        while(n >  0 ){

            int ld = n % 10;
            sum +=  (ld*ld*ld);
            n = n/10;
        }


        if(duplicate == sum){
            System.out.println("The given number is an armstrong number ");

        }
        else System.out.println("The given number is not an armstrong number");

        System.out.println(sum );
    }

}
