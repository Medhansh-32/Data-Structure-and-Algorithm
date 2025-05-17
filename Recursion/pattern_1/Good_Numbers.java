package Recursion.pattern_1;

public class Good_Numbers {
    private static final int MOD = 1000000007;

    public static int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long result = (modPow(5, evenPositions) * modPow(4, oddPositions)) % MOD;

        return (int)result;
    }

    private  static  long modPow(long base, long exponent) {
        long result = 1;
        base = base % MOD;

        while (exponent > 0) {

            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }


            exponent = exponent / 2;


            base = (base * base) % MOD;
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(countGoodNumbers(10));
    }
}
