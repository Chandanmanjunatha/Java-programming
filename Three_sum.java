public class Three_sum {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 5, 4, -5, -7, -4, 0 };
        int c = 0;
        int count = 0;
        for (int i = c + 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] + arr[c] == 0) {
                    count++;
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[c]);
                    if (j == n - 1) {
                        c++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}
