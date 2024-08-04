import java.util.*;

public class a5_best_arrBySign {
    public static void main(String[] args) {
                // Array Initialization
                int n = 6;
                ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 7,9,4));
        
                ArrayList<Integer> ans = RearrangebySign(A, n);
        
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
            }
    public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> arr,int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0)
                pos.add(arr.get(i));
            else
                neg.add(arr.get(i));
        }
          // If positives are more than the negatives.
        if(pos.size()>neg.size()){
            for(int i=0;i<neg.size();i++){
                arr.set(2*i,pos.get(i));
                arr.set(2*i+1,neg.get(i));
            }
            // Fill the remaining positives at the end of the array.
            int idx=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                arr.set(idx,pos.get(i));
                idx++;
            }
        }
          // If positives are lesser than the negatives.
        else {

            // First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
            for (int i = 0; i < pos.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set(2 * i + 1, neg.get(i));
            }

            // Fill the remaining negatives at the end of the array.
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(index, neg.get(i));
                index++;
            }
        }
        return arr;    
   }
    
}

