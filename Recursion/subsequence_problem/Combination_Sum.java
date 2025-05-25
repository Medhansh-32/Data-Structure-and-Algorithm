package Recursion.subsequence_problem;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {


    static List<List<Integer>> ans = new ArrayList<>();

    public  static void backtrack(int[] candidates, int target, List<Integer> current, int sum, int index) {
        if (sum == target) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (sum > target || index == candidates.length) {
            return;
        }


        current.add(candidates[index]);
        backtrack(candidates, target, current, sum + candidates[index], index);
        current.remove(current.size() - 1);

        backtrack(candidates, target, current, sum, index + 1);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, new ArrayList<>(), 0, 0);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{1,2,4,2,6},5));
    }
}
