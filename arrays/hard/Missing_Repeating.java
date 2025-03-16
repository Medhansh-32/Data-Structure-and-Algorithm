package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class Missing_Repeating {
    public static ArrayList<Integer> findMissingRepeatingNumbers(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        long n=arr.length;
        long sum=0;
        long sumOrg=(n*(n+1))/2;
        long sqrSum=0;;
        for(int i=0;i<arr.length;i++){
            sum+=(long)arr[i];
            sqrSum+=(long)arr[i]*arr[i];
        }

        long sqrSumOrg=(n*(n+1)*(2*n+1))/6;


        long x_y=(long)sumOrg-sum;
        long x2_y2=(long)sqrSumOrg-sqrSum;

        long xPlusy=x2_y2/x_y;

        long missing=(xPlusy+x_y)/2;

        long repeating=xPlusy-missing;

        list.add((int)repeating);
        list.add((int)missing);

        return  list;

    }

    public static void main(String[] args) {
        int[] a = {3, 1, 2, 5, 4, 6, 7, 5};
        var ans =(List<Integer>) findMissingRepeatingNumbers(a);
        System.out.println("The repeating and missing numbers are: {"
                + ans.get(0) + ", " + ans.get(1) + "}");
    }
}
