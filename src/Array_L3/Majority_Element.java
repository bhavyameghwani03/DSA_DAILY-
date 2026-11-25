package Array_L3;

public class Majority_Element {
    public static  int majorityElement(int[] nums) {
        int ans=nums[0];
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans){
                c++;
            }else c--;
            if(c==0){
                ans=nums[i];
                c=1;
            }
        }
        return ans;

    }

    static void main() {
        int[] arr= {1,2,1,2,3,1,5,1,1,1};
        System.out.println(majorityElement(arr));
    }
}
