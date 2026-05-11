class Solution {
    public int maxProduct(int[] nums) {
        int pr=1,suff=1,ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pr==0)pr=1;
            if(suff==0)suff=1;
            pr*=nums[i];
            suff*=nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(pr,suff));
        }
        return ans;
    }
}