package june.jun22;

import java.util.HashMap;

public class FindTheSingleNumberOtherTwice {
    public static void main(String[] args) {

        int[] arr =  {4,1,2,1,2};

        FindTheSingleNumberOtherTwice findTheSingleNumberOtherTwice = new FindTheSingleNumberOtherTwice();
        int ans = findTheSingleNumberOtherTwice.singleNumber(arr);

        System.out.println(ans);
    }

    public int singleNumber(int[] arr) {
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for (int i : arr) {
            if (numbers.containsKey(i)) {
                numbers.put(i, numbers.get(i) + 1);
            } else {
                numbers.put(i, 1);
            }
        }

        for (int num : numbers.keySet()) {
            if (numbers.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
}
