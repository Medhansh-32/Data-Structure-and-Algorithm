package arrays.medium;

import java.util.Arrays;

public class Next_Permutation {

    public static void rev(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void  nextPermutation(int[] nums) {
        int i = -1;
        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i == -1) {
            rev(nums, i + 1, nums.length - 1);
        } else {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    swap(nums, i, j);
                    break;
                }
            }
            rev(nums, i + 1, nums.length - 1);
        }

    }
        public static void main(String[] args) {
        int arr[]={2,1,5,4,3,0,0};
        nextPermutation(arr);
        Arrays.stream(arr).forEach(x-> System.out.print(x+" "));
    }
}
