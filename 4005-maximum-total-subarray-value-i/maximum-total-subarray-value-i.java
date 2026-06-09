class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int m=Integer.MAX_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int i:nums){
            m=Math.min(m,i);
            m2=Math.max(m2,i);
        }
        return (long)k*(m2-m);
    }
}