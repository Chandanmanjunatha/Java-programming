//Two sum
public class Two_sum {
    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " " + arr[j]);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("no such elements");
        }
    }
}

/*
 * // optimized
 * import java.util.HashSet;
 * 
 * public class A27 {
 * public static void main(String[] args) {
 * int n = 6;
 * int[] arr = { 1, 2, 3, 4, 5, 6 };
 * int target = 7;
 * 
 * HashSet<Integer> seenNumbers = new HashSet<>();
 * 
 * for (int i = 0; i < n; i++) {
 * int complement = target - arr[i];
 * if (seenNumbers.contains(complement)) {
 * System.out.println(complement + " " + arr[i]);
 * }
 * seenNumbers.add(arr[i]);
 * }
 * }
 * }
 */