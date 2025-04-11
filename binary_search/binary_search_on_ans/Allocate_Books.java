package binary_search.binary_search_on_ans;

import java.util.*;

class Allocate_Books {

    public static int check(int nums[], int m, int pages) {

        //25, 46, 28, 49, 24

        int student = 1;
        int studentPages = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + studentPages <= pages) {
                studentPages += nums[i];
            } else {
                student++;

                studentPages = nums[i];
            }
        }

        return student;
    }

    public static int findPages(int[] nums, int m) {

        int start = Arrays.stream(nums).max().orElseThrow();
        int end = Arrays.stream(nums).sum();


        int ans=Integer.MAX_VALUE;
        while (start <= end) {

            int mid = (start + end) / 2;

            int temp = check(nums, m, mid);
            if (temp == m){
                ans=Math.min(ans,mid);
                end=mid-1;
            }else if (temp < m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Answer is : "+findPages(new int[]{25, 46, 28, 49, 24},4));
    }
}
