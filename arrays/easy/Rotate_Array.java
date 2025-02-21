package arrays.easy;

import java.util.Arrays;

public class Rotate_Array {
    public static void reverse(int arr[], int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length; //if rotations are more than length of array

        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);

    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        Arrays.stream(arr).forEach(x -> System.out.println(x));
    }
}
