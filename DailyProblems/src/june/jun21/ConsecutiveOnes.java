package june.jun21;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1 , 1, 0 , 1 ,1, 1, 0 , 1, 1 };

        ConsecutiveOnes consecutiveOnes = new ConsecutiveOnes();

        int maxOnes = consecutiveOnes.maxOnes(arr);

        System.out.println(maxOnes);
    }

    public int maxOnes(int[] nums ){
        int maxCount = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                count++;
                maxCount = Math.max(count , maxCount);

            }
            else {
                count = 0 ;
            }

        }

        return maxCount ;
    }
}
