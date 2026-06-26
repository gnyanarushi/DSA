package june.jun22;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5};
        FindMissingNumber findMissingNumber = new FindMissingNumber();
         int ans = findMissingNumber.findMissingNumber(arr);

        System.out.println(ans);
    }


    public int  findMissingNumber(int[] arr ){



        for(int i = 1 ; i <= arr.length + 1 ; i++){
            boolean found = false ;
            for(int j = 0 ;j < arr.length ; j++){
                if(arr[j] == i ){
                     found = true;
                     break;
                }


            }

            if(!found){
                return i ;
            }


        }
        return - 1 ;
    }
}
