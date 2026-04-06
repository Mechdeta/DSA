class Solution {
    public int maxProduct(int[] nums) {
        int maxprod=nums[0];
        int minprod=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            int curr=nums[i];

            int temp=maxprod;

            maxprod=Math.max(curr,Math.max(curr*maxprod,curr*minprod));
            minprod=Math.min(curr,Math.min(curr*temp,curr*minprod));
            res=Math.max(res,maxprod);
        }
        return res;
    }
}