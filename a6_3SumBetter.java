
import java.util.*;
public class a6_3SumBetter {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    public static List<List<Integer>> triplet(int n, int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> hashset=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(arr[i] + arr[j]);
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    set.add(temp);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
    
}



