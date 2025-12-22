import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Majority Element (LeetCode 169)
 *
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * Approach: HashMap (Frequency Counting)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
class Solution {

    public int majorityElement(int[] nums) {

        // HashMap to store frequency of each element
        Map<Integer, Integer> map = new HashMap<>();

        // Majority element must appear more than n / 2 times
        int threshold = nums.length / 2;

        // Count frequency of each number in the array
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the element whose frequency exceeds n / 2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > threshold) {
                return entry.getKey();
            }
        }

       
        return -1;
    }
}
