import java.util.Arrays;

/*
 * Problem: Merge Sorted Array (LeetCode 88)
 * Approach: Copy elements from nums2 to nums1, then sort nums1
 *
 * Time Complexity: O((m + n) log(m + n))
 * Space Complexity: O(1)  (in-place, ignoring sort internals)
 */
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Copy all elements of nums2 into the empty part of nums1
        for (int j = 0, i = m; j < n; j++, i++) {
            nums1[i] = nums2[j];
        }

        // Sort the merged array
        // Arrays.sort() uses Dual-Pivot QuickSort for primitive arrays
        Arrays.sort(nums1);
    }
}


/*

 * Approach: Two Pointers (Merge from the end)
 
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // Pointer for last valid element in nums1
        int i = m - 1;

        // Pointer for last element in nums2
        int j = n - 1;

        // Pointer for last index of nums1 (total size = m + n)
        int k = m + n - 1;

        // Merge arrays from the end to avoid overwriting elements
        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }
    }
}
