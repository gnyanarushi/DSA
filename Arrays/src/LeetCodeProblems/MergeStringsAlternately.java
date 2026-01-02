package LeetCodeProblems;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        String one = "abc";
        String two = "pqr";

        String mergedString = mergeAlternately(one , two);
        System.out.println(mergedString);
    }

    private static String mergeAlternately(String one , String two ){
        StringBuilder mergedString = new StringBuilder();


        // using the for loop

//        for(int i = 0 ;i < (one.length() +  two.length()); i++){
//            if(i  < one.length())
//                mergedString.append(one.charAt(i));
//            if(i < two.length())
//                mergedString.append(two.charAt(i));
//        }



        // using the while loop

        int i = 0 ;
        while(i < (one.length() + two.length())){

            if(i < one.length() )
                mergedString.append(one.charAt(i));
            if(i < two.length())
                mergedString.append(two.charAt(i));
            i++;

        }


        return mergedString.toString();

    }

}
