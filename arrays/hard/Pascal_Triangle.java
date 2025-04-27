package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pascal_Triangle {

    public static List<Integer> giveList(int row) {
        if (row == 1) {
            return Arrays.asList(1);
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int dig = 1;
        for (int i = 1; i < row; i++) {
            dig = dig * (row - i) / i;
            list.add(dig);
        }
        return list;
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            list.add(giveList(i));
        }
        return list;
    }

    public static void main(String[] args) {
        generate(6).stream()
                .forEach(x -> {
                    System.out.print(x);
                    System.out.println();
                });
    }
}
