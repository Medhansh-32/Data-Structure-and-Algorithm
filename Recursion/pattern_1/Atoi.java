package Recursion.pattern_1;

public class Atoi {



        public static String number(String s, int i, StringBuilder ans) {
            if (!ans.toString().equals("") && !ans.toString().equals("-") && !ans.toString().equals("+")) {
                Double d = Double.parseDouble(ans.toString());
                if (d >= Integer.MAX_VALUE) {
                    return String.valueOf(Integer.MAX_VALUE);
                }
                if (d <= Integer.MIN_VALUE) {
                    return String.valueOf(Integer.MIN_VALUE);
                }
            }

            if (i == s.length()) {
                return ans.toString();
            }

            char dig = s.charAt(i);
            if (dig == '0' ||
                    dig == '1' ||
                    dig == '2' ||
                    dig == '3' ||
                    dig == '4' ||
                    dig == '5' ||
                    dig == '6' ||
                    dig == '7' ||
                    dig == '8' ||
                    dig == '9') {

                ans.append(dig);
                i++;

                return number(s, i, ans);

            } else if (ans.toString().equals("") && (dig == '+' || dig == '-')) {
                ans.append(dig);
                i++;
                return number(s, i, ans);

            } else if (ans.toString().equals("") && (dig == ' ' || dig == '0')) {
                i++;
                return number(s, i, ans);
            } else {
                return ans.toString();
            }
        }

        public static int myAtoi(String s) {
            s = s.trim();

            String ans = number(s, 0, new StringBuilder());

            if (ans.equals("") || ans.equals("-") || ans.equals("+")) {
                return 0;
            }
            if (ans.charAt(0) == '+') {
                return Integer.parseInt(ans.substring(1));
            }
            return Integer.parseInt(ans);
        }


    public static void main(String[] args) {
        String num="12345-3";
        System.out.println(myAtoi(num));
    }
}
