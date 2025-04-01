package binary_search.binary_search_on_ans;

public class Koko_Banana {

    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;

        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public  static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        int n = v.length;

        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalH;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = findMax(piles);

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(piles, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minEatingSpeed(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
