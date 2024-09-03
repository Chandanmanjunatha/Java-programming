
//Sliding window pattern: find max sum
import java.util.*;

public class Sliding_window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array value:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k value:");
        int k = sc.nextInt();
        if (k > n) {
            System.out.println("Invalid");
        } else {
            int max = -10000;
            for (int i = 0; i < n - k + 1; i++) {
                int sum = 0;
                for (int j = i; j < i + k; j++) {
                    sum += arr[j];
                }
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println("Max Sum:" + max);
        }
        sc.close();
    }
}
