package Recursion.subsequence_problem;

import java.util.ArrayList;
import java.util.List;

public class Power_Set {


        public  static List<List<Integer>> ans = new ArrayList<>();

        private static void sub(int nums[],int i,List<Integer> subset){
            if(i==nums.length){
                ans.add(subset);
                return;
            }

            sub(nums,i+1,new ArrayList<>(subset));
            subset.add(nums[i]);
            sub(nums,i+1,new ArrayList<>(subset));

        }
        public static List<List<Integer>> subsets(int[] nums) {
            List<Integer> temp=new ArrayList<>();
            sub(nums,0,temp);
            return ans;
        }

    public static void main(String[] args) {

        System.out.println(subsets(new int[]{1,5,2,5}));


    }

}

