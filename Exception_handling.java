/*define an arrat of integers. attemt to access an elementn at an index beyond the array's bounds.handle the 
ArrayIndexOutOfBoundsException that may occur.*/
public class Exception_handling {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };

        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

    }

}