
package Array_L2;
import java.util.Arrays;
public  class left_rotate_by_k {
    public static void leftRotate(int arr[], int k) {
        rev(arr, 0, k - 1);
        rev(arr, k, arr.length - 1);
        rev(arr, 0, arr.length - 1);
    }

    public static void rev(int arr[], int i, int j) {
        while (i <= j) {
            int a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
}
