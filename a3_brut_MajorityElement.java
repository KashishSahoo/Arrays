public class a3_brut_MajorityElement {
    public static void main(String args[]) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
     //TC:O(n2)
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }
            if (cnt > (n / 2)) {
                return arr[i];
            }
        }
        return -1;

    }

}
