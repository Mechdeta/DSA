class Solution {
    public boolean check(int[] nums) {
        int min=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i])min=i;
        }
        for(int i=min;i<min+n-1;i++){
            if(nums[(i%n)]>nums[(i+1)%n])return false;
        }
        return true;
    }
}