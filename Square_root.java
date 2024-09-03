
//Square root of a number: n=5 sq=2
import java.util.*;

public class Square_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("enter a valid number");
        } else {
            int sq = (int) Math.sqrt(n);
            System.out.println(sq);
        }
        sc.close();
    }
}