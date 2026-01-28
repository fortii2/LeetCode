/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

import java.util.*;
import java.util.stream.Collectors;

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triples = new ArrayList<>();

        Map<Integer, List<List<Integer>>> twoSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<List<Integer>> temp = twoSum.getOrDefault(nums[i] + nums[j], new ArrayList<>());

                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(j);

                temp.add(pair);
                twoSum.put(nums[i] + nums[j], temp);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];

            if (twoSum.containsKey(target)) {
                List<List<Integer>> values = twoSum.get(target);

                for (List<Integer> pair : values) {
                    if (i != pair.getFirst() && i != pair.getLast()) {
                        int[] cur = new int[] { nums[pair.getFirst()], nums[pair.getLast()], nums[i] };
                        Arrays.sort(cur);
                        triples.add(Arrays.stream(cur)
                                .boxed()
                                .collect(Collectors.toList()));
                    }
                }
            }
        }

        return triples.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
// @lc code=end
