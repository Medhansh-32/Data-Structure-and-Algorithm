package arrays.easy;

public class Missing_Number {

      public static int missingNumber(int[] nums) {
        int missingNumber=(nums.length*(nums.length+1))/2;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return missingNumber-sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0,1,2,3,4,6}));
    }
}
