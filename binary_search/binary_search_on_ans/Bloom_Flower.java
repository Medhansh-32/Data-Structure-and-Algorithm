package binary_search.binary_search_on_ans;

import java.util.Arrays;

public class Bloom_Flower {

    public static int min(int[] bloomDay) {
        return Arrays.stream(bloomDay)
                .min()
                .orElseThrow();
    }

    public static int max(int[] bloomDay) {
        return Arrays.stream(bloomDay)
                .max()
                .orElseThrow();
    }

    public  static int check(int[] bloomday, int day, int k, int m) {
        int total = k * m;
        int flower = 0;
        int counter = 0;

        for (int i = 0; i < bloomday.length; i++) {
            if (bloomday[i] <= day) {
                counter++;
            }else{
                counter=counter/k;
            }
            if(counter==k) {flower++;
                counter=0;
            }
        }



        if (flower > m) {
            return 0;
        } else if (flower < m) {
            return -1;
        } else {
            return day;
        }
    }

    public static int minDays(int[] bloomDay, int m, int k) {

        if (m * k > bloomDay.length)
            return -1;

        int start = min(bloomDay), end = max(bloomDay);

        int ans = Integer.MAX_VALUE;
        if(start==end) return start;
        while (start <= end) {
            int mid = (start + end) / 2;
            int day = check(bloomDay, mid, k, m);

            if (day == -1) {
                start = mid + 1;
            } else if (day == 0) {
                end = mid - 1;
            } else {

                ans = Math.min(ans, day);

                end = mid - 1;
            }

        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public static void main(String[] args) {
        System.out.println("Minimum days to wait for bouquets : "+minDays(new int[]{1,10,3,10,2},3,1));
    }
}
