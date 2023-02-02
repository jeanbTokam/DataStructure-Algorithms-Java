package LeetCode;
// Two Sum
// Algorithm: Brute Force
//The brute force approach is simple.
// Loop through each element x
// and find if there is another value that equals to target−xtarget - xtarget−x.


import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int found = target - nums[i];
            if (map.containsKey(found)) {
                return new int []{map.get(found), i};
            }
            map.put(nums[i], i);

        }
        return null;
    }
}
//    Complexity Analysis

  //  Time complexity: O(n). We traverse the list containing nnn elements only once. Each lookup in the table costs only O(1)O(1)O(1) time.

   //  Space complexity: O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nnn elements.

