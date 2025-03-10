package arrays.hard;

public class Four_Sum {
    import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Arrays.sort(nums);  // Sort the array
            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;  // Skip duplicates for i

                for (int j = i + 1; j < nums.length; j++) {
                    if (j > 0 && nums[j] == nums[j - 1]) continue;  // Skip duplicates for j

                    int k = j + 1;
                    int l = nums.length - 1;

                    while (k < l) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];

                        if (sum < target) {
                            k++;  // Need a larger sum, so move k to the right
                        } else if (sum > target) {
                            l--;  // Need a smaller sum, so move l to the left
                        } else {
                            // Found a valid quadruplet
                            ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                            k++;
                            l--;

                            // Skip duplicates for k and l after finding a valid quadruplet
                            while (k < l && nums[k] == nums[k - 1]) k++;
                            while (k < l && nums[l] == nums[l + 1]) l--;
                        }
                    }
                }
            }

            return ans;
        }
    }

}
