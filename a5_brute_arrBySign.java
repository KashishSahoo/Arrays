import java.util.ArrayList;

public class a5_brute_arrBySign {
    public static void main(String args[]) 
{
  // Array Initialisation.
  int n = 6;
  int A[]= {1,2,-4,-5,-9,7};
  int[]ans= RearrangebySign(A,n);
  for (int i = 0; i < n; i++) {
    System.out.print(ans[i]+" ");
  }
}

    
  
  public static int[] RearrangebySign(int arr[],int n){
    // Define 2 vectors, one for storing positive 
   // and other for negative elements of the array.
    ArrayList<Integer> positive=new ArrayList<>();
    ArrayList<Integer> negative=new ArrayList<>();


     // Segregate the array into positives and negatives.
    for(int i=0;i<n;i++){
        if(arr[i]>0){
            positive.add(arr[i]);
        }
        else{
            negative.add(arr[i]);
        }
    }
   // Positives on even indices, negatives on odd.

    for(int i=0;i<n/2;i++){
        arr[2*i]=positive.get((i));
        arr[2*i+1]=negative.get((i));
    }
    return arr;

}
    
}

