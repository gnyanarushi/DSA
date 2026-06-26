package june.jun17;

public class ProcessStringWithSpecialOperations {
    public static void main(String[] args) {

        String s = "%#bz%xum##i##vzo#pwc*#dkwbh####%uf%s*%cgppqhqa%h#l##o%ij%%cz%iga##e###u%#e####jfwx##%%*x%m*%#";

        ProcessStringWithSpecialOperations processStringWithSpecialOperations = new ProcessStringWithSpecialOperations();


    }


    public char processStr(String s , long k ){


        return '.';
    }




















    public char processStr_BruteForce(String s, long k) {

//a#b%*

        StringBuilder res = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '*' || s.charAt(i) == '#' ||s.charAt(i)=='%'){
                if(s.charAt(i) == '*'){
                    if(!res.isEmpty()){
                        res.deleteCharAt(res.length() - 1);
                    }
                }
                if(s.charAt(i) == '#'){
                    res.append(res);
                }
                if(s.charAt(i) == '%'){
                    res.reverse();
                }
            }

            else {
                res.append(s.charAt(i));
            }

        }

        return ( k >= res.length()) ? '.' : res.charAt((int) k);


    }
}
