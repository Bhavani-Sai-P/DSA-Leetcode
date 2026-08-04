class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int b=nums.length-1;
        while(a<b){
            if(nums[a]+nums[b]>target){
                b--;
            }
            else if(nums[a]+nums[b]<target){
                a++;
            }
            else{
                return new int[]{a+1,b+1};
            }
        }
        return new int[]{};
    }
}