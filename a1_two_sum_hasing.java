import java.util.*;
public class a1_two_sum_hasing {

    public static String twoSumAns(int arr[],int n,int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int num=arr[i];
            int moreNeed=target-num;
            if(map.containsKey(moreNeed)){
                return "true";
            }
            map.put(arr[i],i);
        }
        return "no";
    }

    public static int [] twoSumIdx(int arr[],int n,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] ans=new int[2];
        ans[0]=ans[1]=-1;
        for(int i=0;i<n;i++){
            int num=arr[i];
            int moreNeed=target-num;
            if(map.containsKey(moreNeed)){
                ans[0]=map.get(moreNeed);
                ans[1]=i;
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }








    public static void main(String args[]) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        String ans = twoSumAns(arr, n, target);
        System.out.println("This is the answer for variant 1: " + ans);
    }

}
