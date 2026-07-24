class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int right=0,j=n-1,left=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        
        for(int i=0;i<n;i++){
            right=sum-left-nums[i];
            if(left==right)return i;
            left+=nums[i];
        }
        return -1;
    }
}