package august.aug9;

public class SkipACharacter {

    public static void main(String[] args) {

    skipAcharacter("" , "baccad");

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
}
