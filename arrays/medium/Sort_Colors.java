package arrays.medium;

import java.util.Arrays;

public class Sort_Colors {
    public static void swap(int nums[],int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static int[] sortColors(int[] nums) {
        int i=0,j=0,k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                swap(nums,i,j);
                i++;
                j++;
            }else if(nums[j]==2){
                swap(nums,j,k);
                k--;
            }else{
                j++;
            }
        }
return nums;
    }

    public static void main(String[] args) {
        Arrays.stream(sortColors(new int[]{1,1,0,2,0})).forEach(x-> System.out.print(x+" "));
    }
}
