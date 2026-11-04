package Array_L3;

import java.util.Arrays;

public class product_of_array_exceptself {
    public  static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr= new int[n];
        int res=1;
        for(int i=0;i<n;i++){
            arr[i]=res;
            res=nums[i]*res;
        } res=1;
        for(int j=n-1;j>=0;j--){
            arr[j]=res*arr[j];
            res=nums[j]*res;

        }
        return  arr;
    }

    static void main() {
        int []nums ={1,2,3,4};
        int[] result =productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
