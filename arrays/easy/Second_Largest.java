package arrays.easy;

public class Second_Largest {

    public static int getSecondLargest(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = (arr[i] >= min) ? arr[i] : min;
        }

        int secondLargest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            secondLargest = Math.min(secondLargest, min - arr[i]);
        }
        return secondLargest == 0 || (secondLargest) == Integer.MAX_VALUE ? -1 : min - secondLargest;
    }


    public static void main(String[] args) {
        System.out.println(getSecondLargest(new int[]{1, 2, 3, 4, 5}));
    }
}
