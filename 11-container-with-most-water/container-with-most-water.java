class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int ans=0;

        while(i<j){
            int mini=Math.min(height[i],height[j]);
            int curr=mini*(j-i);
            ans=Math.max(ans,curr);
            if(height[i]<height[j]){
                i++;
            }else j--;
        }
        return ans;
    }
}