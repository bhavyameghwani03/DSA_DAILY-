package Array_L3;

public class pivot_Index {
    public  static int pivotIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){

            if(sum(nums,0,i-1)==sum(nums,i+1,nums.length-1)){
                return i;
            }
        }
        return -1 ;
    }
    public  static int sum(int[]arr,int a, int b){
        int sums=0;
        for(int i =a;i<=b;i++){
            sums=sums+arr[i];
        }
        return sums;
    }

    static void main() {
     int  [] nums ={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
