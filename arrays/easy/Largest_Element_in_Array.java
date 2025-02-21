package arrays.easy;

public class Largest_Element_in_Array {

    public static int largest(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            min=(arr[i]>=min) ? arr[i]:min;
        }
        return min;

        //  return (Arrays.stream(arr).max().orElseThrow());

    }
    public static void main(String[] args) {
        int test[]={1,9,5,2,7,0};
        System.out.println(largest(test));
    }
}
