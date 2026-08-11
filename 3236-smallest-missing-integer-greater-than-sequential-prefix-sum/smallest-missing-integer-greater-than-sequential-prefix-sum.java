class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]==nums[i]-1)sum+=nums[i];
            else break;
        }
        
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        while(set.contains(sum)){
            sum=sum+1;
        }
        return sum;
    }
}