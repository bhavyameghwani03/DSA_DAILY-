package Array_L2;

import java.util.Arrays;

public class Sort_Colors {
    public  static void sortColors(int[] nums) {
        int s=0 ;
        int m=0;
        int e=nums.length-1;
        while(e>=m){
            if(nums[m]==0){
                swap(nums,m++,s++);
            }
            else if(nums[m]==2){
                swap(nums,m,e--);
            }else m++;
        }
    }
    public  static void swap(int[]arr,int v,int n){
        int c=arr[n];
        arr[n]=arr[v];
        arr[v]=c;
    }

    static void main() {
        int [] num = {0,2,1,0,1,2,0,0,1};
        sortColors(num);
        System.out.println(Arrays.toString(num));
    }
}
