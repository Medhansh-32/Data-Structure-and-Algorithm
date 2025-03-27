package binary_search.binary_search_1D_array;

import java.util.List;

public class Number_Of_Rotations_In_Array {

    public static int findKRotation(List<Integer> arr) {
        int i = 0, j = arr.size() - 1;
        int min = Integer.MAX_VALUE;
        int value = 0;
        int sampleMin = Integer.MAX_VALUE;
        int curMid = 0;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) >= arr.get(i)) {
                curMid = arr.get(i);
                value = i;
                i = mid + 1;

            } else {
                curMid = arr.get(mid);
                value = mid;
                j = mid - 1;
            }

            if (curMid < min) {
                sampleMin = value;
                min = curMid;
            }
        }

        return sampleMin;
    }

    public static void main(String[] args) {
        System.out.println("No. of rotations in given array is : " + findKRotation(List.of(4, 5, 1, 2, 3)));
    }
}
