//reverse the sentense

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter sentence:");
        String s = sc.nextLine();
        int c = 0;
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                st.push(s.substring(c, i));
                c = i + 1;
            } else if (i == s.length() - 1) {
                st.push(s.substring(c, i + 1));
            }
        }
        for (int i = st.size() - 1; i >= 0; i--) {
            System.out.print(st.elementAt(i) + " ");
        }

        sc.close();
    }

}
