import java.util.*;

public class a3_better_MajorityElement {
    public static void main(String args[]) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    public static int majorityElement(int[] arr) {
        int n = arr.length;

        // declaring a map:
        HashMap<Integer, Integer> map = new HashMap<>();

        // storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }
        // searching for majority element
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();

            }

        }
        return -1;
    }
}
