package jul.jul24;

import java.util.Arrays;
import java.util.Scanner;

public class Dp {
     int feb(int a){
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        int val=feb(a-1);
        int val2=feb(a-2);
        return val+val2;


    }

}
