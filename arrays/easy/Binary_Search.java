package arrays.easy;

public class Binary_Search {

    static int search(int arr[],int s,int e,int k){
        int mid=(s+e)/2;
        if(s>e){
            return -1;
        }
        if(k>arr[mid]){
            return search(arr,mid+1,e,k);
        }else if(k<arr[mid]){
            return search(arr,s,mid-1,k);
        }else{
            return mid;
        }
    }

    static boolean searchInSorted(int arr[], int k) {
        //   for(int i=0;i<arr.length;i++){
        //      if(arr[i]==k){
        //          return true;
        //      }
        //   }

        //     return false;
        return  search(arr,0,arr.length-1,k)==-1?false:true;


    }
    public static void main(String[] args) {
        System.out.println(searchInSorted(new int[]{1,2,3,4,5,6,7,8,9},9));
        System.out.println(searchInSorted(new int[]{1,2,3,4,5,6,7,8,9},11));
    }
}
