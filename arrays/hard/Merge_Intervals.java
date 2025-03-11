package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    static public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }


        return merged.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        Arrays.stream(merge(new int[][]{ {1, 3}, {2, 6}, {8, 10}, {15, 18} }
        )).forEach(x->{
            Arrays.stream(x).forEach(y-> {System.out.print(y+" ");
            });
            System.out.println();
        });
    }

}

