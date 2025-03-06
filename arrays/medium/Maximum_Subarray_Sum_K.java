package arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class Maximum_Subarray_Sum_K {

    static  public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        int sum=0,sub=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){

            sum+=nums[i];
            if(map.containsKey(sum-k)){
                sub+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return sub;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
}
