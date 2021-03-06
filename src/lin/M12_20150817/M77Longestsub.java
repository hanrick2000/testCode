package lin.M12_20150817;

/**
 * Created by Paul on 8/17/15.
 * http://www.cnblogs.com/yuzhangcmu/p/4199531.html
 * http://www.lintcode.com/en/problem/longest-common-subsequence/
 * http://buttercola.blogspot.com/2014/11/lintcode-longest-common-subsequence-lcs.html
 */
//Longest Common Subsequence
//
//        37% Accepted
//        Given two strings, find the longest common subsequence (LCS).
//
//        Your code should return the length of LCS.
//
//        Have you met this question in a real interview? Yes
//        Example
//        For "ABCD" and "EDCA", the LCS is "A" (or "D", "C"), return 1.
//
//        For "ABCD" and "EACB", the LCS is "AC", return 2.
//
//        Clarification
//        What's the definition of Longest Common Subsequence?
//
//        https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
//        http://baike.baidu.com/view/2020307.htm
public class M77Longestsub {
    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        if(A == null || A.length() == 0 || B == null || B.length() == 0) {
            return 0;
        }

        int[][] dp = new int[A.length()+1][B.length()+1];
        for(int i = 0; i < A.length()+1; i++) {
            dp[i][0] = 0;
        }

        for(int i = 0; i < B.length()+1; i++) {
            dp[0][i] = 0;
        }

        for(int i = 1; i< A.length()+1; i++) {
            for(int j = 1; j< B.length()+1; j++) {
                if(A.charAt(i-1) == B.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[A.length()][B.length()];
    }
}
