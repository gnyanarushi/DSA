package Day2;

public class ReverseString {

    public  static void main(String[] args ){
        String string = "rishi";

        for(int i = string.length() -  1 ; i >= 0 ; i-- ) {
            System.out.print(string.charAt(i));
        }
        System.out.println();
    }
}
