package binary_search.binary_search_1D_array;

public class Binary_Search_Rotated_Array_2 {
    public static boolean searchInARotatedSortedArrayII(int []arr, int k) {
        int n = arr.length; // size of the array.
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) return true;


            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    //element exists:
                    high = mid - 1;
                } else {

                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= k && k <= arr[high]) {

                    low = mid + 1;
                } else {

                    high = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;
        boolean ans = searchInARotatedSortedArrayII(arr, k);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
