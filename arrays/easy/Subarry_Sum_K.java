package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class Subarry_Sum_K {

    public static  void subArraySum(int arr[],int k){
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            map.put(sum,i);

            if(sum==k){
                System.out.println(0+" "+i);
            }
            if(map.containsKey(sum-k)){
                System.out.println(map.get(sum-k)+1+" "+i);
            }

        }
    }

    public static void main(String[] args) {

        subArraySum(new int[]{10,5,2,7,1,5},15);
    }
}
