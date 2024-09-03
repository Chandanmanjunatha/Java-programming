//Method Over Loading

import java.util.Scanner;

public class Method_Over_Loading {
    public static int math(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public static int math(int x, int y, int z) {
        int mul = x * y * z;
        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x:");
        int x = sc.nextInt();
        System.out.print("enter y:");
        int y = sc.nextInt();
        System.out.print("enter z:");
        int z = sc.nextInt();
        int result = math(x, y);
        System.out.println("sum:" + result);
        int r = math(x, y, z);
        System.out.println("product:" + r);
        sc.close();

    }
}
