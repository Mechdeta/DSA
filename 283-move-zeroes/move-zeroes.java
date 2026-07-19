class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0)count++;
        }
        int index=0,i=0;
        while(i<n){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
            i++;
        }
        i=n-count;
        while(i<n){
            nums[i++]=0;
        }
    }
}