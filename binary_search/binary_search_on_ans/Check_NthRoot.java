package binary_search.binary_search_on_ans;

public class Check_NthRoot {

    public static int func(int dig, int n, int m) {

        int exp = dig;

        for (int i = 1; i < n; i++) {
            exp *= dig;

            if (exp > m) {
                return 1;
            }

        }
        if (exp < m) return -1;

        return 0;
    }

    public static int nthRoot(int n, int m) {
        int start = 1, end = m;


        while (start <= end) {

            int mid = (start + end) / 2;

            int data = func(mid, n, m);

            if (data == 0) return mid;

            if (data == 1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int n = 3, m = 64;
        System.out.println("""
                %d is the %d root of %d .
                """.formatted(nthRoot(n, m), n, m));
    }

}


