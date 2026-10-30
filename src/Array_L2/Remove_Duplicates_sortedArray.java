package Array_L2;

public class Remove_Duplicates_sortedArray {
    public  static int removeDuplicates(int[] nums) {
        int i =0;
        int j =0;
        while(j<nums.length){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j];
            }j++;
        }
        return i+1;
    }

    static void main() {
         int[] nums = {0,0,0,1,1,1,2,2,2,4,4,4,5,5,5};
        System.out.println(removeDuplicates(nums));
    }
}
