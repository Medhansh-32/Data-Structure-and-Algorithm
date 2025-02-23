package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class Subarry_Sum_K {

    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1);
        for (int i = 0; i < n; i++) {

            preSum += arr[i];
            if(mpp.containsKey(preSum-k)){
                cnt+=mpp.get(preSum-k);
            }

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {

        System.out.println(findAllSubarraysWithGivenSum(new int[]{10,5,2,7,1,5},15));
        System.out.println(findAllSubarraysWithGivenSum(new int[]{3, 4, -7, 1, 3, 3, 1, -4}, 7));
        System.out.println(findAllSubarraysWithGivenSum(new int[]{1,2,3,-3,1,1,1,4,2,-3}, 3));

    }
}
