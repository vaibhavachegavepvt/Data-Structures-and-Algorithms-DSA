/*
 * Problem: Remove Duplicates from Sorted Array
 * LeetCode: 26
 *
 * Given a sorted integer array nums, remove the duplicates in-place
 * such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 *
 * Return the number of unique elements (k).
 *
 * Note:
 * - Do not allocate extra space for another array.
 * - Modify the input array in-place with O(1) extra memory.
 *
 * Example:
 * Input:  nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 *
 * Approach:
 * - Use Two Pointers.
 * - One pointer (rd) tracks the position of last unique element.
 * - Iterate through the array and copy unique elements forward.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeDuplicates(int[] nums) {

        // Pointer for the last unique element
        int rd = 0;

        // Start from second element
        for (int i = 1; i < nums.length; i++) {

            // If current element is different, move rd and update value
            if (nums[rd] != nums[i]) {
                rd++;
                nums[rd] = nums[i];
            }
        }

        // Number of unique elements
        return rd + 1;
    }
}
