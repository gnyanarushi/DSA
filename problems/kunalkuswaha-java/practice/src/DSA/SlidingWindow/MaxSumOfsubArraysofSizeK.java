package DSA.SlidingWindow;
public class MaxSumOfsubArraysofSizeK {
     static void main() {
        int[] arr = {100, 200, 300, 400};
        int k =4;
        int sum = 0 , max = 0 ;
        for(int i = 0 ; i <k ; i++) {
            sum += arr[i];
        }
        max = sum ;
        int start = 0;
        for(int end = k ; end < arr.length ; end++){
            sum += arr[end];
            sum -= arr[start];
            start++;
            max = Math.max(sum , max);
        }
        System.out.println(max);
    }
}
