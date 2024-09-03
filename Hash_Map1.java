
//Isomorphic
import java.util.*;

public class Hash_Map1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string s1:");
        String s1 = sc.nextLine();
        System.out.print("enter string s2:");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("not isomorphic");
            return;
        }
        HashMap<Character, Character> m = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (m.containsKey(s1.charAt(i))) {
                if (m.get(s1.charAt(i)) != s2.charAt(i)) {
                    System.out.println("Not isomorphic");
                    return;
                }
            } else {
                if (m.containsValue(s2.charAt(i))) {
                    System.out.println("Not isomorphic");
                    return;
                }
            }
            m.put(s1.charAt(i), s2.charAt(i));

        }
        System.out.println("Isomorphic");
    }
}