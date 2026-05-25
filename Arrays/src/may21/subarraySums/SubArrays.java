package may21.subarraySums;

public class SubArrays {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4 };
        int max = Integer.MIN_VALUE;
        int sum = 0 ;
        for(int i = 0; i < arr.length ; i++){

            sum += arr[i];

            if(sum >  max){
                max = sum ;

            }

            if(sum < 0 ){
                sum = 0 ;
            }
        }
        System.out.println(max);



    }
}





/*

// these procedure is giving me the complexity of the big  O of n cube
int max = Integer.MIN_VALUE;
        for(int i  = 0 ; i < arr.length; i++ ){
            for(int j = i ; j < arr.length; j++){
                int sum = 0;
                for(int k = i ; k  <= j ; k++){
                    sum+= arr[k];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }



//        this is the better approach to than the big O of n square;
         for(int i = 0; i < arr.length ; i++ ){
            int sum = 0;
            for(int j =i ; j < arr.length ; j++ ){
                sum += arr[j];
                if(sum > max){
                    max = sum;
                }
            }
        }








* */