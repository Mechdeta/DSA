class Solution {
    public int maxSubArray(int[] nums) {
        
        int ans=Integer.MIN_VALUE,curr=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
            if(curr<0){
                ans=Math.max(ans,curr);
                curr=0;
            }else
            ans=Math.max(curr,ans);
        }
        return ans;
    }
}