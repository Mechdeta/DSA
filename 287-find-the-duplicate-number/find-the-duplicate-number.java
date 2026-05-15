class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] len=new int[n+1];
        for(int i=0;i<n;i++){
            len[nums[i]]++;
            if(len[nums[i]]>1)return nums[i];
        }
        return n;
    }
}