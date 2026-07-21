class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length==1)return nums[0]/k;
        double ans=0;
        for(int i=0;i<k;i++){
            ans+=nums[i];
        }

        double sum=ans;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            ans=Math.max(sum,ans);
        }

        return ans/k;

    }
    
}