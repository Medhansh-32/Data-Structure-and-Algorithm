package arrays.medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {

    static ArrayList<Integer> leaders(int arr[]) {
        int max=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                ans.add(arr[i]);
            }
            max=Math.max(max,arr[i]);
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(leaders(new int[]{61,61,17}));
    }
}
