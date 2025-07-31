/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxSub = 0;
        int start = 0;
        int end = start+1;
        while(end<s.length()){
            String substr = s.substring(start, end);
            // System.out.println(substr);
            String cur = "" + s.charAt(end);
            if(substr.contains(cur)){
                maxSub = (maxSub<substr.length()) ? substr.length() : maxSub;
                start++;
            }
            end++;
        }
        return maxSub;
    }
}
// @lc code=end

