package binary_search.binary_search_on_ans;

public class Shipping_Capacity {

    public static int days(int weights[], int capacity) {
        int weight = 0;
        int day = 1;

        for (int i = 0; i < weights.length; i++) {

            weight += weights[i];

            if (weight > capacity) {
                day++;
                weight = weights[i];
            }

        }
        return day;
    }


    public static int shipWithinDays(int[] weights, int days) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) max = weights[i];
            sum += weights[i];
        }
        int start = max, end = sum;
        int ans = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (days(weights, mid) > days) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = Math.min(ans, mid);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = shipWithinDays(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
