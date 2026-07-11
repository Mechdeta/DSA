class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        ArrayList<Boolean> ans=new ArrayList<>();
        int n=candies.length;
        for(int i:candies){
            max=Math.max(max,i);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max)ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}