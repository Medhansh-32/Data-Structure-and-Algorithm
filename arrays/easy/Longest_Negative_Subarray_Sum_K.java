package arrays.easy;

import java.util.*;

public class Longest_Negative_Subarray_Sum_K{

    public static void print(int arr[],int a,int b){
        for(int i=a;i<=b;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int longestSubarraySum(int arr[], int k) {

        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum==k){
                maxLen = Math.max(maxLen,i+1);
                print(arr,0,i);
            }
            if (map.containsKey(sum - k)) {
                maxLen=Math.max(maxLen,i-(map.get(sum-k)));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
    return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestSubarraySum(new int[]{1,2,3,1,1,1,0,4,2}, 6));
        System.out.println(longestSubarraySum(new int[]{-1, 2, 3, -3, 1, 2, 4, -2}, 5));
    }
}
