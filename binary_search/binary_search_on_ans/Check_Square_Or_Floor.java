package binary_search.binary_search_on_ans;

public class Check_Square_Or_Floor {

    static  int floorSqrt(int n) {

        int org=n;
        int low=1;
        int ans=0;
        if (n*n==n) return n;

        while(low<=n){
            int mid=(low+n)/2;

            if(mid*mid==org) return mid;

            if(mid*mid>org){
                n=mid-1;
            }else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Square root or nearest number to square root is : "+floorSqrt(74));

    }
}
