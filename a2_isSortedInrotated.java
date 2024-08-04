public class a2_isSortedInrotated {
    public static void main(String args[]) {
        int arr[] = { 3, 4, 5,1,2};
    
        System.out.println(isSortedRotated(arr));
      }

      static boolean isSortedRotated(int[] arr){
        int count=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                count++;
            }
        }
        if(arr[n-1]>arr[0]){
            count++;
        }
        return count==1;
      }
}
