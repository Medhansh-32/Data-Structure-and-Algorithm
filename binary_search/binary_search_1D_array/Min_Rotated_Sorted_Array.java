package binary_search.binary_search_1D_array;

public class Min_Rotated_Sorted_Array {
    static   public int findMin(int[] nums) {
        int i=0,j=nums.length-1;
        int min=Integer.MAX_VALUE;
        int temp=Integer.MIN_VALUE;
        while(i<=j){

            int mid=(i+j)/2;
            if(nums[mid]>=nums[i]){
                temp=nums[i];
                i=mid+1;
            }else{
                temp=nums[mid];
                j=mid-1;
            }
            min=Math.min(min,temp);
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Minimum Value in given array is : "+findMin(new int[]{4,5,6,0,1,2,3}));
    }
}
