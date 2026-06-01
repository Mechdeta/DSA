class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0, mins=prices[0];
        for(int sell:prices){
            maxp=Math.max(maxp,sell-mins);
            mins=Math.min(mins,sell);
        }
        return maxp;
    }
}