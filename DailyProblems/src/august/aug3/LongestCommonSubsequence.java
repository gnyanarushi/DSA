package august.aug3;

public class LongestCommonSubsequence {

    public static  int lonestCommonSubSequence(String s1 , String s2){
        int max  = Integer.MIN_VALUE;

        int[][] dp = new int[s1.length() + 1 ][];

        return max;
    }
    public static void main(String[] args) {
        String s1 = "FOST";
        String s2 = "FORT";
        int max = lonestCommonSubSequence(s1 , s2) ;

        System.out.println("Longest Common Subsequence : "  + max);
    }

}
