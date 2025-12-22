/*
 * Problem: Remove Element (LeetCode 27)
 *
 * Given an integer array nums and an integer val, remove all occurrences
 * of val in-place. The relative order of the elements may be changed.
 *
 * Return the number of elements in nums which are not equal to val.
 * The first k elements of nums should contain the result.
 *
 * Approach: Two Pointers
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class Solution {

    public int removeElement(int[] nums, int val) {

        // Pointer to track the position for non-val elements
        int i = 0;

        // Traverse the array using pointer j
        for (int j = 0; j < nums.length; j++) {

            // If current element is not equal to val,
            // place it at index i and move i forward
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        // i represents the count of elements not equal to val
        return i;
    }
}
