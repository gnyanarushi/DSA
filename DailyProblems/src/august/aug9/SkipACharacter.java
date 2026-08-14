package august.aug9;

public class SkipACharacter {

    public static void main(String[] args) {

        System.out.println(skipAcharacter("baccad"));
        System.out.println(skipApple("bacapplecad"));
        System.out.println(skipAppNotApple("bacapplcad"));


    }

    public  static  void skipAcharacter(String processed , String unProcessed){
         if(unProcessed.isEmpty()){
             System.out.println(processed);
             return ;
         }

         char c = unProcessed.charAt(0);

         if('a' == c ){
              skipAcharacter(processed , unProcessed.substring(1));
         }
         else {
             skipAcharacter(processed + c , unProcessed.substring(1));
         }
    }


    public static  String skipAcharacter(String up){
        if(up.isEmpty()){
            return "";
        }

        char c = up.charAt(0);

        if(c == 'a')
            return skipAcharacter(up.substring(1));
        else
            return c + skipAcharacter(up.substring(1));
    }



    public static  String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));

        }
        else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }


    public static  String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));

        }
        else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
