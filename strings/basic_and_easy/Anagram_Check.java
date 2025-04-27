package strings.basic_and_easy;

public class Anagram_Check {

    static public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }

    public static void main(String args[]) {
        String Str1 = "INTEGER".toLowerCase();
        String Str2 = "TEGERNI".toLowerCase();
        System.out.println(isAnagram(Str1, Str2));
    }
}
