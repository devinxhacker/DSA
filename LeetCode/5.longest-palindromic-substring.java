/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n==1) return s;
        if(n==2) {
            if(s.charAt(0) == s.charAt(1)){
                return s;
            }
            else return s.substring(0,1);
        }
        String longestPalindrome = "";
        for(int i=0; i<n; i++){
            System.out.println("Temp: " + longestPalindrome + " at i = " + i);
            int left = (i-1 > 0) ? i-1: 0;
            int right = (i+1 < n)? i+1: n-1;
            System.out.println("Left: " + left + " Right: " + right);
            while(s.charAt(i) == s.charAt(left)){
                String sub = s.substring(left, i+1);
                if(longestPalindrome.length() < sub.length()){
                    longestPalindrome = sub;
                }
                if(left-1>0) left--;
                else break;
            }
            while(s.charAt(i) == s.charAt(right)){
                String sub = s.substring(i, right+1);
                if(longestPalindrome.length() < sub.length()){
                    longestPalindrome = sub;
                }
                if(right+1<n) right++;
                else break;
            }
            while(s.charAt(left) == s.charAt(right)){
                System.out.println("Both side checker: " + left + ", " + right);
                String sub = s.substring(left, right+1);
                if(longestPalindrome.length() < sub.length()){
                    longestPalindrome = sub;
                }
                if(left-1>0 && right+1<n){
                    left--;
                    right++;
                }
                else break;
            }
        }
        if(longestPalindrome.length() == 0){
            return s.substring(0, 1);
        }
        return longestPalindrome;
    }
}
// @lc code=end

