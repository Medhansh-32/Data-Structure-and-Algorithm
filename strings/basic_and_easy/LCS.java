package strings.basic_and_easy;

import java.util.Arrays;

public class LCS {

        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            String ans="";
            for(int i=0;i<strs[0].length();i++){
                if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                    break;
                }
                ans+=strs[0].charAt(i);
            }

            return ans;
        }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

}
