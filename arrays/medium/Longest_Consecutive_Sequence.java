package arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {

    static public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int lcs = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (Integer i : set) {
            if (set.contains(i - 1)) {
                continue;
            } else {
                lcs = 1;
                int k = i;
                while (set.contains(k + 1)) {
                    k++;
                    lcs++;
                }
                max = Math.max(lcs, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
