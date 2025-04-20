package strings.basic_and_easy;

public class Largest_Odd_Number {
    public static String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("largest odd number is : "+largestOddNumber("352076"));
    }
}
