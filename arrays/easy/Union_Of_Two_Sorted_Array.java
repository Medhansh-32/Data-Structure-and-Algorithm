package arrays.easy;

import java.util.ArrayList;

public class Union_Of_Two_Sorted_Array {

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int s = 0;
        int e = 0;
        if (a[0] < b[0]) {
            ans.add(a[0]);
            s++;

        } else if (a[0] > b[0]) {
            ans.add(b[0]);
            e++;
        } else {
            ans.add(a[0]);
            s++;
            e++;
        }
        while (s < a.length && e < b.length) {
            if (a[s] > b[e]) {
                if (ans.size() != 0 && ans.get(ans.size() - 1) < b[e]) {
                    ans.add(b[e]);
                }
                e++;
            } else if (a[s] < b[e]) {
                if (ans.size() != 0 && ans.get(ans.size() - 1) < a[s]) {
                    ans.add(a[s]);
                }
                s++;

            } else {
                if (ans.size() != 0 && ans.get(ans.size() - 1) < b[e]) {
                    ans.add(b[e]);
                }

                s++;
                e++;
            }
        }
        while (s < a.length) {
            if (ans.size() != 0 && ans.get(ans.size() - 1) < a[s]) {
                ans.add(a[s]);
            }
            s++;
        }
        while (e < b.length) {
            if (ans.size() != 0 && ans.get(ans.size() - 1) < b[e]) {
                ans.add(b[e]);
            }
            e++;
        }
        return ans;
    }

    public static void main(String[] args) {
        findUnion(new int[]{1, 2, 3, 4, 6}, new int[]{1, 2, 5, 6, 7}).stream().forEach(x -> System.out.print(x + " "));
    }
}
