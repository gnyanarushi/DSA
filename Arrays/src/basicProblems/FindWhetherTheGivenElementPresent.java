package basicProblems;

public class FindWhetherTheGivenElementPresent {

    //    Check if a given element exists in the array.
    //    Count the frequency of a given element in the array.
    public static void main(String[] args) {

        int[] arr = {23 , 34, 12, 45, 67, 45};

        int search = 45;
        int flag = 0 ;
        int count = 0;

        for(int i  = 0; i < arr.length ; i++){
            if(arr[i] == search){
                flag = 1;
                break;
            }

        }

        if(flag == 1) System.out.println("The given element is present in the array");
        else System.out.println("The given element is not present in the array");


        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == search){
                count++;
            }
        }

        System.out.println("The frequency of the element is : "+ count);

    }
}
