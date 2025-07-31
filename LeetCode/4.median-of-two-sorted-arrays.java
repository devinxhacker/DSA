/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArr = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArr, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArr, nums1.length, nums2.length);
        Arrays.sort(mergedArr);
        if(mergedArr.length%2==1){
            double ans = mergedArr[((mergedArr.length+1)/2)-1];
            return ans;
        }
        else{
            int x = mergedArr[(mergedArr.length/2)-1];
            int y = mergedArr[mergedArr.length/2];
            double ans = (x+y)/2;
            return ans;
        }
    }
}
// @lc code=end

