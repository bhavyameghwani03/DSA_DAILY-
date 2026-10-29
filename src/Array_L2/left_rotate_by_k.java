
package Array_L2;
import java.util.Arrays;
public  class left_rotate_by_k {
    public  static int[]  leftRotate(int arr[], int k) {
        for(int i =1;i<=k;i++){
            int first = arr[0];
            for(int j =0;j<arr.length-1;j++){
                arr[j]=arr[j+1];

            } arr[arr.length-1]=first;
        }
 return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(leftRotate(arr,2));
    }
}
