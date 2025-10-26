package main;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        /**
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (set.size() < i + 1) {
                return true;
            }
        }
         */

        // enhanced solution. Use add()'s return value to indicate duplicated or not
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate217 clazz = new ContainsDuplicate217();
        int[] ints = new int[]{1, 2, 3, 3};
        System.out.println(clazz.containsDuplicate(ints));
    }
}