package binary_search.binary_search_1D_array;

public class Floor_Ceil_Sorted_Array {
    public static int[] getFloorAndCeil(int[] a, int x) {
        int i = 0, j = a.length - 1;

        int floor = Integer.MIN_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[mid] <= x) {
                if (floor <= a[mid]) floor = a[mid];
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        i = 0;
        j = a.length - 1;
        int ceil = Integer.MAX_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[mid] >= x) {
                if (ceil >= a[mid]) ceil = a[mid];
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return new int[]{floor == Integer.MIN_VALUE ? -1 : floor, ceil == Integer.MAX_VALUE ? -1 : ceil};
    }

    public static void main(String[] args) {
        var ans = getFloorAndCeil(new int[]{3, 4, 7, 8, 8, 10}, 6);
        System.out.println("Lower Bound : " + ans[0] + " Upper Bound : " + ans[1]);
    }
}
