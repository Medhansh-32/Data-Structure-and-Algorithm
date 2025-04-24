package strings.basic_and_easy;

public class Reverse_Words {

    public static String reverseWords(String s) {

        char prev = ' ';
        StringBuilder st = new StringBuilder("");
        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            if (prev == ' ' && s.charAt(i) == ' ') {
                continue;
            } else if (prev != ' ' && s.charAt(i) == ' ') {

                st.append(' ');
                ans = st + ans;

                st = new StringBuilder("");
                prev = ' ';

            } else {
                st.append(s.charAt(i));
                prev = s.charAt(i);

            }

        }

        if (st.length() != 0) {
            st = st.length() > 1 && st.charAt(st.length() - 1) == ' ' ? st : st.append(' ');

            ans = st + ans;

        }
        return ans.substring(0, ans.length() - 1);

    }

    public static void main(String[] args) {
        String st = "TUF is great for interview preparation";
        System.out.println("Before reversing words: ");
        System.out.println(st);
        System.out.println("After reversing words: ");
        System.out.print(reverseWords(st));
    }


}
