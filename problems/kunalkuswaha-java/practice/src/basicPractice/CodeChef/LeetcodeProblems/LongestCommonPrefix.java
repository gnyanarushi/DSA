package basicPractice.CodeChef.LeetcodeProblems;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(findLongestCommonPrefix(strs , smallestLength(strs)));
    }

    public static String findLongestCommonPrefix(String[] strs, int  smallestLength) {
        String longestPrefix = "";
        String smallestString = getSmallestString(strs ,smallestLength);
        for (int i = 0; i < smallestLength; i++) {
            int count = 0 ;
            for (int j = 0; j < strs.length; j++) {
                if(smallestString.charAt(i) == strs[j].charAt(i)){
                    count++;
                }
                else break;
            }
            if(count == strs.length){
                longestPrefix = longestPrefix + smallestString.charAt(i);
            }
            else break;

        }
        return longestPrefix;

    }

    public static String getSmallestString(String[] strs, int smallestLength) {
        for(String str : strs){
            if(str.length() == smallestLength) {
                return str;
            }
        }
        return "";
    }


    public static int smallestLength(String[] strs) {
        int size = 200;
        for(String str : strs){
            if(str.length() < size){
                size = str.length();
            }
        }
        return size;
    }

}
