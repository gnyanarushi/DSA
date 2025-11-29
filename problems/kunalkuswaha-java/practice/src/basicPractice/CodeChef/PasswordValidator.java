package basicPractice.CodeChef;
import java.util.Scanner;
public class PasswordValidator {
    public static void main(String[] args) {
        String input = "#cookOff#P1";
        int hasCapitalLetter = 0 ;
        int hasSmallLetter = 0;
        int hasSpecialCharacter = 0;
        int hasNumber = 0;
        String specialCharacter = "?&%#@";

        for(int i = 0 ; i < input.length() ; i++ ){
            char c = input.charAt(i);
            if(Character.isUpperCase(c)){
                hasCapitalLetter ++;
            } else if (Character.isLowerCase(c)) {
                hasSmallLetter++;
            }
            else if(Character.isDigit(c)){
                if(i > 0 && i <= 9){
                    hasNumber++;
                }
            }
            else if(c == '@' || c == '?' || c == '#' || c == '%' || c == '&'){
                hasSpecialCharacter++;

            }

        }

        if(
                hasNumber > 0 &&
                        hasCapitalLetter > 0 &&
                         hasSpecialCharacter > 0 &&
                            hasSmallLetter > 0 && input.length() > 10
        ){
            System.out.println("Yes");
        }
        else
            System.out.println("No");




    }
}
