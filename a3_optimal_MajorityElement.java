public class a3_optimal_MajorityElement {
    public static void main(String args[]) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }

    public static int majorityElement(int arr[]) {
        int n = arr.length;
        int el = 0; // element
        int cnt = 0; // count

        // Applying Moore’s Voting Algorithm
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }
        // checking if the stored element
        // is the majority element:

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el) {
                count++;
            }
        }
        if (count > (n / 2)) {
            return el;
        }

        return -1;

    }

}
