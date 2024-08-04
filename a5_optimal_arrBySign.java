import java.util.*;

public class a5_optimal_arrBySign {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,-4,-5,-9,7));
        ArrayList<Integer> ans= RearrangebySign(arr);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> arr){
        int n=arr.size();
        ArrayList<Integer> ans= new ArrayList<>(arr);
        
        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for(int i=0;i<n;i++){
            // Fill negative elements in odd indices and inc by 2.
            if(arr.get(i)<0){
                ans.set(negIndex,arr.get(i));
                negIndex+=2;
            }
            else {
                 // Fill positive elements in even indices and inc by 2.
                ans.set(posIndex, arr.get(i));
                posIndex += 2;
            }

        }
        return ans;


    }
    
}


