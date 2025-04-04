package binary_search.binary_search_on_ans;

public class Smallest_Divisor {

    public static int getSum(int nums[],double divisor){
        double sum=0;
        for(int i=0;i<nums.length;i++){
            double div=Math.ceil(nums[i]/divisor);
            sum+=div;
        }

        return (int)sum;
    }

    public static int max(int nums[]){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
        }
        return max;
    }

    public static int smallestDivisor(int[] nums, int threshold) {

        int start=1;
        int end=max(nums);
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid=(start+end)/2;
            int div=getSum(nums,mid);

            if(div>threshold){
                start=mid+1;
            }else{
                ans=Math.min(mid,ans);
                end=mid-1;
            }

        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;
        int ans = smallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + ans);
    }
}
