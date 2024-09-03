import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:");
        String s = sc.nextLine();
        char[] charArray = s.toCharArray(); // Convert string to a character array
        int j = charArray.length - 1;
        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            j--;
        }
        System.out.println(charArray);
        String reversedString = new String(charArray); // Create a new string from the reversed character array
        System.out.println(reversedString);
        sc.close();
    }
}
