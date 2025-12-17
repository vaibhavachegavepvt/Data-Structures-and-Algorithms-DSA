# 169. Majority Element

# Given an array nums of size n, return the majority element.

# The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

# Example 1:

# Input: nums = [3,2,3]
# Output: 3
# Example 2:

# Input: nums = [2,2,1,1,1,2,2]
# Output: 2
 

# Constraints:

# n == nums.length
# 1 <= n <= 5 * 104
# -109 <= nums[i] <= 109
# The input is generated such that a majority element will exist in the array.
 

# Follow-up: Could you solve the problem in linear time and in O(1) space?


# All other ways to solve-pending

# Optimal Solution
# Boyer-Moore Majority Voting Algorithm
# Reference: https://www.geeksforgeeks.org/theory-of-computation/boyer-moore-majority-voting-algorithm/


class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        candidate = -1
        votes=0

        for i in range(len(nums)):
            if votes == 0:
                candidate = nums[i]
                votes = 1
            else:
                if nums[i] == candidate:
                    votes+=1
                else:
                    votes-=1
        
        count = 0
        for i in range(len(nums)):
            if nums[i] == candidate:
                count+=1
        
        if count > len(nums) // 2:
            return candidate
        else:
            return -1
