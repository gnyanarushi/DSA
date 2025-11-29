import java.util.*;

public class BeautifulXOR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int testcase = 0; testcase < testcases; testcase++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            if (isSmaller(a, b)) {
                System.out.println(-1);
            } else {

                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 31; i >= 0; i--) {
                    if ((a & (1 << i)) != (b & (1 << i))) {
                        arr.add((1 << i));
                    }
                }
                for (int i : arr) {
                    a ^= i;
                }
                System.out.println(arr.size());
                for (int i : arr)
                    System.out.print(i + " ");
                System.out.println();
            }
            sc.close();
        }
    }

    public static boolean isSmaller(int a, int b) {
        for (int i = 31; i >= 0; i--) {
            if (((a & (1 << i)) == 0) && ((b & (1 << i)) != 0))
                return true;

            if ((a & (1 << i)) != 0)
                return false;
        }
        return false;
    }

}