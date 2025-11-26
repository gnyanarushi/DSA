package basicPractice.CodeChef;

public class SnakePrecision {
    public static void main(String[] args) {
        String str = "H..T..H";
        String dotremovedString = "";
        for(int i = 0; i < str.length() ; i++){
            if(str.charAt(i) != '.')
            {
                dotremovedString += str.charAt(i);
            }
        }
        boolean isValid = true;
        if(dotremovedString.length() %2 ==  0 ){
            for(int i = 0 ; i < dotremovedString.length() ; i+=2) {
                if (dotremovedString.charAt(0) != 'H' && dotremovedString.charAt(dotremovedString.length() - 1) != 'T') {
                    isValid = false;
                    break;
                }

                if(dotremovedString.charAt(i) == 'H' && dotremovedString.charAt(i+1) == 'T' ){
                    isValid = true;
                }
                else{
                    isValid = false;
                    break;
                }
            }
        }
        else{
            isValid = false;
        }
        System.out.println(isValid ? "Valid" : "InValid");
    }
}
