class Solution {
    public int largestAltitude(int[] nums) {
        int curr=0,ans=0;
        for(int i=0;i<nums.length;i++){
            curr=curr+nums[i];
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}