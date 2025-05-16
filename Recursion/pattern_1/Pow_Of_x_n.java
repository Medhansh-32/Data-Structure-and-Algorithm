package Recursion.pattern_1;

public class Pow_Of_x_n {

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;

        double ans = myPow(x, n / 2);

        if (n % 2 == 0) {
            return ans * ans;
        } else {
            double multiplier=n<0?1/x:x;
            return ans * ans * multiplier;
        }
    }

    public static void main(String[] args) {

        System.out.println(myPow(2.0, 3));
        System.out.println(myPow(2.0, -3));
        System.out.println(myPow(2.0, -2));

    }
}
