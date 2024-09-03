import java.util.Arrays;

public class Arr_op {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        removeElement(nums, val);
    }

    public static void removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        int[] arr = new int[index];
        for (int i = 0; i < index; i++) {
            arr[i] = nums[i];
        }
        System.out.println(index + ", nums = " + Arrays.toString(arr));
    }
}