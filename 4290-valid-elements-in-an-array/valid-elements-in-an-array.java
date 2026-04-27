class Solution {
    public List<Integer> findValidElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        if(n==1){
            ans.add(nums[0]);  
            return ans;
        }
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(nums[i-1],left[i-1]);
        }
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(nums[i+1],right[i+1]);
        }
        for(int i=0;i<n;i++){
            if(i==0||i==n-1||nums[i]>right[i]||nums[i]>left[i])ans.add(nums[i]);
        }
        return ans;
    }
}