import java.util.Arrays;

public class Array_copy {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        int p = 6;
        int[] A = { 1, 2, 3, 4 };
        int[] B = { 1, 2, 3, 4, 5 };
        int[] C = { 1, 2, 3, 4, 5, 6 };
        int[] D = new int[n + m + p];
        System.arraycopy(A, 0, D, 0, n);
        System.arraycopy(B, 0, D, n, m);
        System.arraycopy(C, 0, D, n + m, p);
        Arrays.sort(D);
        System.out.println(Arrays.toString(D));

    }
}
