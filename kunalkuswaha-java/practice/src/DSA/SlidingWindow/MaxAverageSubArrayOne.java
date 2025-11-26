package DSA.SlidingWindow;

public class MaxAverageSubArrayOne {
    static void main() {

        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 4;
            int sum = 0;
            double maxAverage = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }

            maxAverage = (double) sum / k;
            int start = 0;
            for (int end = k; end < arr.length; end++) {
                sum += arr[end];
                sum -= arr[start];
                start++;
                double temp = (double) sum / k;
                maxAverage = Math.max(temp, maxAverage);
            }


        System.out.println(maxAverage);
    }
}
