package binary_search.binary_search_1D_array;

import java.util.Arrays;
import java.util.List;

public class Upper_And_Lower_Bound {
    public static int[] getFloorAndCeil(int x, int[] arr) {

        //   Arrays.sort(arr);
        //     int i=0,j=arr.length-1,ans=-1;


        //      while(i<=j){
        //         int mid=(i+j)/2;
        //         if(arr[mid]<=x){
        //             ans=mid;
        //             i=mid+1;
        //         }else{
        //             j=mid-1;
        //         }
        //      }
        //     int floor=ans;
        //     i=0;j=arr.length-1;ans=-1;

        //     while(i<=j){
        //         int mid=(i+j)/2;
        //         if(arr[mid]>=x){
        //             j=mid-1;
        //             ans=mid;
        //         }else{
        //             i=mid+1;
        //         }
        //     }
        //     int ceil=ans;

        //   return new int[]{floor<0?-1:arr[floor],ceil<0?-1:arr[ceil]};

        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x) {
                floor = Math.max(floor, arr[i]);
            } else if (arr[i] > x) {
                ceil = Math.min(ceil, arr[i]);
            } else {
                return new int[]{x, x};
            }


        }
        return new int[]{floor == Integer.MIN_VALUE ? -1 : floor, ceil == Integer.MAX_VALUE ? -1 : ceil};
    }

    public static void main(String[] args) {
        var ans = getFloorAndCeil(7, new int[]{5, 6, 8, 9, 6, 5, 5, 6});
        System.out.print("Upper and Lower bound of given array : ");
        Arrays.stream(ans).forEach(x -> System.out.print(" " + x));

    }
}
