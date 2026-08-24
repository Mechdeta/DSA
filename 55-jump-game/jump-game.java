class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1)return true;
        int i=n-2,g=n-1;
        while(i>=0){
            if(i+nums[i]>=g)g=i;
            i--;
        }
        return g==0;
    }
}