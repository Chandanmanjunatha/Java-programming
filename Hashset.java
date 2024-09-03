import java.util.*;

public class Hashset {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string:");
        String s = sc.nextLine();
        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }
        if (set.size() == 26) {
            System.out.println("1");
        } else
            System.out.println("0");

        sc.close();
    }

}
