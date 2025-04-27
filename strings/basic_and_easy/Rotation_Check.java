package strings.basic_and_easy;

public class Rotation_Check {
    static public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);

    }

    public static void main(String[] args) {
        String s = "abcd";
        String goal = "abcd";
        System.out.println(rotateString(s, goal));
    }
}
