package Recursion.subsequence_problem;

import java.util.*;

public class SubsetSum {
    public static List<Integer> ans=new ArrayList<>();

    public static void subsetSum(int arr[], int i,int sum) {

        if(i==arr.length){
            ans.add(sum);
            return;

        }
        subsetSum(arr,i+1,sum+arr[i]);
        subsetSum(arr,i+1,sum);
    }


    public static List<Integer> subsetSum(int arr[]){
        subsetSum(arr,0,0);
        Collections.sort(ans);
         return ans;
    }
    public static void main(String[] args) {

        int arr[]={3,1,2};
        System.out.println(subsetSum(arr));
    }


}
