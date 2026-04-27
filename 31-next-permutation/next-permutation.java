class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-1;
        while(i>0&&nums[i-1]>=nums[i]){
            i--;
        }
        if(i==0){
            reverse(nums,0,n-1);
            return;
        }
        int j=n-1;
        while(j>=i&&nums[i-1]>=nums[j]){
            j--;
        }
        swap(nums,i-1,j);
        reverse(nums,i,n-1);
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}