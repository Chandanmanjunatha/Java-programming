//array with one less element than size
/*import java.util.*;

public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("index:");
        int index = sc.nextInt();
        System.out.print("element:");
        int element = sc.nextInt();
        for (int i = n - 1; i >= index; i--) {
            if (i == index) {
                arr[i] = element;

            } else
                arr[i] = arr[i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
*/

//array with elemnts of length equal to size the we declare new array with length +1
import java.util.*;

public class Array_operation {

    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int index = 2;
        int Ele = 99;

        int[] newArray = new int[originalArray.length + 1];

        for (int i = 0, j = 0; i < originalArray.length; i++, j++) {
            if (j == index) {
                newArray[j++] = Ele;
            }
            newArray[j] = originalArray[i];
        }

        if (index == originalArray.length) {
            newArray[index] = Ele;
        }

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}