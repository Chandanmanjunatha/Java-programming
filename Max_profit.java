import java.util.Scanner;

public class Max_profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of days:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter stock prices:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int low = arr[0];
        int high = arr[0];
        for (i = 0; i < n; i++) {
            if (arr[i] < low) {
                low = arr[i];
                i++;
            } else
                i++;
        }
        for (int j = 0; j > i; i++) {
            if (arr[i] > high) {
                high = arr[j];
            }
        }
        int profit = high - low;
        if (profit > 0) {
            System.out.println("max profit:" + profit);
        } else {
            System.out.println("0");
        }
        sc.close();
    }

}