package binary_search.binary_search_on_ans;

public class Kth_Missing_Number {

    public static int missingK(int[] arr ,int k) {
        int start=0,end=arr.length-1;

        while(start<=end){

            int mid=(start+end)/2;

            if(arr[mid]-(mid+1)<k){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        int temp=start;
        start=end;
        end=temp;

        int index=start==-1?1:arr[start];
        return index+(k-(index-(start+1)));

    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        int  k = 4;
        int ans = missingK(arr, k);
        System.out.println("The missing number is: " + ans);
    }
}
