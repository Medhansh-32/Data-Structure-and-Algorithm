package binary_search.binary_search_1D_array;

public class Single_Element_Sorted_Array {

    static  public int singleNonDuplicate(int[] nums) {

        if(nums.length==1) return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length-1];

        int i = 1, j = nums.length - 2;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];

            if (mid % 2 == 0 && nums[mid] == nums[mid + 1] || mid % 2 == 1 && nums[mid] == nums[mid - 1]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        System.out.println("Single element in given array is : "+singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }
}
