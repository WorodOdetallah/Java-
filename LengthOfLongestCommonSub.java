/**
 * Solution to find the length of the longest common substring between two strings.
 *
 * Given two strings str1 and str2, this method returns the length of the 
 * longest common substring. A common substring is a sequence of characters
 * that appears in both strings in the same order.
 *
 * Time Complexity: O(n * m) where n and m are the lengths of str1 and str2.
 /**
 */
class Solution {

     * Method to find the length of the longest common substring between two strings.
     *
     * @param str1 First input string.
     * @param str2 Second input string.
     * @return The length of the longest common substring.
     
    public int longestCommonSubstr(String str1, String str2) {
        int n = str1.length();  
        int m = str2.length();  
        
     
        // dp[i][j] will store the length of the longest common substring ending with str1[i-1] and str2[j-1].
        int[][] dp = new int[n+1][m+1];
        int maxLength = 0;  // To store the length of the longest common substring
        
        // Build the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If characters match, update the DP table
                if (str1.charAt(i-1) == str2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;  
                    maxLength = Math.max(maxLength, dp[i][j]);  
                } else {
                    dp[i][j] = 0;  // No match, reset to 0
                }
            }
        }
        
        return maxLength;  
    }
}
