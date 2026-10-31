package Array_L2;
import java.util.Arrays;
public   class duplicateZeros {
    public  static void duplicate(int[] arr) {
        int  n = arr.length-1;
        int i =0 ;
        while(n>=i){
            if (arr[i] == 0) {
                if (i < n) {
                    for (int j = n; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[i + 1] = 0;
                    i++;
                }
            }
            i++;
        }
    }

    static void main() {
        int[] arr ={1,0,2,3,0,4,5,0};
        duplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
