package arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        map.clear();
        return null;
    }

    public static void main(String[] args) {

        Arrays.stream(twoSum(new int[]{1, 4, 2, 7, 8}, 6)).forEach(z -> System.out.print(z + ","));

    }
}
