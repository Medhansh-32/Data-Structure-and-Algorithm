package binary_search.binary_search_1D_array;

public class Frequency_In_Sorted_Array {

    static public int countFreq(int[] arr, int target) {
        int freq=0;
        int first=-1;
        int i=0,j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<target){
                i=mid+1;
            }else if(arr[mid]>target){
                j=mid-1;
            }else{
                first=mid;
                j=mid-1;

            }
        }
        int last=-1;
        i=0;j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]<target){
                i=mid+1;
            }else if(arr[mid]>target){
                j=mid-1;
            }else{
                last=mid;
                i=mid+1;

            }
        }
        return last==-1 && first==-1?0:last-first+1;
    }

    public static void main(String[] args) {
        System.out.println("Target occurred "+countFreq(new int[]{1, 1, 2, 2, 2, 2, 3},2)+" times.");
    }
}
