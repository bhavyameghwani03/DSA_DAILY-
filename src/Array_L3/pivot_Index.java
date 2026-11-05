package Array_L3;

public class pivot_Index {
    public  static int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sum;
            sum=sum+nums[i];

        }
        int sum1=0;
        for(int j=0;j<n;j++){

            if (sum1  == sum-arr[j] - nums[j]) {
                return j;

            }
            sum1=sum1+nums[j];
        }

        return-1;
    }

    static void main() {
        int[]nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}

