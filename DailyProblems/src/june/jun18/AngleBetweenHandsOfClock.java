package june.jun18;

import java.util.Scanner;

public class AngleBetweenHandsOfClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the hours : " );
        int hours = sc.nextInt();
        System.out.print("Enter  the minutes : " );
        int minutes = sc.nextInt();

        AngleBetweenHandsOfClock angleBetweenHandsOfClock = new AngleBetweenHandsOfClock();

        angleBetweenHandsOfClock.angleClock(hours , minutes);

    }


    public double angleClock(int hour, int minutes) {
        double ans = Math.abs(30 * hour - 5.5 * minutes) ;
        return Math.min(ans, 360 - ans);

    }
}
