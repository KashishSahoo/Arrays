public class a4_optimal_maxSumArr {
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    public static int maxSubarraySum(int arr[],int n){
        //KADANE'S ALGORITHM
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }

        }
        if(maxi<0){
            return 0;
        }
        return maxi;
    }
    
}
