package binary_search.binary_search_on_ans;

import java.util.Arrays;

public class Aggressive_Cows {

    public static int findDistance(int arr[], int cows, int dist) {
        int cowPlaced = 0;

        for (int i = 0; i < arr.length; i++) {
            if (cowPlaced == cows) {
                break;
            }

            if (i == 0 || arr[i] - arr[i - 1] >= dist) {
                cowPlaced++;
            }
        }
        return cowPlaced == cows ? 1 : -1;

    }


    public static int findMin(int arr[], int cows) {
        Arrays.sort(arr);
        int start = 1;
        int min = Arrays.stream(arr).min().orElseThrow();
        int max = Arrays.stream(arr).max().orElseThrow();

        int end = max - min;
        int mid = 0;
        while (start <= end) {

            mid = (end + start) / 2;
            if (findDistance(arr, cows, mid) == -1) {
                end = mid - 1;
            } else {

                start = mid + 1;
            }

        }
        return mid;
    }


    public static void main(String[] args) {

        System.out.println("Minimum distance between cows can be : "+findMin(new int[]{0, 3, 4, 9, 7, 10}, 4));

    }
}
