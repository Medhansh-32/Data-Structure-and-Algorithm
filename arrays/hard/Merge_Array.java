package arrays.hard;

import java.util.Arrays;

public class Merge_Array {
    static   public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        int org[]=new int[]{1,2,3,0,0,0};
        merge(org,3,new int[]{2,5,6},3);
        Arrays.stream(org).forEach(x-> System.out.println(x+" "));
    }
}
