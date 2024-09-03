
/*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/

/* 
public class A17 {
    public static void main(String[] args) {
        int n = 9;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == n / 2 || j == n / 2) {
                    System.out.println(a[i][j] + "*");
                } else {
                    System.out.println(a[i][j] + " ");
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
*/
public class Diamond_pattern {
    public static void main(String[] args) {
        int n = 5; // height of the diamond (you can change this value to make a bigger or smaller
                   // diamond)

        // Upper part of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
