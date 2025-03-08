package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    static  public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        int j=0,k=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;

            j=i+1;
            k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }else{
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j-1]==nums[j]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }

            }

        }
        return list;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-2,-2,-2,-1,-1,-1,0,0,0,2,2,2}).forEach(
                x-> System.out.println(x)
        );
    }
}
