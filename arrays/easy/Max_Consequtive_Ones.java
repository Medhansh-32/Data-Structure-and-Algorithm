package arrays.easy;

public class Max_Consequtive_Ones {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int presentCount=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                presentCount++;
            }else{
                maxCount=Math.max(presentCount,maxCount);
                presentCount=0;
            }

        }
        return Math.max(maxCount,presentCount);
    }
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,1,0,1,0,1,1}));
    }
}
