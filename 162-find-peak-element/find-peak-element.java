class Solution {
    public int findPeakElement(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(i!=0 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                return i;
            }
        }
        if(ans==0){
            if(nums[0]>nums[nums.length-1])ans=0;
            else ans=nums.length-1;
        }
        return ans;
    }
}