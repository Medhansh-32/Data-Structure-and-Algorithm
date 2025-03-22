package binary_search.binary_search_1D_array;

public class Min_Rotated_Sorted_Array {
    static   public int findMin(int[] nums) {

        int start=0,end=nums.length-1;
        while(start<end){
            int mid=(start+end)/2;


            if(nums[mid]<=nums[end]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        System.out.println("Minimum Value in given array is : "+findMin(new int[]{4,5,6,0,1,2,3}));
    }
}
