/*
 Array insert at end:
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array_insert_at_end {
    public static void main(String[] args) {
        int n = 6;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 11;
        arr[n - 1] = k;
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}