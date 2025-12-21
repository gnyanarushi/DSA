package Day2.rishi;

public class ReverseString {

    static void main() {

        String string = "rishi";

        for(int i = string.length() -  1 ; i >= 0 ; i-- ) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }
}
